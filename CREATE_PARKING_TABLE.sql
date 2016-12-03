CREATE TABLE `work`.`parking` (
  `parking_id` INT NOT NULL,
  `car_id` INT NULL,
  `parking_number` ENUM('1', '2', '3', '4', '5', '6', '7', '8', '9', '10') NULL,
  `parking_start_time` DATETIME NULL,
  `parking_end_name` DATETIME NULL,
  PRIMARY KEY (`parking_id`));
