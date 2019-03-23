package alibaba.fastjson.Day06.innerPackage2;

import alibaba.fastjson.Day06.SerializableUtil.SU;

/**
 * @author Dong
 * <p>
 * Class Name : TestUse
 * Create Time : 15:23
 * Create Date : 2019/2/25
 * Project : StudyJavaFrameWork
 */

public class TestUse {
    public static void main(String[] args) {
        Toy toy = new Toy();
        toy.setToyMoney("22.26$");
        toy.setToyName("布娃娃");

        Child child = new Child();
        child.setChildAge(15);
        child.setChildName("赵本山");
        child.setToy(toy);

        System.out.println(child);

        SU.write("testSerializable", child);

        Child beRead = (Child) SU.read("testSerializable");
        System.out.println(beRead);
    }
}
