insert ignore into `springsecurity`.`user`(`id`, `username`, `password`, `algorithm`) values('1', 'john', '$2a$10$XB0nHU373YE93co.7sbsDOMf0j9Kf8Q7H1.zjg4fCSPTCf4g1hyta', 'BCRYPT');

insert ignore into `springsecurity`.`authority`(`id`, `name`, `user`) values('1', 'READ', '1');
insert ignore into `springsecurity`.`authority`(`id`, `name`, `user`) values('2', 'WRITE', '1');

insert ignore into `springsecurity`.`product`(`id`, `name`, `price`, `currency`) values('1', 'Chocolate', '10', 'USD');

