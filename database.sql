CREATE DATABASE HospitalDB;

USE HospitalDB;

CREATE TABLE Patients (
    PatientID INT PRIMARY KEY,
    PatientName VARCHAR(100),
    Age INT,
    Disease VARCHAR(100)
);

INSERT INTO Patients VALUES
(101,'Rahul Sharma',22,'Fever'),
(102,'Priya Patel',20,'Malaria'),
(103,'Amit Verma',25,'Diabetes');
