use mashup;
create table movies(id int,title text,genre text,release_year int,rating float,box_office bigint);
insert into movies values(1, 'Inception', 'Sci-Fi', 2010, 8.8, 825),
(2, 'The Dark Knight', 'Action', 2008, 9.0, 1004),
(3, 'Interstellar', 'Sci-Fi', 2014, 8.6, 677),
(4, 'Joker', 'Drama', 2019, 8.4, 1074),
(5, 'Dunkirk', 'War', 2017, 7.9, 527);
select title,box_office as Earnings from movies;
select title as MovieTitle,genre as Category from movies;
select id,title,genre,release_year,rating as IMDb_Score,box_office from movies where genre in('Sci-Fi','Action');
select id,title,genre,release_year as `Release`,rating,box_office from movies where release_year between 2008 and 2015;
select count(*) from movies where rating>8.5;