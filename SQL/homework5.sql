use mashup;
create table books(id int,title text,author text,price int,stock int);
insert into books values(1, 'The Alchemist', 'Paulo Coelho', 350, 50),
(2, 'Atomic Habits', 'James Clear', 450, 40),
(3, 'The Psychology of Money', 'Morgan Housel', 400, 30),
(4, 'Ikigai', 'Francesc Miralles', 300, 60),
(5, 'Deep Work', 'Cal Newport', 500, 20);
select * from books where price<450 and stock>30;
update books set price=420,stock=45 where title='Deep Work';
delete from books where title='Ikigai';
select avg(price),count(*) from books;
select * from books order by price desc limit 3;