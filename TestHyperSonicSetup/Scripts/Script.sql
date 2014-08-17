create table people (person_id int, name varchar(100), age int);
create table cars (name varchar(100), make varchar(50), owner_id int);

insert into people (person_id, name, age) values (1, 'sam', 46);
insert into people (person_id, name, age) values (2, 'Bill', 22);
insert into people (person_id, name, age) values (3, 'Sally', 33);
insert into people (person_id, name, age) values (4, 'Jill', 56);
insert into people (person_id, name, age) values (5, 'Timmy', 15);
insert into people (person_id, name, age) values (6, 'Timmy', 18);

insert into cars (name, make, owner_id) values ('Vroomer', 'Chevy Impala', 1);
insert into cars (name, make, owner_id) values ('Zoomby', 'Honda Accord', 2);
insert into cars (name, make, owner_id) values ('Jolly Green Giant', 'Ford Mustang', 1);
insert into cars (name, make, owner_id) values ('Orange Buster', 'Nissan 300Z', 3);
insert into cars (name, make, owner_id) values ('Alien Traffic', 'Ferrari', 4);
insert into cars (name, make, owner_id) values ('Moon Shot', 'Porsche', 5);

select * from people where age < 40;
select name from people where age < 20;
select name, age from people where name = 'Sally' OR name = 'Jill';

--drop table people

insert into cars (name, make) values ('Bad Mama Jama', 'Homebrew');


select * from cars where owner_id = 1;
select * from people where person_id = 1;

select * from cars where name like 'V%';

insert into cars (name, make, owner_id) values ('Veranda Express', 'CaliStyle', 2);

select * from cars where name like '%oo%';
select * from cars where name NOT like '%oo%';

select distinct name from people order by name;

select name from people order by name asc;
select name from people order by name desc;
select name from people;

select name, person_id from people where person_id BETWEEN 2 AND 4;

-- SELECT Orders.OrderID, Customers.CustomerName, Orders.OrderDate
-- FROM Orders
-- INNER JOIN Customers
-- ON Orders.CustomerID=Customers.CustomerID;

select people.name, people.age, cars.name, cars.make
from people
inner join cars
on people.PERSON_ID=cars.OWNER_ID;

-- Updates
update people
set name='Terky', age=145
where name='sam';

