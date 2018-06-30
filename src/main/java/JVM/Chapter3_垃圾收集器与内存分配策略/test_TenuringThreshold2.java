package JVM.Chapter3_垃圾收集器与内存分配策略;

/**
 * Created by cycy on 2018/6/27.
 * 内存分配规则之四：动态对象年龄判定
 * VM args:
 * -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:+UseSerialGC
 * 在年轻代存活的最大年龄 -XX:MaxTenuringThreshold=15  -XX:+PrintTenuringDistribution
 *
 * 为了更好地适应不同程序的内存情况，JVM并不是永远要求对象的年龄必须达到MaxTenuringThreshold才能晋升老年代
 * 如果在Survivor空间中相同年龄所有对象大小的总和大于Survivor空间的一半，大于等于此年龄的对象就可以直接进入老年代
 * 问题：age3 0.4MB，age2 0.4MB，age1 0.4MB 怎么办？age1 0.4MB 进入老年代
 */
public class test_TenuringThreshold2 {
    private static final int _1MB=1024*1024;

    public static void main(String[] args) {
        System.gc();
        byte[] alloc1,alloc2,alloc3,alloc4;
        alloc1=new byte[_1MB/4];
        alloc2=new byte[_1MB/4];
        //alloc1+alloc2>Survivor的一半
        alloc3=new byte[_1MB*4];
        alloc4=new byte[_1MB*4];
        alloc4=null;
        alloc4=new byte[_1MB*4];

        /**
         * [GC (Allocation Failure) [DefNew
         Desired survivor size 524288 bytes, new threshold 1 (max 15)
         - age   1:     529560 bytes,     529560 total
         : 4935K->517K(9216K), 0.0014143 secs] 5613K->5290K(19456K), 0.0014296 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
         [GC (Allocation Failure) [DefNew
         Desired survivor size 524288 bytes, new threshold 15 (max 15)
         - age   1:        440 bytes,        440 total
         : 4695K->0K(9216K), 0.0003428 secs] 9468K->5291K(19456K), 0.0003669 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
         Heap
         def new generation   total 9216K, used 4232K [0x00000000fec00000, 0x00000000ff600000, 0x00000000ff600000)
         **eden space 8192K,  51% used [0x00000000fec00000, 0x00000000ff021ee0, 0x00000000ff400000)
         from space 1024K,   0% used [0x00000000ff400000, 0x00000000ff4001b8, 0x00000000ff500000)
         to   space 1024K,   0% used [0x00000000ff500000, 0x00000000ff500000, 0x00000000ff600000)
         tenured generation   total 10240K, used 5290K [0x00000000ff600000, 0x0000000100000000, 0x0000000100000000)
         **the space 10240K,  51% used [0x00000000ff600000, 0x00000000ffb2aa58, 0x00000000ffb2ac00, 0x0000000100000000)
         Metaspace       used 3273K, capacity 4494K, committed 4864K, reserved 1056768K
         class space    used 354K, capacity 386K, committed 512K, reserved 1048576K
         */
    }
}
