package uni.pu.fmi;
import java.util.*;

/**
 * 
 */
public class User {


    private String usrName;
    private int cardID;
    private String expiryDate;
    private Boolean expired;
    public Set<Reservation> reservations;

    /**
     * Default constructor
     */
    public User() {
    }
    
    public String getUsrName() {
        return usrName;
    }

    /**
     * @param usrName 
     * @return
     */
    public void setUsrName(String usrName) {
        this.usrName=usrName;
    }

    /**
     * @return
     */
    public int getCardID() {
        return cardID;
    }

    /**
     * @param cardID 
     * @return
     */
    public void setCardID(int cardID) {
        this.cardID=cardID;
    }

    /**
     * @return
     */
    public String getExpiryDate() {
        return expiryDate;
    }

    /**
     * @param expiryDate 
     * @return
     */
    public void setExpiryDate(String expiryDate) {
        this.expiryDate=expiryDate;
    }

    /**
     * @return
     */
    public Boolean getExpired() {
        return expired;
    }

    /**
     * @param expired 
     * @return
     */
    public void setExpired(Boolean expired) {
        this.expired=expired;
    }

    /**
     * @return
     */
    public Set<Reservation> getReservations() {
        return reservations;
    }

    /**
     * @param reservations 
     * @return
     */
    public void setReservations(Set<Reservation> reservations) {
        this.reservations=reservations;
    }

    /**
     * @param reservation 
     * @return
     */
    public void addReservation(Reservation reservation) {
    	if(null == reservations) {
    		this.reservations = new HashSet<>();
    	}
        this.reservations.add(reservation);
    }

}