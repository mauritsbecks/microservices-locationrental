/* CREATE TABLE customer (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    customer_id VARCHAR(255) UNIQUE NOT NULL,
    first_name VARCHAR(255),
    last_name VARCHAR(255),
    street VARCHAR(255),
    zipcode VARCHAR(10),
    birthdate DATE,
    is_recurring BOOLEAN,
    phone_number VARCHAR(20)
);
 */
CREATE TABLE Customer (
  ID          int(10) NOT NULL AUTO_INCREMENT, 
  AddressID   int(10) NOT NULL, 
  First_Name  varchar(255), 
  Last_Name   varchar(255), 
  Email       varchar(50), 
  Phone       int(10), 
  Active      char(1), 
  Create_Date timestamp NULL, 
  Last_Update timestamp NULL, 
  PRIMARY KEY (ID));

CREATE TABLE Staff (
  ID          int(10) NOT NULL AUTO_INCREMENT, 
  AddressID   int(10) NOT NULL, 
  First_Name  varchar(255), 
  Last_Name   varchar(255), 
  Email       varchar(50), 
  Active      char(1), 
  Username    varchar(16), 
  Password    varchar(40), 
  PictureURL  varchar(80), 
  Last_Update timestamp NULL, 
  PRIMARY KEY (ID));


CREATE TABLE Address (
  ID          int(10) NOT NULL AUTO_INCREMENT, 
  CityID      int(10) NOT NULL, 
  Address     varchar(50), 
  Postal_Code varchar(10), 
  Last_Update timestamp NULL, 
  PRIMARY KEY (ID));


CREATE TABLE City (
  ID          int(10) NOT NULL AUTO_INCREMENT, 
  CountryID   int(10) NOT NULL, 
  City        varchar(50), 
  Last_Update timestamp NULL, 
  PRIMARY KEY (ID));

CREATE TABLE Country (
  ID          int(10) NOT NULL AUTO_INCREMENT, 
  Country     varchar(50), 
  Last_Update timestamp NULL, 
  PRIMARY KEY (ID));




