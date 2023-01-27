CREATE TABLE `hibernate`.`address` (
  `address_no` INT NOT NULL AUTO_INCREMENT,
  `address_line1` VARCHAR(45) NOT NULL,
  `address_line2` VARCHAR(45) NOT NULL,
  `city` VARCHAR(45) NOT NULL,
  `state` VARCHAR(45) NOT NULL,
  `zip` VARCHAR(45) NOT NULL,
  `country` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`address_no`));
  
  INSERT INTO `hibernate`.`address` (`address_no`, `address_line1`, `address_line2`, `city`, `state`, `zip`, `country`) VALUES ('1', '5 Girija Nagar', 'Kolathur', 'Chennai', 'TN', '600099', 'India');