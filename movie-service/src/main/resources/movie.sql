use movie_booking_system;

create table `show-time`
(
    id              bigint       not null
        primary key,
    available_seats int          not null,
    theater         varchar(255) null,
    time            datetime(6)  null,
    movie_id        bigint       null,
    created_at      datetime(6)  null,
    created_by      varchar(255) null,
    updated_at      datetime(6)  null,
    updated_by      varchar(255) null
);

create table `movie-microservice`
(
    id          bigint       not null
        primary key,
    description varchar(255) null,
    genre       varchar(255) null,
    rating      double       null,
    title       varchar(255) null,
    showtime_id int          not null,
    created_at  datetime(6)  null,
    created_by  varchar(255) null,
    updated_at  datetime(6)  null,
    updated_by  varchar(255) null
);

use movie_booking_system;

INSERT INTO `showtimeDto` (`theater`,`available_seats`,`created_at`, `created_by`)
VALUES ('national Theater',45,CURDATE(),'DBA');

use movie_booking_system;

INSERT INTO `movie_microservice` (`title`,`description`,`genre`,`rating`,`showtime_id`,`created_at`, `created_by`)
VALUES ('Coming To America','Traditinal marriage','Commedy',4.5,1,CURDATE(),'DBA');