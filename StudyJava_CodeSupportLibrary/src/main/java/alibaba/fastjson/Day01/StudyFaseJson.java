package alibaba.fastjson.Day01;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Dong
 * <p>
 * Class Name : StudyFaseJson
 * Create Time : 19:00
 * Create Date : 2019/1/29
 * Project : StudyJavaFrameWork
 */

public class StudyFaseJson {
    public static void main(String[] args) {
        baseUseJson();
    }

    private static void baseUseJson(){
        //声明一个基本的JSON对象
        JSONObject jsonObject = new JSONObject();
        //存放连个数据，姓名和年龄
        jsonObject.put("name", "赵本山");
        jsonObject.put("age", 15);
        //打印一下
        System.out.println(jsonObject);

        //那如果存入一个人类呢，看看行不行
        JSONObject peopleJSON = new JSONObject();
        People people = new People();
        people.peopleAge = 15;
        people.peopleName = "赵四";
        peopleJSON.put("people", people);
        System.out.println(peopleJSON);
        //这里有个小东西，当类的字段没有添加访问器和控制器的时候，该字段为不可见，JSON无法获取
        //或者将字段设置为public 也是可以的
        //而且如果不是基本类的话，json会将传入的数据自动转换为JSON格式的数据

        //JSON数组， FastJson 中提供了JSON数组
        //而且这个数组还实现了List的方法，所以他还是个list
        //试用一下

        JSONArray jsonArray = new JSONArray();
        jsonArray.add(peopleJSON);
        jsonArray.add(jsonObject);

        System.out.println(jsonArray);
        //出来的数据确实是个数组，这里他应该重写了toString方法

        //因为他是个list，所以 应该还可以放其他的东西把
        jsonArray.add(people);
        System.out.println(jsonArray);
        //他给转换成了 一个字符串，如下：{"$ref":"$[0].people"}
        //这个东西怎来的稍后讨论

        //对于JSONArray的遍历
        //由于JSONArray是一个list，所以我们可以使用foeEach的方式进行遍历

        for(Object object : jsonArray){
            System.out.println(object);
        }

        //除了对后一个我们放进去的People类以外，其他均是json对象
        //对于JSONObject数据的遍历，可以参考HashMap

        for(String keyName : jsonObject.keySet()){
            System.out.println(keyName + ":" + jsonObject.get(keyName));
        }

        // JSON 中可以通过map 直接赋值
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("第一个", "测试1");
        map.put("第二个", "测试2");

        JSONObject json = new JSONObject(map);

        System.out.println(json);

        map.put("第三个", "测试3");

        System.out.println(json);
        //这里 如果传入的是Map类型的数据，JsonObject并不会创建新的，而是直接复制索引
        //因此原来的map如果发生改变，那么JSON内的数据也会发生改变

        //JSONObject 也可以指定哪一种类型的Map， 共有两种选择，HashMap 和 LinkedHashMap
        //这就是JSON的基本使用
    }

    static class People{
        public String peopleName;
        public int peopleAge;
    }
}

/*
今天主要学习Java中常用的一个第三方库：fastJson

JSON 是一种数据格式，是键值对的存储方式，这种方式便于人的理解，相比于xml的方式，确实美观不少

具体的对比请Google搜索

 */