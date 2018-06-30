package JVM.Chapter3_垃圾收集器与内存分配策略;

/**
 * Created by cycy on 2018/6/27.
 * 内存分配规则之三：长期存活的对象将进入老年代
 ** VM args:
 * -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:+UseSerialGC
 * 在年轻代存活的最大年龄 -XX:MaxTenuringThreshold=1
 * -XX:+PrintTenuringDistribution
 * 对象在Eden区出生，经过第一次Minor GC仍然能存活(否则被GC)，且能被Survivor区容纳(否则即使熬过Minor GC，仍然会被移到老年代，例如allocation2)
 * 将被移到Survivor区，年龄设为1，此后每熬过一次Minor GC，年龄增加1岁，直到达到上限被移到老年代
 */
public class test_TenuringThreshold {
    private static final int _1MB=1024*1024;

    public static void main(String[] args) {
        System.gc();
        byte[] allocation1,allocation2,allocation3;
        allocation1=new byte[_1MB/4];
        //什么时候进入老年代取决于-XX:MaxTenuringThreshold的设置
        allocation2=new byte[4*_1MB];
        allocation3=new byte[4*_1MB];//Minor GC
        allocation3=null;
        allocation3=new byte[4*_1MB];//

        /**
         * -XX:MaxTenuringThreshold=1
         * Desired survivor size 524288 bytes, new threshold 1 (max 1)
         - age   1:        664 bytes,        664 total
         : 5112K->0K(9216K), 0.0008449 secs] 9208K->5026K(19456K), 0.0008554 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
         Heap
         def new generation   total 9216K, used 4232K [0x00000000fec00000, 0x00000000ff600000, 0x00000000ff600000)
         eden space 8192K,  51% used [0x00000000fec00000, 0x00000000ff021ed0, 0x00000000ff400000)
         **from space 1024K,   0% used [0x00000000ff400000, 0x00000000ff400298, 0x00000000ff500000)
         to   space 1024K,   0% used [0x00000000ff500000, 0x00000000ff500000, 0x00000000ff600000)
         tenured generation   total 10240K, used 5026K [0x00000000ff600000, 0x0000000100000000, 0x0000000100000000)
         **the space 10240K,  49% used [0x00000000ff600000, 0x00000000ffae8928, 0x00000000ffae8a00, 0x0000000100000000)
         Metaspace       used 3212K, capacity 4494K, committed 4864K, reserved 1056768K
         class space    used 347K, capacity 386K, committed 512K, reserved 1048576K
         */

        /**
         * -XX:MaxTenuringThreshold=15
         * [Full GC (System.gc()) [Tenured: 0K->676K(10240K), 0.0026150 secs] 1494K->676K(19456K), [Metaspace: 3169K->3169K(1056768K)], 0.0026631 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
         [GC (Allocation Failure) [DefNew
         Desired survivor size 524288 bytes, new threshold 15 (max 15)
         - age   1:     262616 bytes,     262616 total
         : 4679K->256K(9216K), 0.0015414 secs] 5356K->5029K(19456K), 0.0015579 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
         [GC (Allocation Failure) [DefNew
         Desired survivor size 524288 bytes, new threshold 15 (max 15)
         - age   1:        160 bytes,        160 total
         - age   2:     262528 bytes,     262688 total
         : 4434K->256K(9216K), 0.0002371 secs] 9207K->5029K(19456K), 0.0002473 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
         Heap
         def new generation   total 9216K, used 4488K [0x00000000fec00000, 0x00000000ff600000, 0x00000000ff600000)
         eden space 8192K,  51% used [0x00000000fec00000, 0x00000000ff021e70, 0x00000000ff400000)
         **from space 1024K,  25% used [0x00000000ff400000, 0x00000000ff440220, 0x00000000ff500000)
         to   space 1024K,   0% used [0x00000000ff500000, 0x00000000ff500000, 0x00000000ff600000)
         tenured generation   total 10240K, used 4773K [0x00000000ff600000, 0x0000000100000000, 0x0000000100000000)
         **the space 10240K,  46% used [0x00000000ff600000, 0x00000000ffaa9408, 0x00000000ffaa9600, 0x0000000100000000)
         Metaspace       used 3208K, capacity 4494K, committed 4864K, reserved 1056768K
         class space    used 345K, capacity 386K, committed 512K, reserved 1048576K

         */
    }
}
