package bookMyShow;

import bookMyShow.movie.Movie;
import bookMyShow.seat.Seat;

import java.util.Map;

public class Show {
    private final String id;
    private final Movie movie;
    private final Theater theater;
    private final int startTime;
    private final int endTime;
    private final Map<String, Seat> seats;

    public Show(String id, Movie movie, Theater theater, int startTime, int endTime, Map<String, Seat> seats) {
        this.id = id;
        this.movie = movie;
        this.theater = theater;
        this.startTime = startTime;
        this.endTime = endTime;
        this.seats = seats;
    }

    public int getEndTime() {
        return endTime;
    }

    public String getId() {
        return id;
    }

    public Movie getMovie() {
        return movie;
    }

    public Theater getTheater() {
        return theater;
    }

    public int getStartTime() {
        return startTime;
    }

    public Map<String, Seat> getSeats() {
        return seats;
    }
}
