package JVM.Chapter2_Java内存区域与内存溢出异常;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cycy on 2018/6/26.
 * VM args:
 * -XX:PermSize=1M -XX:MaxPermSize=1M
 */
public class RuntimeConstantPoolOOM {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        int i=0;
        while(true){
            list.add(String.valueOf(i++).intern());
        }
    }
}
