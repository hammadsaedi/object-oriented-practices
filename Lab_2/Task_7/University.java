package Lab_2.Task_7;

import java.util.Objects;

public class University {
    private String name;
    private String location;
    private String rectorName;
    private String[] Departments = new String[20];

    /**
     * Instantiate University
     * name => Comsats University Islamabad
     * location => Islamabad
     * rector name => Hammad Saeedi
     * Departments:
     * 1- Computer Science
     * 2- Cyber Security
     * 3- Data Science
     * 4- Blockchain Technologies
     */
    public University() {
        this.name = "Comsats University Islamabad";
        this.location = "Islamabad";
        this.rectorName = "Hammad Saeedi";
        Departments[0] = "Computer Science";
        Departments[1] = "Cyber Security";
        Departments[2] = "Data Science";
        Departments[3] = "Blockchain Technologies";
    }

    /**
     * Instantiate University
     * @param name Cannot be null; if passed @throws RuntimeException
     * @param rectorName
     */
    public University(String name, String rectorName) {
        if (Objects.isNull(name)) throw new RuntimeException("Name cannot be Null.");
        this.name = name;
        this.rectorName = rectorName;
        this.location = new String();
    }

    /**
     * Instantiate University
     * @param name Cannot be null; if passed @throws RuntimeException
     * @param location Cannot be null; if passed @throws RuntimeException
     * @param rectorName
     * @param Departments String array. Recommended Length 5; Object can only hold 20. If more than 20 pass later will be skipped. If less than 20 passed other will be null; 
     */
    public University(String name, String location, String rectorName, String[] Departments) {
        if (Objects.isNull(name)) throw new RuntimeException("Name cannot be Null.");
        this.name = name;
        if (Objects.isNull(location)) throw new RuntimeException("Location cannot be Null.");
        this.location = location;
        this.rectorName = rectorName;
        int n = Departments.length;
        if (Departments.length > this.Departments.length){
            n = this.Departments.length;
        }
        for (int i = 0; i < n; i++) {
            this.Departments[i] = Departments[i];
        }
    }

    /**
     * @return true if Location is Capital i.e. Islamabad
     */
    public boolean checkIfLocationInCapital(){
        return this.location.toLowerCase().equals("islamabad");
    }

    /**
     * Get Department
     * @param index Department Number 
     * @throws ArraysIndexOutOfBoundsException if Department Number passed is less than 0 or higher than 19
     * @throws NullPointerException if try to access no initialized subject
     * @return Department Name
     */
    public String searchDepartment(int index){
        if (Departments[index] != null){
            return Departments[index];
        }
        throw new NullPointerException();
    }

    /**
     * Set Non-Initialized Departments
     * @param departments Append at last; If capacity (20) is filled no addition will take place
     * @return true if departments is added
     */
    public boolean setDepartment(String departments){
        for (int i = 0; i < this.Departments.length; i++) {
            if (Objects.isNull(this.Departments[i])){
                this.Departments[i] = departments;
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder();
        buffer.append( "University [Name: " + name + ", Location: " + location + ", Rector Name: " + rectorName + ", Departments: ");
        for (int i = 0; i < Departments.length; i++) {
            if (Departments[i] != null){
                buffer.append(Departments[i] + ", ");
                continue;
            } 
            break;
        }
        buffer.append("]");
        return buffer.toString();
    }    
}
