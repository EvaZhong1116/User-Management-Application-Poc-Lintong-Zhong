DROP TABLE IF EXISTS employee;
DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS authorities;

CREATE TABLE employee (
	empId VARCHAR(10) NOT NULL,
	empName VARCHAR(100) NOT NULL
);

insert into employee values ('1010', 'John');
insert into employee values ('1010', 'Johnny');
insert into employee values ('1010', 'janardhan');

create table users (
	username varchar(50) not null primary key,
	password varchar(120) not null,
	enabled boolean not null
);

create table authorities (
	username varchar(50) not null,
	authority varchar(50) not null,
	foreign key (username) references users (username)
);

insert into users(username, password,enabled) values('employee','emp',true);
insert into users(username, password,enabled) values('admin','admin',true);

insert into authorities(username,authority) values('admin','ROLE_ADMIN');
insert into authorities(username,authority) values('admin','ROLE_USER');
insert into authorities(username,authority) values('employee','ROLE_USER');



Error Code: 1452. Cannot add or update a child row: a foreign key constraint fails (`security_mayjun2023`.`authorities`, CONSTRAINT `authorities_ibfk_1` FOREIGN KEY (`username`) REFERENCES `users` (`username`))
