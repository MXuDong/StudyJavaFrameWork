package Day01;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dong
 * <p>
 * Class Name : HeapOOM
 * Create Time : 8:08
 * Create Date : 2019/3/25
 * Project : StudyJavaFrameWork
 *
 * JVM Params: -Xms20m -Xmx20m -XX:HeapDumpOnOutOfMemoryError
 */

public class HeapOOM {
    static class OOMObject{

    }

    public static void main(String [] args){
        List<OOMObject> oomObjects = new ArrayList<>();

        while(true){
            oomObjects.add(new OOMObject());
        }
    }
}
