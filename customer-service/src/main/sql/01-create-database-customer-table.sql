CREATE DATABASE IF NOT EXISTS customer-service;
USE customer-service;

DROP TABLE IF EXISTS customer;

CREATE TABLE customer (
  id int(12) NOT NULL AUTO_INCREMENT,
  customer_id varchar(45) NOT NULL,
  name varchar(45) NOT NULL,
  customer_type varchar(45) NOT NULL,
  account_number varchar(45) NOT NULL,
  phone_number varchar(30),
  email_address varchar(255),
  date_joined DATETIME NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

insert into  customer (id,customer_id,name, customer_type,account_number,phone_number, email_address, date_joined)
value (1001,'C0001','Iyla Knapp','INDIVIDUAL','ACC0001','12345678','iyla@email.com', curdate());

insert into  customer (id,customer_id,customer_type,account_number,phone_number, email_address, date_joined)
value (1002,'C0002','Preston Rangel','INDIVIDUAL','ACC0002','18721312','preston@email.com', curdate());

insert into  customer (id,customer_id,customer_type,account_number,phone_number, email_address, date_joined)
value (1003,'C0002','Preston Rangel','INDIVIDUAL','ACC0003','83671024','preston@email.com', curdate());

insert into  customer (id,customer_id,customer_type,account_number,phone_number, email_address, date_joined)
value (1004,'C0003','Atlanta Mitchell','INDIVIDUAL','ACC0004','610482378','atlanta@email.com', curdate());

insert into  customer (id,customer_id,customer_type,account_number,phone_number, email_address, date_joined)
value (1005,'C0004','Charis Lester','INDIVIDUAL','ACC0005','89137172','charis@email.com', curdate());

insert into  customer (id,customer_id,customer_type,account_number,phone_number, email_address, date_joined)
value (1006,'C0005','Saba Cordova','INDIVIDUAL','ACC0006','163849104','saba@email.com', curdate());