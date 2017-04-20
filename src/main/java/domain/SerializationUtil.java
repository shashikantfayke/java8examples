package domain;


import java.io.*;

public class SerializationUtil {


    public void serialize(Object object,String fileName) throws IOException {

        FileOutputStream fos=new FileOutputStream(fileName);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(object);
        fos.close();
        oos.close();

    }

    public Object deSerialize(Object object,String fileName) throws IOException, ClassNotFoundException {
        FileInputStream fis=new FileInputStream(fileName);
        ObjectInputStream ois=new ObjectInputStream(fis);
       Object newObject= ois.readObject();
        fis.close();
        ois.close();
        return newObject;
    }

}
