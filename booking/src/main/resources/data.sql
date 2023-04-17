INSERT INTO Rental (StaffID, CustomerID, InventoryID, Rental_StartDate, Rental_EndDate, Last_Update) VALUES
(1, 1, 1, timestamp '2023-04-12 09:05:00', timestamp '2023-04-16 12:00:00', NOW()),
(2, 2, 2, timestamp '2023-04-14 12:00:00', timestamp '2023-04-16 12:00:00', NOW()),
(3, 2, 3, timestamp '2023-04-15 12:00:00', timestamp '2023-04-17 12:00:00', NOW()),
(4, 2, 4, timestamp '2023-04-16 12:00:00', timestamp '2023-04-18 12:00:00', NOW()),
(5, 1, 5, timestamp '2023-04-17 12:00:00', timestamp '2023-04-19 12:00:00', NOW());


/* 
INSERT INTO booking (booking_id, booking_date, status) VALUES
(1001, '2022-04-10', 'confirmed'),
(1002, '2022-05-05', 'pending'),
(1003, '2022-06-12', 'cancelled'),
(1004, '2022-07-20', 'confirmed'),
(1005, '2022-08-01', 'confirmed'),
(1006, '2022-09-03', 'pending'),
(1007, '2022-10-15', 'confirmed'),
(1008, '2022-11-21', 'cancelled'),
(1009, '2022-12-05', 'pending'),
(1010, '2023-01-10', 'confirmed'),
(1011, '2023-02-14', 'pending'),
(1012, '2023-03-01', 'confirmed'),
(1013, '2023-04-09', 'pending'),
(1014, '2023-05-15', 'confirmed'),
(1015, '2023-06-20', 'confirmed'),
(1016, '2023-07-10', 'cancelled'),
(1017, '2023-08-15', 'confirmed'),
(1018, '2023-09-23', 'pending'),
(1019, '2023-10-12', 'confirmed'),
(1020, '2023-11-20', 'pending');

INSERT INTO location (location_id, location_name, standard_price, is_available) 
VALUES 
(1, 'New York', 100, true), 
(2, 'London', 80, true),
(3, 'Paris', 90, false),
(4, 'Tokyo', 120, true),
(5, 'Sydney', 110, true),
(6, 'Rio de Janeiro', 95, false),
(7, 'Dubai', 150, true),
(8, 'Cape Town', 70, false),
(9, 'Amsterdam', 85, true),
(10, 'Hong Kong', 130, false); */