package alibaba.fastjson.Day04;

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
        InputStream imputStream = AccessController.doPrivileged(new PrivilegedAction<InputStream>() {
            public InputStream run() {
                ClassLoader cl = Thread.currentThread().getContextClassLoader();
                if (cl != null) {
                    return cl.getResourceAsStream("fastjson.properties");
                } else {
                    return ClassLoader.getSystemResourceAsStream("fastjson.properties");
                }
            }
        });

        System.out.println(imputStream);
    }
}
