create table quotes (
	id identity,
	quotation varchar(1000) not null,
	author varchar(100) not null,
);

create table users (id IDENTITY, 
					username varchar(30) not null, 
					password varchar(20) not null);


insert into quotes (quotation, author) values ('The hardest thing in the world to understand is the income tax.', 'Albert Einstein');	
insert into quotes (quotation, author) values ('The only thing that interferes with my learning is my education.', 'Albert Einstein');
insert into quotes (quotation, author) values ('I am convinced that He (God) does not play dice.', 'Albert Einstein');
insert into quotes (quotation, author) values ('PATHs suck', 'Sam Griffith');
insert into quotes (quotation, author) values ('Very Cool', 'Sam Griffith');

insert into users (username, password) values ('sam', 'abcd');


SELECT * FROM QUOTES WHERE ID = IDENTITY();


select quotation, author from quotes;

select quotation, author from quotes;
select * from users;

select password, id, username from users;
