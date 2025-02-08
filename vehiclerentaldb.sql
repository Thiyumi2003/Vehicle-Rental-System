CREATE DATABASE vehiclerentaldb;
use vehiclerentaldb;
CREATE Table CarS(
	CarID INT PRIMARY KEY,
	Brand VARCHAR(45),
    Model VARCHAR(45),
    Year INT,
    Price double,
    IsAvailable BOOLEAN,
    IsReserved BOOLEAN
);
CREATE TABLE admin(
	ID INT PRIMARY KEY NOT NULL,
    Full_Name VARCHAR(45),
    Email VARCHAR(45),
    Role VARCHAR(45),
    Password VARCHAR(45) NOT NULL
);
INSERT INTO admin() VALUES(1,"admin","admin@gmail.com","admin","1234");
DROP TABLE admin;
CREATE TABLE Client(
	ID INT PRIMARY KEY NOT NULL,
    Full_Name VARCHAR(45),
    Email VARCHAR(45),
    Role VARCHAR(45),
    Password VARCHAR(45) NOT NULL
);
DROP TABLE RENTAL;
CREATE TABLE RENTAL(
	RentalID INT PRIMARY KEY,
    CarID INT,
    FOREIGN KEY (CarID) REFERENCES Cars(CarID),
    RentedDate VARCHAR(45),
    Brand VARCHAR(45),
    Model VARCHAR(45),
    ClientID INT,
    FOREIGN KEY (ClientID) REFERENCES Client(ID)
);
DROP TABLE Reserves;
CREATE TABLE Reserves(
	ReserveID INT PRIMARY KEY,
    CarID int,
    FOREIGN KEY (CarID) REFERENCES Cars(CarID),
    Brand VARCHAR(45),
    Model VARCHAR(45),
    ClientID INT,
    FOREIGN KEY (ClientID) REFERENCES Client(ID)
);
CREATE TABLE Payments(
	PaymentID INT PRIMARY KEY,
    CarID INT,
    Full_Name VARCHAR(45),
    Brand VARCHAR(45),
    Model VARCHAR(45),
    Rent_Payments DOUBLE,
    ReserveDown_Payments DOUBLE,
    ReserveFull_Payments DOUBLE
);
ALTER TABLE Client MODIFY ID  INT auto_increment; 
ALTER TABLE Cars MODIFY CarID  INT auto_increment; 

SELECT * FROM CLIENT;