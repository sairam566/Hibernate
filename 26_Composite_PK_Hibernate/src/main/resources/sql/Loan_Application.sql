CREATE TABLE `hibernate`.`loan_application` (
  `application_no` INT NOT NULL,
  `branch_code` VARCHAR(45) NOT NULL,
  `applicant_nm` VARCHAR(45) NULL,
  `applied_dt` DATE NULL,
  `loan_type` VARCHAR(45) NULL,
  `dob` DATE NULL,
  `gender` VARCHAR(45) NULL,
  `loan_amount` FLOAT NULL,
  PRIMARY KEY (`application_no`, `branch_code`));

  INSERT INTO `hibernate`.`loan_Application` (`application_no`, `branch_code`, `applicant_nm`, `applied_dt`, `loan_type`, `dob`, `gender`, `loan_amount`) VALUES ('1', 'SBI-San', 'House Loan', '2021-08-05', 'EMI', '1995-03-14', 'M', '500000');
