package Java_JDK_Sorce.Java_Lang;

/**
 * @author Dong
 * <p>
 * Class Name : Study_String
 * Create Time : 20:50
 * Create Date : 2019/1/27
 * Project : StudyJavaFrameWork
 */

public class Study_String {

    public static void main(String[] args) {
        useString();
    }

    /**
     * 如何使用String？
     */
    private static void useString(){
        //定义方式：
        String str1 = new String("abc");
        String str2 = "abc";
        char str3_c [] = {'a', 'b', 'c'};
        String str3 = new String(str3_c);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        // 提供了基本的+操作

        System.out.println(str1 + str2);

        // 其他方法
    }

//    String 内部保存的是 private final byte[] value
//    String 有两种字符编码，此值取决于JVM private final byte coder;
//    但是如果字符串禁止压缩，则一定使用UTF16
//    String 实现了接口：java.io.Serializable, 所以 String是可以序列化的
//    String类缓存了他自己的hash, 默认为0
//    默认情况下 String可以压缩， 在其中的静态代码块中有写： COMPACT_STRINGS = true;
//    基本默认构造方法中 我们可以看见 当可以压缩的时候 coder = LATIN!,否则为 UT16
//
//    String 方法中 length 的方法会考虑字符编码的格式： return vale.length >> coder;
//    其中 LATIN1 = 0, UTF16 = 1
//
//    String equals 方法中 如果字符编码方式不一至 则认为不相等
//    String 内 引用了大量的 StringLatin1和 StringUTF16的方法
//    这两个类将会在接下来的时间里 逐渐解读
}
