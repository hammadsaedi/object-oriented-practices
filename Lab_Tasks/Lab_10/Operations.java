package Lab_Tasks.Lab_10;

import java.io.*;

public class Operations {
    String path;

    public Operations(String path){
        this.path = path + ".ser";
    }

    public void push(Database db) throws IOException {
        ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(new File(path)));
        stream.writeObject(db);
        stream.close();
    }

    public Object seek() throws ClassNotFoundException, IOException {
        ObjectInputStream stream = new ObjectInputStream(new FileInputStream(new File(path)));
        Object obj = stream.readObject();
        stream.close();
        return obj;
    }
}
