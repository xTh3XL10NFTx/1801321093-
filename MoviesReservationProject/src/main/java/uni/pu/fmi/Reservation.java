package uni.pu.fmi;
import java.util.*;

/**
 * 
 */
public class Reservation {

    private Set<User> user;
    private Set<Movie> movie;
    private String seatNum;
    private String timeOfReservation;
    public Set<User> users;
    public Set<Movie> movies;
    
    /**
     * Default constructor
     */
    public Reservation() {
    }

    public Set<User> getUser() {
        return user;
    }

    /**
     * @param user 
     * @return
     */
    public void setUser(Set<User> user) {
        this.user=user;
    }

    /**
     * @return
     */
    public Set<Movie> getMovie() {
        return movie;
    }

    /**
     * @param movie 
     * @return
     */
    public void setMovie(Set<Movie> movie) {
        this.movie=movie;
    }

    /**
     * @return
     */
    public String getSeatNum() {
        return seatNum;
    }

    /**
     * @param seatNum 
     * @return
     */
    public void setSeatNum(String seatNum) {
        this.seatNum=seatNum;
    }

    /**
     * @return
     */
    public String getTimeOfReservation() {
        return timeOfReservation;
    }

    /**
     * @param timeOfReservation 
     * @return
     */
    public void setTimeOfReservation(String timeOfReservation) {
        this.timeOfReservation=timeOfReservation;
    }

}