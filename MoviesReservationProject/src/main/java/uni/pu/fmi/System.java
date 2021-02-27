package uni.pu.fmi;
import java.util.*;

/**
 * 
 */
public class System {

    private int movieID;
    private String movieTitle;
    private String producer;
    private float rating;
    private Set<Category> category;
    public Set<Movie> movies;
    public Set<Category> categories;
    
    /**
     * Default constructor
     */
    public System() {
    }

    public int getMovieID() {
        return movieID;
    }

    /**
     * @param movieID 
     * @return
     */
    public void setMovieID(int movieID) {
        this.movieID=movieID;
    }

    /**
     * @return
     */
    public String getMovieTitle() {
        return movieTitle;
    }

    /**
     * @param movieTitle 
     * @return
     */
    public void setMovieTitle(String movieTitle) {
        this.movieTitle=movieTitle;
    }

    /**
     * @return
     */
    public String getProducer() {
        return producer;
    }

    /**
     * @param producer 
     * @return
     */
    public void setProducer(String producer) {
        this.producer=producer;
    }

    /**
     * @return
     */
    public float getRating() {
        return rating;
    }

    /**
     * @param rating 
     * @return
     */
    public void setRating(float rating) {
        this.rating=rating;
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