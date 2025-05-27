package com.fcwebapp.movie_service.mapper;

import com.fcwebapp.movie_service.dto.ShowtimeDto;
import com.fcwebapp.movie_service.entity.Showtime;

public class ShowtimeMapper {
    public static ShowtimeDto mapToShowtimeDto(Showtime showtime) {
        ShowtimeDto showtimeDto = new ShowtimeDto(
                showtime.getId(),
                showtime.getTime(),
                showtime.getTheater(),
                showtime.getAvailableSeats(),
                null  // movieDto needs to be set separately or through MovieMapper
        );
        return showtimeDto;
    }

    public static Showtime mapToShowtimeEntity(ShowtimeDto showtimeDto) {
        Showtime showtime = new Showtime(
                null,
                showtimeDto.getTime(),
                showtimeDto.getTheater(),
                showtimeDto.getAvailableSeats(),
                null
        );
        return showtime;
    }
}
