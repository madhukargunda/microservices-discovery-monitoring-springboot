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
