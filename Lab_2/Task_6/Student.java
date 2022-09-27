package Lab_2.Task_6;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student {
    String name;
    float GPA;
    String[] subjects;
    String email;

    public Student() {
        this.name = "Hammad Saeedi";
        this.subjects =  new String[4];
    }

    public Student(String name, float GPA, int noOfSubjects, String email) {
        this.name = name;
        this.GPA = GPA;
        this.subjects = new String[noOfSubjects];
        this.email = email;
    }

    public boolean checkProb(){
        return GPA < 2;
    }

    public boolean validateEmail(){
        if (!(this.email.contains("."))) {
            return false;
        }
        String regex ="^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(this.email);
        return matcher.matches();
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public float getGPA() {
        return GPA;
    }
    
    public void setGPA(float GPA) {
        this.GPA = GPA;
    }
    
    public String getSubject(int index) {
        return subjects[index];
    }
    
    public void setSubjects(String subject, int index) {
        this.subjects[index] = subject;
    }
    
    public String getEmail() {
        return email;
    }

    public int getSubjectNo(){
        return this.subjects.length;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student [Name: " + name + ", Email:" + email + ", GPA: " + GPA + ", Subjects: " + Arrays.toString(subjects)
                + "]";
    }
}
