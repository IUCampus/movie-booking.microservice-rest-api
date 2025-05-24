use movie_booking_system;

CREATE TABLE IF NOT EXISTS `roles` (
    `role_id` int NOT NULL AUTO_INCREMENT,
    `role_name` varchar(50) NOT NULL,
    `created_at` TIMESTAMP NOT NULL,
    `created_by` varchar(50) NOT NULL,
    `updated_at` TIMESTAMP DEFAULT NULL,
    `updated_by` varchar(50) DEFAULT NULL,
    PRIMARY KEY (`role_id`)
    );

INSERT INTO `roles` (`role_name`,`created_at`, `created_by`)
VALUES ('ADMIN',CURDATE(),'DBA');

INSERT INTO `roles` (`role_name`,`created_at`, `created_by`)
VALUES ('CUSTOMER',CURDATE(),'DBA');


CREATE TABLE IF NOT EXISTS `customer_microservice` (
    `customer_id` int NOT NULL AUTO_INCREMENT,
    `username` varchar(50) NOT NULL,
    `password` varchar(50) NOT NULL,
    `role_id` int NOT NULL,
    `email` varchar(50) NOT NULL,
    `created_at` TIMESTAMP NOT NULL,
    `created_by` varchar(50) NOT NULL,
    `updated_at` TIMESTAMP DEFAULT NULL,
    `updated_by` varchar(50) DEFAULT NULL,
    PRIMARY KEY (`customer_id`),
    FOREIGN KEY (role_id) REFERENCES roles(role_id)
    );

use movie_booking_system;

INSERT INTO `customer_microservice`(`username`,`password`,`email`,`role_id`,`created_at`, `created_by`)
VALUES(`perterson`,`123456789`,2,`perter@gmail.com`,CURDATE(),'DBA');
