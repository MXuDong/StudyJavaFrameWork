package alibaba.fastjson.Day04;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.io.InputStream;
import java.security.AccessController;
import java.security.PrivilegedAction;

/**
 * @author Dong
 * <p>
 * Class Name : Day04_1
 * Create Time : 21:41
 * Create Date : 2019/2/3
 * Project : StudyJavaFrameWork
 */

/*
FastJson - JSON 类
 */
public class Day04_1 {
    public static void main(String[] args) {
        People people = new People();
        people.peopleName = "测试";
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("测试默认用例", "测试默认");
        jsonObject.put("people",people);
        jsonObject.put("people2", people);

        JSONArray jsonArray = new JSONArray();
        jsonArray.add(new JSONObject());
        jsonArray.add(jsonObject);
        jsonArray.add(people);

        System.out.println(jsonObject);
        System.out.println(jsonArray);

    }

    static class People{
        public String peopleName;
    }
}

