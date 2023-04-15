CREATE TABLE Rental (
  ID               int(10) NOT NULL AUTO_INCREMENT, 
  StaffID          int(10) NOT NULL, 
  CustomerID       int(10) NOT NULL, 
  InventoryID      int(10) NOT NULL, 
  Rental_StartDate timestamp NULL, 
  Rental_EndDate   timestamp NULL, 
  Last_Update      timestamp NULL, 
  PRIMARY KEY (ID));

