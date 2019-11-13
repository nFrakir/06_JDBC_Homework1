CREATE DATABASE flats;
SET global time_zone="+2:0";

CREATE TABLE flat (
	id INT NOT NULL AUTO_INCREMENT, 
    PRIMARY KEY (id),
    district VARCHAR(255),
    address VARCHAR(255),
    square DOUBLE,
    rooms INTEGER,
    price DOUBLE);
    
INSERT INTO flat VALUES
	(DEFAULT, "Obolon", "Street 1", 45.3, 3, 45000),
    (DEFAULT, "Obolon", "Street 1", 41.0, 3, 45000),
    (DEFAULT, "Obolon", "Street 2", 40, 3, 40000),
    (DEFAULT, "Obolon", "Street 2", 30.2, 2, 44000),
    (DEFAULT, "Obolon", "Street 2", 8, 1, 4500);
    
SELECT * FROM flat WHERE address="Street 1" AND rooms=3 AND price<=50000
    
    
