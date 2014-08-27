create table quote (
	id identity,
	quotation varchar(1000) not null,
	author varchar(100) not null,
);


insert into quote (quotation, author) values ('The hardest thing in the world to understand is the income tax.', 'Albert Einstein');	
insert into quote (quotation, author) values ('The only thing that interferes with my learning is my education.', 'Albert Einstein');
insert into quote (quotation, author) values ('I am convinced that He (God) does not play dice.', 'Albert Einstein');


insert into quote (quotation, author) values ('PATHs suck', 'Sam Griffith');
insert into quote (quotation, author) values ('Very Cool', 'Sam Griffith');


SELECT * FROM QUOTE WHERE ID = IDENTITY();


select quotation, author from quote;