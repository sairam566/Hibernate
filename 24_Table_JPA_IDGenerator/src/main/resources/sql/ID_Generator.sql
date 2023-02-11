CREATE TABLE `hibernate`.`id_gen` (
  `generator_name` VARCHAR(30) NOT NULL,
  `value` INT NULL,
  PRIMARY KEY (`generator_name`));
  

  INSERT INTO `hibernate`.`id_gen` (`generator_name`, `value`) VALUES ('bus_no', '0');
INSERT INTO `hibernate`.`id_gen` (`generator_name`, `value`) VALUES ('car_no', '0');
