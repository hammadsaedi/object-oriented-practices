package Lab_3.Task_7;

import java.util.Objects;

public class University {
    private String name;
    private String location;
    private String rectorName;
    private String[] Departments = new String[20];

    /**
     * Instantiate University
     */
    public University() {
        this("Blockchain University Islamabad", "Islamabad", "Hammad Saeedi", new String[]{"Financial Technologies", "Blockchain Technologies", "Crypto Trading Analytics", "Web3+"});
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

        if (Objects.isNull(rectorName)) throw new RuntimeException("Rector Name cannot be Null.");
        this.rectorName = rectorName;

        int n = getCompatibleSize(Departments);
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
     * Check if department exist
     * @param department to be searched
     * @return true if it exist
     */
    public boolean searchDepartment(String department) {
        for (int i = 0; i < Departments.length; i++) {
            if (Objects.isNull(this.Departments[i])) break;
            if (Departments[i].equals(department)) return true;
        }
        return false;
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

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getRectorName() {
        return rectorName;
    }

    public String[] getDepartments() {
        return getDeepCopySubject();
    }

    public void setName(String name) {
        if (Objects.nonNull(name)) this.name = name;
    }

    public void setLocation(String location) {
        if (Objects.nonNull(location)) this.location = location;
    }

    public void setRectorName(String rectorName) {
        if (Objects.nonNull(rectorName)) this.rectorName = rectorName;
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


    private int getCompatibleSize(String[] Departments){
        return Math.min(this.Departments.length, Departments.length);
    }

    /**
     * Returns Deep Copy of Subject array
     * @return subject
     */
    private String[] getDeepCopySubject() {
        String[] buffer = new String[getSizeOfSubjects()];
        for (int i = 0; i < this.Departments.length; i++){
            if (Objects.isNull(this.Departments[i])) break;
            buffer[i] = this.Departments[i];
        }
        return buffer;
    }


    private int getSizeOfSubjects(){
        int count = 0;
        while (count < Departments.length) {
            if (Objects.isNull(Departments[count])) break;
            count++;
        }
        return count;
    }    
}
