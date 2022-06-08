REM   Script: Session 01
REM   Activity2,3

CREATE TABLE Customers ( 
    CustomerID int, 
    CustomerName varchar(52), 
    ContactName varchar(32), 
    Address varchar(255), 
    City varchar(50), 
    PostalCode varchar(20), 
    Country varchar(20) 
);

desc Customers


drop Customers;

drop Customers;

CREATE TABLE Salesmans ( 
        salesman_id int 
        salesman_name varchar2(20), 
        salesman_city varchar2(20), 
        commission int 
        );

CREATE TABLE Salesmans ( 
        salesman_id int, 
        salesman_name varchar2(20), 
        salesman_city varchar2(20), 
        commission int 
        );

  desc Salesmans


INSERT INTO Salesmans 
VALUES (5001, James Hoog, New York , 15);

 INSERT INTO Salesmans VALUES ('5001', 'James Hoog', 'New York' , 15);

Insert All 
          INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
          INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
          INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
          INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12);

 Insert All 
          INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
          INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
          INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
          INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
          SELECT 1 FROM DUAL;

INSERT INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13);

        Insert All 
          INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
          INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
          INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
          INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
          SELECT 1 FROM DUAL;

 INSERT INTO Salesman VALUES(5002, 'Nail Knite', 'Paris', 13);

        Insert All 
          INTO Salesman VALUES(5005, 'Pit Alex', 'London', 11) 
          INTO Salesman VALUES(5006, 'McLyon', 'Paris', 14) 
          INTO Salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
          INTO Salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
          SELECT 1 FROM DUAL;

INSERT INTO Salesman VALUES(5002, 'Nail Knite', 'Paris', 13);

        INSERT All 
          INTO Salesman VALUES(5005, 'Pit Alex', 'London', 11) 
          INTO Salesman VALUES(5006, 'McLyon', 'Paris', 14) 
          INTO Salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
          INTO Salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
          SELECT 1 FROM DUAL;

INSERT INTO Salesmans VALUES(5002, 'Nail Knite', 'Paris', 13);

        INSERT All 
          INTO Salesmans VALUES(5005, 'Pit Alex', 'London', 11) 
          INTO Salesmans VALUES(5006, 'McLyon', 'Paris', 14) 
          INTO Salesmans VALUES(5007, 'Paul Adam', 'Rome', 13) 
          INTO Salesmans VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
          SELECT 1 FROM DUAL;

Select * Salesmans;

  desc Salesmans


 Select * Salesmans;

  Select * from Salesmans;

SELECT salesman_id, salesman_city FROM salesman;

 SELECT Salesmans_id, Salesmans_city FROM Salesmans;

SELECT Salesman_id, Salesman_city FROM Salesmans;

 Select * from Salesman where Salesman_city='Paris';

Select * from Salesmans where Salesman_city='Paris';

 SELECT salesman_id, commission FROM Salesmans WHERE salesman_name='Paul Adam';

