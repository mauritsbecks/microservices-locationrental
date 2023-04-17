CREATE TABLE invoice (
    ID int(10) NOT NULL AUTO_INCREMENT,
    RentalID int(10) NOT NULL,
    CustomerID int(10) NOT NULL,
    StaffID int(10) NOT NULL,
    Amount numeric(19, 0),
    Payment_Date timestamp NULL,
    PRIMARY KEY (ID)
);