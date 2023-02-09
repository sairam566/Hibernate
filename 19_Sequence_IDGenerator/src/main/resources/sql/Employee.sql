CREATE TABLE EMPLOYEE 
(
  EMPLOYEE_ID INT NOT NULL 
, EMPLOYEE_NAME VARCHAR2(20) 
, EMPLOYEE_DEPT VARCHAR2(20) 
, EMPLOYEE_DOJ DATE 
, EMPLOYEE_SAL FLOAT 
, CONSTRAINT EMPLOYEE_PK PRIMARY KEY 
  (
    EMPLOYEE_ID 
  )
  ENABLE 
);
