CREATE TABLE `hibernate`.`employee` (
  `employee_id` INT NOT NULL AUTO_INCREMENT,
  `employee_name` VARCHAR(45) NOT NULL,
  `employee_dept` VARCHAR(45) NOT NULL,
  `employee_doj` DATE NOT NULL,
  `employee_sal` DOUBLE NOT NULL,
  PRIMARY KEY (`employee_id`));

  INSERT INTO `hibernate`.`employee` (`employee_id`, `employee_name`, `employee_dept`, `employee_doj`, `employee_sal`) VALUES ('1', 'surya', 'Development', '2021-08-02', '800000');
