create database GroceryShop;
use GroceryShop;
create table products(product_id int,product_name text,price int);
alter table products add column (category text);
truncate table products;
drop database GroceryShop;