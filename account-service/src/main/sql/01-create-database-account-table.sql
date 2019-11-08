CREATE DATABASE IF NOT EXISTS account-service;
USE account-service;

DROP TABLE IF EXISTS account;

CREATE TABLE account (
  id int(12) NOT NULL AUTO_INCREMENT,
  customer_id int(12) NOT NULL,
  account_number varchar(45) NOT NULL,
  account_type varchar(45) NOT NULL,
  balance double NOT NULL,
  date_created DATETIME NOT NULL,
  date_modified DATETIME NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;


insert into  account (customer_id,account_number,account_type,balance,date_created,date_modified)
value (1001,'ACC0001','CURRENT','500.00',curdate(),curdate());

insert into  account (customer_id,account_number,account_type,balance,date_created,date_modified)
value (1002,'ACC0002','SAVINGS','500.00',curdate(),curdate());

insert into  account (customer_id,account_number,account_type,balance,date_created,date_modified)
value (1003,'ACC0003','CURRENT','500.00',curdate(),curdate());

insert into  account (customer_id,account_number,account_type,balance,date_created,date_modified)
value (1004,'ACC0004','SAVINGS','600.00',curdate(),curdate());

insert into  account (customer_id,account_number,account_type,balance,date_created,date_modified)
value (1005,'ACC0005','CURRENT','800.00',curdate(),curdate());

insert into  account (customer_id,account_number,account_type,balance,date_created,date_modified)
value (1006,'ACC0006','SAVINGS','900.00',curdate(),curdate());

insert into  account (customer_id,account_number,account_type,balance,date_created,date_modified)
value (1007,'ACC0007','CURRENT','500.00',curdate(),curdate());

insert into  account (customer_id,account_number,account_type,balance,date_created,date_modified)
value (1008,'ACC0008','SAVINGS','1500.00',curdate(),curdate());

insert into  account (customer_id,account_number,account_type,balance,date_created,date_modified)
value (1009,'ACC0009','CURRENT','1200.00',curdate(),curdate());

insert into  account (customer_id,account_number,account_type,balance,date_created,date_modified)
value (10010,'ACC00010','SAVINGS','1400.00',curdate(),curdate());

insert into  account (customer_id,account_number,account_type,balance,date_created,date_modified)
value (10011,'ACC00011','CURRENT','2000.00',curdate(),curdate());



