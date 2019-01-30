package alibaba.fastjson.Day02;

import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;

/**
 * @author Dong
 * <p>
 * Class Name : Day02_1
 * Create Time : 21:45
 * Create Date : 2019/1/30
 * Project : StudyJavaFrameWork
 */

public class Day02_1 {
    /*
    主要阅读JSONObject 的 源码
     */

    public static void main(String[] args) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("1", 1);
        System.out.println(jsonObject);

        System.out.println(jsonObject.get(1));

        jsonObject.fluentPut("2",2)
                .fluentPut("3", 3);

        System.out.println(jsonObject);
    }
}
