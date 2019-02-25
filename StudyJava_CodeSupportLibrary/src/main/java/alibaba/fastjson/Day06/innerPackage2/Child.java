package alibaba.fastjson.Day06.innerPackage2;


import java.io.Serializable;

/**
 * @author Dong
 * <p>
 * Class Name : Child
 * Create Time : 15:19
 * Create Date : 2019/2/25
 * Project : StudyJavaFrameWork
 */

public class Child implements Serializable {
    String ChildName;
    int childAge;
    Toy toy;

    @Override
    public String toString() {
        return "Child{" +
                "ChildName='" + ChildName + '\'' +
                ", childAge=" + childAge +
                ", toy=" + toy +
                '}';
    }

    public String getChildName() {
        return ChildName;
    }

    public void setChildName(String childName) {
        ChildName = childName;
    }

    public int getChildAge() {
        return childAge;
    }

    public void setChildAge(int childAge) {
        this.childAge = childAge;
    }

    public Toy getToy() {
        return toy;
    }

    public void setToy(Toy toy) {
        this.toy = toy;
    }
}
