CREATE TABLE `hibernate`.`bus` (
  `bus_no` INT NOT NULL AUTO_INCREMENT,
  `bus_type` VARCHAR(45) NULL,
  `registration_no` VARCHAR(45) NULL,
  `fuel_type` VARCHAR(45) NULL,
  `color` VARCHAR(45) NULL,
  `capacity` INT NULL,
  PRIMARY KEY (`bus_no`));
