CREATE TABLE booking (
    id INT AUTO_INCREMENT PRIMARY KEY,
    booking_id INT NOT NULL,
    booking_date DATE NOT NULL,
    status VARCHAR(50) NOT NULL
);

CREATE TABLE location (
    id SERIAL PRIMARY KEY,
    location_id INTEGER NOT NULL,
    location_name VARCHAR(255) NOT NULL,
    standard_price INTEGER NOT NULL,
    is_available BOOLEAN NOT NULL
);