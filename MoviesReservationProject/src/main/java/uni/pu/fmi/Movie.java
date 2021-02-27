package uni.pu.fmi;
import java.util.*;

/**
 * 
 */
public class Movie {

    private Set<System> movieName;
    private String theatreName;
    private String movieDate;
    private int hallNum;
    private Set<Category> category;
    public Set<Reservation> reservations;
    public Set<System> system;
    public Set<Category> categories;
    
    /**
     * Default constructor
     */
    public Movie() {
    }

    public Set<System> getMovieName() {
        return movieName;
    }

    /**
     * @param movieName 
     * @return
     */
    public void setMovieName(Set<System> movieName) {
        this.movieName=movieName;
    }

    /**
     * @return
     */
    public String getMovieDate() {
        return movieDate;
    }

    /**
     * @param movieDate 
     * @return
     */
    public void setMovieDate(String movieDate) {
        this.movieDate=movieDate;
    }

    /**
     * @return
     */
    public int getHallNum() {
        return hallNum;
    }

    /**
     * @param hallNum 
     * @return
     */
    public void setHallNum(int hallNum) {
        this.hallNum=hallNum;
    }

    /**
     * @return
     */
    public String getTheatreName() {
        return theatreName;
    }

    /**
     * @param theatreName 
     * @return
     */
    public void setTheatreName(String theatreName) {
        this.theatreName=theatreName;
    }

    /**
     * @return
     */
    public Set<Category> getCategory() {
        return category;
    }

    /**
     * @param category 
     * @return
     */
    public void setCategory(Set<Category> category) {
        this.category=category;
    }

}