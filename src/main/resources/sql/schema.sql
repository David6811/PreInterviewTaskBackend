drop schema if exists `UsedCarSalesDemo`;
create schema `UsedCarSalesDemo`;
use `UsedCarSalesDemo`;

create table users(
  userid varchar(32) NOT NULL primary key,
  email varchar(255) default NULL COMMENT 'email',
  password varchar(255) default NULL COMMENT 'password');

 create table usedcarsales (
 id VARCHAR(36) NOT NULL,
 make VARCHAR(20),
 model VARCHAR(20),
 year INT(4),
 description VARCHAR(255),
 odometer INT(6),
 vehiclecondition VARCHAR(20),
 salelocation VARCHAR(32),
 salecategory VARCHAR(100),
 salvagevehicle VARCHAR(3),
 saledate DATE,
 saleprice DECIMAL(10,2),
 colour VARCHAR(10),
 engine VARCHAR(100),
 transmission VARCHAR(100),
 accessories VARCHAR(32),
 states VARCHAR(10),
 customdate INT(3),
 badges VARCHAR(20),
 bodytype VARCHAR(10),
 bodytypeconfig VARCHAR(20),
 fueltype VARCHAR(6),
 cylinders INT(1),
 division VARCHAR(20),
 drive VARBINARY(20),
 seat INT(4),
 doors INT(1),
 PRIMARY KEY (id)
 );