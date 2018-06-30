package JVM.Chapter3_垃圾收集器与内存分配策略;

/**
 * Created by cycy on 2018/6/27.
 * 内存分配规则二：大对象直接进入老年代
 * VM args:
 * -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
 * -XX:PretenureSizeThreshold=3145728
 * Parallel Scavenge收集器不认识PretenureSizeThreshold, -XX:+UseSerialGC
 */
public class test_PretenureSizeThreshold {
    private static final int _1MB=1024*1024;

    public static void main(String[] args) {
        byte[] allocation=new byte[4*_1MB];
        /**
         * Heap
         def new generation   total 9216K, used 1658K [0x00000000fec00000, 0x00000000ff600000, 0x00000000ff600000)
         eden space 8192K,  20% used [0x00000000fec00000, 0x00000000fed9eab8, 0x00000000ff400000)
         from space 1024K,   0% used [0x00000000ff400000, 0x00000000ff400000, 0x00000000ff500000)
         to   space 1024K,   0% used [0x00000000ff500000, 0x00000000ff500000, 0x00000000ff600000)
         tenured generation   total 10240K, used 4096K [0x00000000ff600000, 0x0000000100000000, 0x0000000100000000)
         the space 10240K,  40% used [0x00000000ff600000, 0x00000000ffa00010, 0x00000000ffa00200, 0x0000000100000000)
         Metaspace       used 3175K, capacity 4494K, committed 4864K, reserved 1056768K
         class space    used 342K, capacity 386K, committed 512K, reserved 1048576K
         */
    }
}
