package util;

import java.io.*;

public class FileUtility {

    public static Object readFileDeserialize(String name) {
        Object object = null;
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(name));
            object = inputStream.readObject();
        } finally {
            return object;
        }
    }

    public static boolean writeObjectToFile(Object object, String name) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(name);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);) {
            objectOutputStream.writeObject(object);
            return true;
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }

    }

}
