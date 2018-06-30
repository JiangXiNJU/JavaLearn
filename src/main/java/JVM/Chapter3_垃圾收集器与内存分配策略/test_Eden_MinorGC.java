package JVM.Chapter3_垃圾收集器与内存分配策略;

/**
 * Created by cycy on 2018/6/27.
 * 内存分配规则一：对象优先在Eden分配
 * VM args:
 * -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:+UseSerialGC
 */
public class test_Eden_MinorGC {
    private static final int _1MB=1024*1024;

    public static void main(String[] args) {
        System.gc();
        byte[] allocation1,allocation2,allocation3,allocation4;
        allocation1=new byte[2*_1MB];
        allocation2=new byte[2*_1MB];
        allocation3=new byte[2*_1MB];
        allocation4=new byte[4*_1MB];//出现一次Minor GC
        System.gc();
        /**
         * Parallel Scavenge + ParOld
         * Heap
         PSYoungGen      total 9216K, used 7802K [0x00000000ff600000, 0x0000000100000000, 0x0000000100000000)
         eden space 8192K, 95% used [0x00000000ff600000,0x00000000ffd9eaa8,0x00000000ffe00000)
         from space 1024K, 0% used [0x00000000fff00000,0x00000000fff00000,0x0000000100000000)
         to   space 1024K, 0% used [0x00000000ffe00000,0x00000000ffe00000,0x00000000fff00000)
         ParOldGen       total 10240K, used 4096K [0x00000000fec00000, 0x00000000ff600000, 0x00000000ff600000)
         object space 10240K, 40% used [0x00000000fec00000,0x00000000ff000010,0x00000000ff600000)
         Metaspace       used 3264K, capacity 4494K, committed 4864K, reserved 1056768K
         class space    used 350K, capacity 386K, committed 512K, reserved 1048576K
         */

        /**
         * Serial + SerailOld
         * [GC (Allocation Failure) [DefNew: 7638K->687K(9216K), 0.0035074 secs] 7638K->6831K(19456K), 0.0035383 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
         Heap
         def new generation   total 9216K, used 4947K [0x00000000fec00000, 0x00000000ff600000, 0x00000000ff600000)
         eden space 8192K,  52% used [0x00000000fec00000, 0x00000000ff029148, 0x00000000ff400000)
         from space 1024K,  67% used [0x00000000ff500000, 0x00000000ff5abcd0, 0x00000000ff600000)
         to   space 1024K,   0% used [0x00000000ff400000, 0x00000000ff400000, 0x00000000ff500000)
         tenured generation   total 10240K, used 6144K [0x00000000ff600000, 0x0000000100000000, 0x0000000100000000)
         the space 10240K,  60% used [0x00000000ff600000, 0x00000000ffc00030, 0x00000000ffc00200, 0x0000000100000000)
         Metaspace       used 3230K, capacity 4494K, committed 4864K, reserved 1056768K
         class space    used 347K, capacity 386K, committed 512K, reserved 1048576K
         */
    }
}
