package Lab_2.Task_7;

import java.util.Arrays;

public class University {
    String name;
    String location;
    String rectorName;
    String[] Departments;

    public University() {
        this.name = "Comsats University Islamabad";
        this.location = "Islamabad";
        this.rectorName = "Hammad Saeedi";
        this.Departments = new String[5];
    }

    public University(String name, String rectorName) {
        this.name = name;
        this.rectorName = rectorName;
        this.Departments = new String[5];
    }

    public University(String name, String location, String rectorName, int noOfDepartments) {
        this.name = name;
        this.location = location;
        this.rectorName = rectorName;
        Departments = new String[noOfDepartments];
    }

    public boolean checkIfLocationInCapital(){
        return this.location.toLowerCase().equals("islamabad");
    }

    
    public boolean checkIfLocationInCapitalV2(){
        return this.location.toLowerCase() == "islamabad";
    }

    public String searchDepartment(int index){
        return Departments[index];
    }

    public void setDepartment(String departments, int index){
        Departments[index] = departments;
    }

    @Override
    public String toString() {
        return "University [Name: " + name + ", Location: " + location + ", Rector Name: " + rectorName + ", Departments:" + Arrays.toString(Departments) + "]";
    }

    


    
}
