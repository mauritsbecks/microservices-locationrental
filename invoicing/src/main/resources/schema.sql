CREATE TABLE invoice (
    id BIGINT PRIMARY KEY,
    invoice_id VARCHAR(255),
    customer_id VARCHAR(255),
    booking_id VARCHAR(255),
    status VARCHAR(255),
    total_price DECIMAL(10,2)
);