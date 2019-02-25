package alibaba.fastjson.Day06.innerPackage2;

/**
 * @author Dong
 * <p>
 * Class Name : Toy
 * Create Time : 15:19
 * Create Date : 2019/2/25
 * Project : StudyJavaFrameWork
 */

public class Toy {
    String toyName;
    String toyMoney;

    @Override
    public String toString() {
        return "Toy{" +
                "toyName='" + toyName + '\'' +
                ", toyMoney='" + toyMoney + '\'' +
                '}';
    }

    public String getToyName() {
        return toyName;
    }

    public void setToyName(String toyName) {
        this.toyName = toyName;
    }

    public String getToyMoney() {
        return toyMoney;
    }

    public void setToyMoney(String toyMoney) {
        this.toyMoney = toyMoney;
    }
}
