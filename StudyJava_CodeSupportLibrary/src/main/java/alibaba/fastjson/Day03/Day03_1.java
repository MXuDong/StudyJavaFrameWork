package alibaba.fastjson.Day03;

import com.alibaba.fastjson.JSONArray;

import java.util.Vector;

/**
 * @author Dong
 * <p>
 * Class Name : Day03_1
 * Create Time : 21:03
 * Create Date : 2019/1/31
 * Project : StudyJavaFrameWork
 */

public class Day03_1 {
    public static void main(String[] args) {
        JSONArray jsonArray = new JSONArray();
        People me = new People("我自己", 22);
        jsonArray.add(me);
        jsonArray.add("1");

        System.out.println(jsonArray);

        Studyent studyent = new Studyent();
        studyent.studentName = "学生";
        jsonArray.add(studyent);
        System.out.println(jsonArray);

        Vector vector = new Vector();
        JSONArray testVector = new JSONArray(vector);

        testVector.add("什么呢");
        System.out.println(testVector);
    }

    static class Studyent{
        public String studentName;
    }
}



class People{
    private String peopleName;
    private int peopleAge;

    public People(){
        this("None", 0);
    }

    public People(String peopleName, int peopleAge){
        setPeopleName(peopleName);
        setPeopleAge(peopleAge);
    }

    public String getPeopleName() {
        return peopleName;
    }

    public void setPeopleName(String peopleName) {
        this.peopleName = peopleName;
    }

    public int getPeopleAge() {
        return peopleAge;
    }

    public void setPeopleAge(int peopleAge) {
        this.peopleAge = peopleAge;
    }
}