package JVM.Chapter2_Java内存区域与内存溢出异常;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cycy on 2018/6/26.
 * VM args:
 * -Xms20m -Xmx20m ：堆的最小值与最大值设为相同，可以避免堆扩展
 * -XX:+HeapDumpOnOutOfMemoryError : 让虚拟机在出现内存溢出异常时Dump出当前的内存堆转储快照，以便事后进行分析
 */
public class HeapOOM {
    static class OOMObject{}
    public static void main(String[] args){
        List<OOMObject> list=new ArrayList<OOMObject>();
        while(true){
            list.add(new OOMObject());
        }
    }
}
