package Playground.Single;

import java.time.LocalDate;
import java.util.Objects;

public class Single {
    /**
     * Instance of class
    */
    private static Single object;
    
    /**
     * Instantiate Class:
     * Set to private; Unaccessible outside of class
     */
    private Single () {
        this.dob =  LocalDate.now().getDayOfMonth();
    }

    /**
     * @return Instance of Class
     * @throws RuntimeException Cannot Instantiate Multiple Objects
     * @apiNote Static Method
     */
    public static Single getInstance(){
        if (Objects.nonNull(object)) throw new RuntimeException("Cannot Instantiate Multiple Objects.");
        return object = new Single();
    }

    /**
     * State Variable
    */
    private String name;
    private int dob;

    /**
     * @return Name of Object
     */
    public String getName() {
        return name;
    }

    /**
     * Set name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get Day of Instantiation
     * @return
     */
    public int getDob() {
        return dob;
    }

    @Override
    public String toString() {
        return "Single [name=" + name + ", dob=" + dob + "]";
    }    
}