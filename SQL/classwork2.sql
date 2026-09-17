INSERT INTO `students`(`id`, `name`, `age`, `department`, `grade`) 
VALUES (1,'Dave',18,'CSE',86),
(2,'Liya',17,'CSE',66),
(3,'Jon',19,'ECE',74),
(4,'Mikey',18,'Mech',81),
(5,'Patrick',18,'IT',69);

SELECT * FROM `students` WHERE age>20

SELECT * FROM `students` WHERE department='CSE' OR department="Physics"

SELECT name FROM `students` WHERE grade=90;

SELECT name FROM `students` WHERE grade BETWEEN 70 AND 90;