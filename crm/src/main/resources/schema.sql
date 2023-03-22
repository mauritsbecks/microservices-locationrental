CREATE TABLE customer (
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