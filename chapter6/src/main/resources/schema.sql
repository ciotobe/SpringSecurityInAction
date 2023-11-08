create table if not exists `springsecurity`.`user`(
	`id` int not null auto_increment,
	`username` varchar(45) not null,
	`password` text not null,
	`algorithm` varchar(45) not null,
	primary key (`id`)
);

create table if not exists `springsecurity`.`authority`(
	`id` int not null auto_increment,
	`name` varchar(45) not null,
	`user` int not null,
	primary key (`id`)
);

create table if not exists `springsecurity`.`product`(
	`id` int not null auto_increment,
	`name` varchar(45) not null,
	`price` varchar(45) not null,
	`currency` varchar(45) not null,
	primary key (`id`)
);