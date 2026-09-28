use mashup;
create table books(book_id int,title text);
insert into books values(1,'The Alchemist'),(2,'The Power of Now'),(3,'Think and Grow Rich'),(4,'Clean Code');
create table borrowers(borrower_id int,name text,book_id int null);
insert into borrowers values(101,'Alice',1),(102,'Bob',2),(103,'Charlie',NULL);
select books.title,borrowers.name from books left join borrowers on  books.book_id=borrowers.book_id;
select borrowers.name,books.book_id,books.title from books right join borrowers on books.book_id=borrowers.book_id;
select books.title from books left join borrowers on books.book_id=borrowers.book_id where borrowers.book_id is null;
select borrowers.name from books right join borrowers on books.book_id=borrowers.book_id;
