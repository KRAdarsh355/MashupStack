use mashup;
create table authors(author_id int,author_name text,email_address varchar(255) unique,primary key(author_id));
create table books(book_id int primary key,book_title text,author_id int,
foreign key(author_id) references authors(author_id));