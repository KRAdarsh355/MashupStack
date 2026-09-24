use mashup;
create table users(id int,name text,city text,score int,bonus int null,challenge text);
insert into users values(1,'Raj','Chennai',88,5,'Fitness'),
(2,'Anu','Mumbai',91,null,'Diet'),
(3,'Ravi','Chennai',78,3,'Fitness'),
(4,'Meena','Delhi',82,null,'Diet'),
(5,'Farah','Mumbai',95,4,'Fitness'),
(6,'Kiran','Pune',70,null,'Yoga'),
(7,'Latha','Pune',87,null,'Fitness');
select * from users where score>(select avg(score) from users);
select name from users where challenge=(select challenge from users where name='Farah');
