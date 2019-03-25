package Day01;

/**
 * @author Dong
 * <p>
 * Class Name : JavaVMStackSOF
 * Create Time : 8:35
 * Create Date : 2019/3/25
 * Project : StudyJavaFrameWork
 *
 * VM Args: -Xss128k
 */

public class JavaVMStackSOF {
    private int stackLength = 1;

    public void stackLeak(){
        stackLength++;
        stackLeak();
    }

    public static void main(String [] args) throws Throwable{
        JavaVMStackSOF oom = new JavaVMStackSOF();
        try{
            oom.stackLeak();
        }
        catch (Throwable e){
            System.out.println("Stack length :" + oom.stackLength);
            throw e;
        }
    }
}
