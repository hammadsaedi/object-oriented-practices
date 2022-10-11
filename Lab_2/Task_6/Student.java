package Lab_2.Task_6;

import java.util.Objects;
import java.util.regex.Pattern;

public class Student {
    private String name;
    private float GPA;
    private String[] subjects = new String[5];
    private String email;

    /**
     * Instantiate Student Object
     * Name => Hammad Saeedi
     * GPA => 0
     * Subjects:
     * 1- DSA
     * 2- OOP
     * 3- Multi Cal
     * 4- CS
     * 5- Genetics
     * Email => null
     */
    public Student() {
        this.name = "Hammad Saeedi";
        this.subjects[0] = "DSA";
        this.subjects[1] = "OOP";
        this.subjects[2] = "Multi Cal";
        this.subjects[3] = "CS";
        this.subjects[4] = "Genetics";
    }

    /**
     * Instantiate Student Object
     * @param name 
     * @param GPA
     * @param noOfSubjects String array. Recommended Length 5; Object can only hold 5. If more than 5 pass later will be skipped. If less than 5 passed other will be null; 
     * @param email Must be Valid
     * @throws RunTimeException
     */
    public Student(String name, float GPA, String[] subjects, String email) {
        if (name == null) throw new RuntimeException("Name can't be null");
        this.name = name;
        if (GPA < 0 || GPA > 4) throw new RuntimeException("GPA can be negative or greater than 4");
        this.GPA = GPA;
        int n = subjects.length;
        if (subjects.length > this.subjects.length){
            n = this.subjects.length;
        }
        for (int i = 0; i < n; i++) {
            this.subjects[i] = subjects[i];
        }
        if (!validateEmail(email)){
            throw new RuntimeException("Email is Not Valid.");
        }
        this.email = email;
    }

    /**
     * @return true if GPA is less than 2
     */
    public boolean checkProb(){
        return GPA < 2;
    }

    /**
     * @return true if Email is valid
     */
    private boolean validateEmail(String email){
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ "[a-zA-Z0-9_+&*-]+)*@" +  "(?:[a-zA-Z0-9-]+\\.)+[a-z" +  "A-Z]{2,7}$";      
        Pattern pat = Pattern.compile(emailRegex); 
        if (email == null) 
            return false; 
        return pat.matcher(email).matches(); 
    }

    /**
     * @return Name of student
     */
    public String getName() {
        return name;
    }
    
    /**
     * @param name of student; Must not null if so, it will remain same
     */
    public void setName(String name) {
        if (name != null) this.name = name;
    }
    
    /**
     * @return GPA
     */
    public float getGPA() {
        return GPA;
    }
    
    /**
     * Set GPA
     * @param GPA must not negative or more than 4; If so it will remain unchanged
     */
    public void setGPA(float GPA) {
        if (GPA >= 0 && GPA <= 4) this.GPA = GPA;
    }
    
    /**
     * Get Subjects
     * @param index Subject Number 
     * @throws ArraysIndexOutOfBoundsException if chapter Number passed is less than 0 or higher than 4
     * @throws NullPointerException if try to access no initialized subject
     * @return Subject Name
     */
    public String getSubject(int index) {
        if (subjects[index] != null){
            return subjects[index];
        }
        throw new NullPointerException();
    }
    
    /**
     * Set Non-Initialized Subject
     * @param chapterName Append at last; If capacity (5) is filled no addition will take place
     * @return true if chapter is added
     */
    public boolean setSubjects(String subject) {
        for (int i = 0; i < this.subjects.length; i++) {
            if (Objects.isNull(this.subjects[i])){
                this.subjects[i] = subject;
                return true;
            }
        }
        return false;
    }
    
    /**
     * @return Email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set Email
     * @param email email must be valid else remain same
     */
    public void setEmail(String email) {
        if (!validateEmail(email)) {
            throw new RuntimeException("Email is not Valid.");
        }
        this.email = email;
    }

    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("Student [Name: " + name + ", Email: " + email + ", GPA: " + GPA + ", Subjects: ");
        for (int i = 0; i < subjects.length; i++) {
            if (subjects[i] != null){
                buffer.append(subjects[i] + ", ");
                continue;
            } 
            break;
        }
        buffer.append("]");
        return buffer.toString();
    }
}
