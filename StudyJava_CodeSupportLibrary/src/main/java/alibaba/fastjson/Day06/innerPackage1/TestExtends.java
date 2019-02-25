package alibaba.fastjson.Day06.innerPackage1;

import alibaba.fastjson.Day06.SerializableUtil.SU;

/**
 * @author Dong
 * <p>
 * Class Name : TestExtends
 * Create Time : 15:10
 * Create Date : 2019/2/25
 * Project : StudyJavaFrameWork
 */

public class TestExtends {
    public static void main(String[] args) {
        Student student = new Student();
        student.setStudentNumber("11011");
        student.setPeopleAge(15);
        student.setPeopleName("赵本山");

        System.out.println(student);
        SU.write("testSerializable", student);
        Student beRead = (Student) SU.read("testSerializable");
        System.out.println(beRead);
    }
}
