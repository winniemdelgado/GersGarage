DROP DATABASE IF EXISTS dbmech;
CREATE DATABASE dbmech;
USE dbmech;

CREATE TABLE customer(
customerid BIGINT NOT NULL UNIQUE AUTO_INCREMENT PRIMARY KEY,
customername VARCHAR(30),
customeremail VARCHAR(30),
customerphone VARCHAR(30),
vehicletype VARCHAR(10),
vehiclemake VARCHAR(20),
vehiclelicense VARCHAR(10),
vehiclefuel VARCHAR(10),
commentary VARCHAR(200),
access BOOL,
customerlogin VARCHAR(30),
customerpassword VARCHAR(30)
);



CREATE TABLE supply(
partid BIGINT NOT NULL UNIQUE AUTO_INCREMENT PRIMARY KEY,
partname VARCHAR(30),
cost DOUBLE,
instock BOOL
);

CREATE TABLE mechanic(
mechanicid BIGINT NOT NULL UNIQUE AUTO_INCREMENT PRIMARY KEY,
mechanicname VARCHAR(30),
mechanicphone VARCHAR(30),
availability BOOL
);

CREATE TABLE booking(
bookingid BIGINT NOT NULL UNIQUE AUTO_INCREMENT PRIMARY KEY,
bookingtype VARCHAR(20) NOT NULL,
cost DOUBLE,
bookingdate DATETIME,
mechanicid BIGINT,
customerid BIGINT,
progress VARCHAR(30),
FOREIGN KEY (mechanicid) REFERENCES mechanic(mechanicid)ON DELETE SET NULL,
FOREIGN KEY (customerid) REFERENCES customer(customerid) ON DELETE CASCADE
);

CREATE TABLE purchase(
purchaseid BIGINT NOT NULL UNIQUE AUTO_INCREMENT PRIMARY KEY,
customerid BIGINT,
cost DOUBLE,
FOREIGN KEY (customerid) REFERENCES customer(customerid) ON DELETE SET NULL
);



