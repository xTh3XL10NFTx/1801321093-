package uni.pu.fmi;
import java.util.*;

/**
 * 
 */
public class Category {

    /**
     * Default constructor
     */
    public Category() {
    }

    /**
     * 
     */
    private String catName;
    private Set<Category> parent;
    public Set<Category> children;
    public Set<System> system;

    public String getCatName() {
        return catName;
    }

    /**
     * @param catName 
     * @return
     */
    public void setCatName(String catName) {
        this.catName=catName;
    }

    /**
     * @return
     */
    public Set<Category> getParent() {
        return parent;
    }

    /**
     * @param parent 
     * @return
     */
    public void setParent(Set<Category> parent) {
        this.parent=parent;
    }

    /**
     * @return
     */
    public Set<Category> getChildren() {
        return children;
    }

    /**
     * @param children 
     * @return
     */
    public void setChildren(Set<Category> children) {
        this.children=children;
    }

}