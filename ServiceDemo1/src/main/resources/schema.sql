create table if not exists t_user(
	id int(11) primary key auto_increment,
	username varchar(32),
	password varchar(32),
	age int(3),
	sex int(1),
	birthday date ,
	created TIMESTAMP default CURRENT_TIMESTAMP,
	updated TIMESTAMP,
	note varchar(255)
);
