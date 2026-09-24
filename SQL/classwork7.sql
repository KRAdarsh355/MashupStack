use mashup;
create table students(id int,`name` text,course text,score int,email text,phone text,city text,bonus_point int null);
insert into students values(1, 'Asha', 'Python', 85, 'asha@mail.com', '9876543210', 'Chennai', 5),
(2, 'Ravi', 'Python', 90, 'ravi@mail.com', '9876543211', 'Chennai', NULL),
(3, 'Sneha', 'Java', 78, 'sneha@mail.com', '9876543212', 'Mumbai', NULL),
(4, 'Karan', 'Java', 88, 'karan@mail.com', '9876543213', 'Delhi', 2),
(5, 'Divya', 'Python', 95, 'divya@mail.com', '9876543214', 'Mumbai', 4),
(6, 'Manoj', 'JavaScript', 72, 'manoj@mail.com', '9876543215', 'Delhi', NULL);
select course as 'Course Name',count(*) as 'Number of students' from students group by course;
select course,avg(score) from students group by course having avg(score)>80;
select name,score from students where city in('Mumbai','Chennai');
select * from students where bonus_point is null;
select name from students where city='Chennai' union select name from students where city='Mumbai';
