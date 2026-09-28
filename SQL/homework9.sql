use mashup;
create table employees(id int,name text);
insert into employees values(1,'Anjali'),(2,'Rohan'),(3,'Meena');
create table departments(emp_id int,department_name text);
insert into departments values(1,'HR'),(2,'IT'),(4,'Finance');
select employees.*,departments.department_name from employees left join departments on employees.id=departments.emp_id;
select employees.* from employees right join departments on employees.id=departments.emp_id;
select * from employees left join departments on employees.id=departments.emp_id 
union select * from employees right join departments on employees.id=departments.emp_id;