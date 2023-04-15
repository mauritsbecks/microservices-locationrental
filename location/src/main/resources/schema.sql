CREATE TABLE Location (
  ID               int(10) NOT NULL AUTO_INCREMENT, 
  Name             varchar(255), 
  Description      varchar(255), 
  Rental_Duration  int(10), 
  Rental_Rate      numeric(19, 0), 
  Rating           int(10), 
  Special_Features varchar(255), 
  `Fulltext`       varchar(255), 
  Last_Update      timestamp NULL, 
  PRIMARY KEY (ID));
