use movie_booking_system;

CREATE TABLE IF NOT EXISTS `showtime` (
                                          `showtime_id` int NOT NULL AUTO_INCREMENT,

                                          `available_seats` int NOT NULL,
                                          `theater` varchar(50) NOT NULL,
    `created_at` TIMESTAMP NOT NULL,
    `created_by` varchar(50) NOT NULL,
    `updated_at` TIMESTAMP DEFAULT NULL,
    `updated_by` varchar(50) DEFAULT NULL,
    PRIMARY KEY (`showtime_id`)
    );

CREATE TABLE IF NOT EXISTS `movie_microservice` (
    `movie_id` int NOT NULL AUTO_INCREMENT,
    `title` varchar(100) NOT NULL,
    `description` varchar(50) NOT NULL,
    `genre` varchar(20) NOT NULL,
    `rating` double NOT NULL,
    `showtime_id` int NOT NULL,
    `created_at` TIMESTAMP NOT NULL,
    `created_by` varchar(50) NOT NULL,
    `updated_at` TIMESTAMP DEFAULT NULL,
    `updated_by` varchar(50) DEFAULT NULL,
    PRIMARY KEY (`movie_id`),
    FOREIGN KEY (showtime_id) REFERENCES showtime(showtime_id)
    );

use movie_booking_system;

INSERT INTO `showtime` (`theater`,`available_seats`,`created_at`, `created_by`)
VALUES ('national Theater',45,CURDATE(),'DBA');

use movie_booking_system;

INSERT INTO `movie_microservice` (`title`,`description`,`genre`,`rating`,`showtime_id`,`created_at`, `created_by`)
VALUES ('Coming To America','Traditinal marriage','Commedy',4.5,1,CURDATE(),'DBA');