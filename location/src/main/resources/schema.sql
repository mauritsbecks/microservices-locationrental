CREATE TABLE Location (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  description VARCHAR(250) NOT NULL,
  price DECIMAL DEFAULT NULL,
  capacity INT NOT NULL,
  street VARCHAR(250) NOT NULL,
  number INT NOT NULL,
  city VARCHAR(250) NOT NULL
);

