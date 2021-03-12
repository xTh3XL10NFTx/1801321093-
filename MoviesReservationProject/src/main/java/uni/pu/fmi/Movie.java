package uni.pu.fmi;

import java.util.*;

/**
 * 
 */
public class Movie {

    private String movieName;
    private String theatreName;
    private String movieDate;
    private int hallNum;
    private Set<Category> category;
    /**
     * Default constructor
     */
    public Movie() {
    }

    public String getMovieName() {
        return movieName;
    }

    /**
     * @param movieName 
     * @return
     */
    public void setMovieName(String movieName) {
    	this.movieName=movieName;
    }

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