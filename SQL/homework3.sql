insert into books2(id,title,author,price,stock_status,genre) 
values(1,'Daydreamers','Ackleson',799,'In stock','Sci-fi'),
(2,'Fly','Walter White',670,'Out of stock','Comedy-drama'),
(3,'The Great War','Thomas Pot',500,'In stock','History'),
(4,'Freedom Fighters','Nehru',800,'In stock','History'),
(5,'Horses and Cats','Wayne Rigsby',600,'Out of stock','Comedy-drama')

select distinct genre from books2;

select * from books2 where price<400 AND stock_status='In stock';

select * from books2 where price>700 OR stock_status='Out of stock';

select title,price,price+price*0.1 as Price_with_GST from books2;

select title,price,stock_status from books2 order by price desc;