CREATE TABLE `hibernate`.`product` (
  `product_no` INT NOT NULL AUTO_INCREMENT,
  `product_name` VARCHAR(45) NULL,
  `description` VARCHAR(45) NULL,
  `price` INT NULL,
  PRIMARY KEY (`product_no`));
INSERT INTO `hibernate`.`product` (`product_no`, `product_name`, `description`, `price`) VALUES ('1', 'Apple', 'Iphone 15 Pro Max', '150000');
