create table if not exists `springsecurity`.`user`(
	`username` varchar(45) not null,
	`password` text null,
	primary key (`username`)
);

create table if not exists `springsecurity`.`otp`(
	`username` varchar(45) not null,
	`code` varchar(45) null,
	primary key (`username`)
);