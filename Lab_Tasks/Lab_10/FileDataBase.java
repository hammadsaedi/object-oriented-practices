package Lab_Tasks.Lab_10;

import java.util.ArrayList;
import java.io.*;


public class FileDataBase {
    private File file;

    FileDataBase(File file){
        this.file = file;
    }

    private ArrayList<Student> seekAll() throws FileNotFoundException, IOException {
        ArrayList<Student> list = new ArrayList<>();
        ObjectInputStream stream = new ObjectInputStream(new FileInputStream(file));
        try {
            while(true) {
                list.add((Student)stream.readObject());
            }
        } catch (ClassNotFoundException exp ){
            return list;
        }
    }

    public void addAStudent(Student student) throws FileNotFoundException, IOException {
        ObjectOutputStream stream;
        if (file.exists()){
            stream = new CustomStream(new FileOutputStream(file, true));
        } else {
            stream = new ObjectOutputStream(new FileOutputStream(file, true));
        }
        stream.writeObject(student);
        stream.close();
    }

    public void displayAllStudents(){
        ArrayList<Student> list = new ArrayList<>();
        try {
            ArrayList<Student> list = seekAll();
        } catch (IOException e) {
            e.printStackTrace();
        }


        
    }

}
