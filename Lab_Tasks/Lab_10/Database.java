package Lab_Tasks.Lab_10;

import java.util.ArrayList;

public class Database extends ArrayList<Student> {
    
    public void addAStudent(Student student){
        add(new Student(student));
    }

    public void displayAllStudents(){
        System.out.println(toString());
    }

    public Student searchAStudent(String regNum){
        for (int i = 0; i < size(); i++) {
            if(get(i).getRegNum().equals(regNum)) 
                return get(i);
        }
        return null;
    }

    public Student deleteAStudent(String regNum){
        for (int i = 0; i < size(); i++) {
            if(get(i).getRegNum().equals(regNum)){
                Student student = get(i);
                remove(i);
                return student;
            }    
        }
        return null;
    }

    public boolean updateMail(String regNum, String mail){
        for (int i = 0; i < size(); i++) {
            if(get(i).getRegNum().equals(regNum)) {
                get(i).setMail(mail);
                return true;
            }
        }
        return false;
    } 

    public boolean updateDepartment(String regNum, String departmentName){
        for (int i = 0; i < size(); i++) {
            if(get(i).getRegNum().equals(regNum)) {
                get(i).getDepartment().setName(departmentName);
                return true;
            }
        }
        return false;
    }

    public int countAllStudentOnProb(){
        int count = 0;
        for (int i = 0; i < size(); i++) {
            if(get(i).getGpa() < 2) {
                count++;
            }
        }
        return count;
    }

    public void displayAllStudentsInDepartment(String departmentName){
        for (int i = 0; i < size(); i++) {
            if(get(i).getDepartment().getName().equals(departmentName)) {
                System.out.println(get(i));
            }
        }
    }

    public void deleteAllStudentsInDepartment(String departmentName){
        for (int i = 0; i < size(); i++) {
            if(get(i).getDepartment().getName().equals(departmentName)){
                remove(i);
            }    
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Database: \n");
        for (int i = 0; i < size(); i++) {
            builder.append(get(i).toString());
            builder.append("\n");
        }
        builder.append("]");
        return builder.toString();
    }
}
