package alibaba.fastjson.Day06.SerializableUtil;

import java.io.*;

/**
 * @author Dong
 * <p>
 * Class Name : SU
 * Create Time : 15:05
 * Create Date : 2019/2/25
 * Project : StudyJavaFrameWork
 */

public class SU {
    public static boolean write(String fileName, Object beWriteObject){
        if(beWriteObject == null){
            return false;
        }

        ObjectOutputStream objectOutputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            fileOutputStream = new FileOutputStream(fileName);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(beWriteObject);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    public static Object read(String fileName){
        Object beReadObject = null;

        ObjectInputStream objectInputStream = null;
        FileInputStream fileInputStream = null;

        try {
            fileInputStream = new FileInputStream(fileName);
            objectInputStream = new ObjectInputStream(fileInputStream);
            beReadObject = objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return beReadObject;
    }
}
