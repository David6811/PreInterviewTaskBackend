drop schema if exists `UsedCarSalesDemo`;
create schema `UsedCarSalesDemo`;
use `UsedCarSalesDemo`;

create table users(
  userid varchar(32) NOT NULL primary key,
  email varchar(255) default NULL COMMENT 'email',
  password varchar(255) default NULL COMMENT 'password');