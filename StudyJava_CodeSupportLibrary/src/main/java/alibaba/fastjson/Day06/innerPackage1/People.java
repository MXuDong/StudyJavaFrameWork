package alibaba.fastjson.Day06.innerPackage1;

/**
 * @author Dong
 * <p>
 * Class Name : People
 * Create Time : 15:02
 * Create Date : 2019/2/25
 * Project : StudyJavaFrameWork
 */

public class People{
    String peopleName;
    int peopleAge;

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

    @Override
    public String toString() {
        return "People{" +
                "peopleName='" + peopleName + '\'' +
                ", peopleAge=" + peopleAge +
                '}';
    }
}
