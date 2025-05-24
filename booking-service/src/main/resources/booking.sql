use movie_booking_system;

CREATE TABLE IF NOT EXISTS `booking_microservice` (
                                                      `booking_id` int NOT NULL AUTO_INCREMENT,

                                                      `seat_number` int NOT NULL,

                                                      `confirmed` boolean NOT NULL,
                                                      `created_at` TIMESTAMP NOT NULL,
                                                      `created_by` varchar(50) NOT NULL,
    `updated_at` TIMESTAMP DEFAULT NULL,
    `updated_by` varchar(50) DEFAULT NULL,
    PRIMARY KEY (`booking_id`)
    );


use movie_booking_system;

INSERT INTO `booking_microservice` (`seat_number`,`confirmed`,`created_at`, `created_by`)
VALUES (45,1,CURDATE(),'DBA');