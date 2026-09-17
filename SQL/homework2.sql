INSERT INTO `books`
(`id`, `title`, `author`, `price`, `genre`) VALUES 
(1,'Don Quixote','Miguel de Cervantes',500,'Classic'),
(2,'To Kill a Mocking Bird','Harper Lee',650,'Gothic'),
(3,'The DaVinci Code','Dan Brown',710,'Mystery Thriller'),
(4,'Atomic Habits','James Clear',790,'Self-improvement Guide'),
(5,'The Alchemist','Paulo Coelho',900,'Fable')


SELECT `title` FROM `books` WHERE price>400;

SELECT  `title `FROM `books` WHERE genre IN('History','Science','Fiction');

SELECT `title` FROM `books` WHERE title='The Great Gatsby';

SELECT `title` FROM `books` WHERE author!='Dan Brown';