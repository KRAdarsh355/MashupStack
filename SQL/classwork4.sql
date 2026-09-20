insert into books(book_id,title,author,price,stock)
values(1, 'Learn SQL', 'John Smith', 400, 10),
(2, 'Mastering Python', 'Jane Doe', 600, 5),
(3, 'HTML & CSS Basics', 'Alan Webb', 300, 8);

update books set price=price+50,stock=12 where title='Learn SQL';

update books set stock=stock-2 where price>500;

delete from books where book_id=3;