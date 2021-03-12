package uni.pu.fmi;

import java.util.*;

/**
 * 
 */
public class Reservation {

    private String seatNum;
    private String timeOfReservation;
    private Set<User> user;
    private Set<Movie> movie;
    
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