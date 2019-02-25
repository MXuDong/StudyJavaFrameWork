package alibaba.fastjson.Day06.innerPackage1;

import java.io.Serializable;

/**
 * @author Dong
 * <p>
 * Class Name : Student
 * Create Time : 15:03
 * Create Date : 2019/2/25
 * Project : StudyJavaFrameWork
 */

public class Student extends People implements Serializable {
    String studentNumber;

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentNumber='" + studentNumber + '\'' +
                ", peopleName='" + peopleName + '\'' +
                ", peopleAge=" + peopleAge +
                '}';
    }
}
