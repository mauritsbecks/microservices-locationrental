/* INSERT INTO customer (customer_id, first_name, last_name, street, zipcode, birthdate, is_recurring, phone_number)
VALUES
    ('CUS0001', 'John', 'Doe', '123 Main St', '10001', '1980-01-01', true, '555-1234'),
    ('CUS0002', 'Jane', 'Doe', '456 Maple Ave', '20001', '1975-05-15', false, '555-5678'),
    ('CUS0003', 'Bob', 'Smith', '789 Oak Rd', '30001', '1992-12-31', true, '555-4321'),
    ('CUS0004', 'Alice', 'Smith', '321 Pine St', '40001', '1988-06-12', false, '555-8765'),
    ('CUS0005', 'David', 'Lee', '987 Elm Blvd', '50001', '1970-11-20', true, '555-1111'),
    ('CUS0006', 'Sarah', 'Lee', '654 Cedar Ln', '60001', '1985-03-08', false, '555-2222'),
    ('CUS0007', 'Mark', 'Johnson', '321 Walnut St', '70001', '1996-09-22', true, '555-3333'),
    ('CUS0008', 'Emily', 'Johnson', '654 Cherry Ave', '80001', '1977-02-14', false, '555-4444'); */

INSERT INTO Customer(ID, AddressID, First_Name, Last_Name, Email, Phone, Active, Create_Date, Last_Update) 
VALUES 
    (1, 101, 'Maurits', 'van UT', 'maurits@student.utwente.nl', 0628244529, 'Y', timestamp '2023-04-12 09:05:00', timestamp '2023-04-13 09:05:00'),
    (2, 102, 'Arthur', 'van UT', 'arthur@student.utwente.nl', 0628244529, 'Y', timestamp '2023-04-12 19:05:00', timestamp '2023-04-13 09:25:00'),
    (3, 103, 'Eelco', 'van Vliet', 'EelcoVanVliet@example.com', 0628927319, 'N', timestamp '2023-04-12 14:10:00', timestamp '2023-04-13 09:15:00');


INSERT INTO Staff(ID, AddressID, First_Name, Last_Name, Email, Active, Username, Password, PictureURL, Last_Update) 
VALUES 
(1, 1, 'Pieter', 'Oosthoek', 'pieteroosthoek@example.com', 'Y', 'pieteroosthoek', 'welkom123', 'https://www.gravatar.com/avatar/2c7d99fe281ecd3bcd65ab915bac6dd5?s=250', NOW()),
(2, 2,'Klaas', 'de Rooij', 'klaas@example.com', 'Y', 'klaasderooij', 'welkom123', 'https://www.gravatar.com/avatar/2c7d99fe281ecd3bcd65ab915bac6dd5?s=250', NOW());

-- Insert data into the Country table
INSERT INTO Country (Country, Last_Update)
VALUES ('United States', CURRENT_TIMESTAMP);

-- Get the ID of the newly inserted country
SET @country_id = LAST_INSERT_ID();

-- Insert data into the City table
INSERT INTO City (CountryID, City, Last_Update)
VALUES (@country_id, 'New York', CURRENT_TIMESTAMP);

-- Get the ID of the newly inserted city
SET @city_id = LAST_INSERT_ID();

-- Insert data into the Address table
INSERT INTO Address (CityID, Address, Postal_Code, Last_Update)
VALUES (@city_id, '123 Main Street', '10001', CURRENT_TIMESTAMP);