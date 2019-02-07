package alibaba.fastjson.Day05.innerPackage;

import java.io.Serializable;

/**
 * @author Dong
 * <p>
 * Class Name : PeopleBySerialize
 * Create Time : 21:46
 * Create Date : 2019/2/6
 * Project : StudyJavaFrameWork
 */

public class PeopleBySerialize implements Serializable {
    private String userName;
    private int userAge;
    private int userNumber;

    public int getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(int userNumber) {
        this.userNumber = userNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    @Override
    public String toString() {
        return "PeopleBySerialize{" +
                "userName='" + userName + '\'' +
                ", userAge=" + userAge +
                '}';
    }
}
