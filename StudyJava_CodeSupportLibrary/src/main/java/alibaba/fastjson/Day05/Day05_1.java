package alibaba.fastjson.Day05;

import alibaba.fastjson.Day05.innerPackage.PeopleBySerialize;

import java.io.*;

/**
 * @author Dong
 * <p>
 * Class Name : Day05_1
 * Create Time : 21:38
 * Create Date : 2019/2/6
 * Project : StudyJavaFrameWork
 */

public class Day05_1 {
    public static void main(String[] args) {
        PeopleBySerialize people = new PeopleBySerialize();
        people.setUserAge(15);
        people.setUserName("赵本山");
        people.setUserNumber(151);
        System.out.println(people);

        ObjectOutputStream oos = null;

        try {
            oos = new ObjectOutputStream(new FileOutputStream("testSerialize"));
            oos.writeObject(people);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream("testSerialize");
            ois = new ObjectInputStream(fis);
            PeopleBySerialize people1 = (PeopleBySerialize)ois.readObject();
            System.out.println(people1);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


}
