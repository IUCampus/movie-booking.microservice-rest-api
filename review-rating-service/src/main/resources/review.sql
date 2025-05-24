
use movie_booking_system;

CREATE TABLE IF NOT EXISTS `review_rating_microservice` (
    `review_id` int NOT NULL AUTO_INCREMENT,
    `customer_id` int NOT NULL,
    `movie_id` int NOT NULL,
    `rating` int NOT NULL,
    `comment` varchar(100) NOT NULL,
    `created_at` TIMESTAMP NOT NULL,
    `created_by` varchar(50) NOT NULL,
    `updated_at` TIMESTAMP DEFAULT NULL,
    `updated_by` varchar(50) DEFAULT NULL,
    PRIMARY KEY (`review_id`),
    FOREIGN KEY (customer_id) REFERENCES customer_microservice(customer_id),
    FOREIGN KEY (movie_id) REFERENCES movie_microservice(movie_id)
    );


use movie_booking_system;

INSERT INTO `review_rating_microservice` (`customer_id`,`movie_id`,`rating`,`comment`,`created_at`, `created_by`)
VALUES(1,1,3.5,`Action`,CURDATE(),'DBA');