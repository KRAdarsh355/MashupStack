insert into products(id, name, category, price, in_stock) 
VALUES (1,'Pencil','Stationary',5,'Yes'),
(2,'Pen','Stationary',10,'Yes'),
(3,'Laptop','Electronics',65000,'No'),
(4,'Powder','Cosmetics',300,'Yes'),
(5,'Mobiles','Electronics',20000,'Yes');

select distinct category from products;

select * from products where price>500 AND in_stock='yes';

select * from products where price>1000 AND in_stock<>'yes';

select name,price from products order by price desc;

select name, price+price*0.18 as price_with_tax from products;