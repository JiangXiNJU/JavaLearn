package JVM.Chapter3_垃圾收集器与内存分配策略;

/**
 * Created by cycy on 2018/6/27.
 * 内存分配规则之五：空间分配担保
 * -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:+UseSerialGC
 * -XX:-HandlePromotionFailure
 * JDK6 Update24之后，HandlePromotionFailure参数不再影响到虚拟机的空间分配担保策略
 * 只要老年代的连续空间大于新生代对象总大小或者历次晋升的平均大小就会进行Minor GC，否则将进行Full GC
 */
public class test_HandlePromotion {
    private static final int _1MB=1024*1024;

    public static void main(String[] args) {
        byte[] alloc1,alloc2,alloc3,alloc4,alloc5,alloc6,alloc7;
        System.out.println("alloc1-3 赋值");
        alloc1=new byte[_1MB*2];
        alloc2=new byte[_1MB*2];
        alloc3=new byte[_1MB*2];
        System.out.println("alloc1 = null");
        alloc1=null;
        System.out.println("alloc4-6 赋值");
        System.out.println("alloc4 赋值");
        alloc4=new byte[_1MB*2];
        System.out.println("alloc5 赋值");
        alloc5=new byte[_1MB*2];
        System.out.println("alloc6 赋值");
        alloc6=new byte[_1MB*2];
        System.out.println("alloc4-6 = null");
        alloc4=null;
        alloc5=null;
        alloc6=null;
        System.out.println("alloc7 赋值");
        alloc7=new byte[_1MB*2];

        /**
         * alloc1-3 赋值
         alloc1 = null
         alloc4-6 赋值
         alloc4 赋值
         [GC (Allocation Failure) [DefNew: 7638K->678K(9216K), 0.0025122 secs] 7638K->4774K(19456K), 0.0025393 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
         alloc5 赋值
         alloc6 赋值
         alloc4-6 = null
         alloc7 赋值
         [GC (Allocation Failure) [DefNew: 7063K->1K(9216K), 0.0013870 secs] 11159K->4772K(19456K), 0.0014179 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
         Heap
         def new generation   total 9216K, used 2185K [0x00000000fec00000, 0x00000000ff600000, 0x00000000ff600000)
         **eden space 8192K,  26% used [0x00000000fec00000, 0x00000000fee21f60, 0x00000000ff400000)
         from space 1024K,   0% used [0x00000000ff400000, 0x00000000ff4005b8, 0x00000000ff500000)
         to   space 1024K,   0% used [0x00000000ff500000, 0x00000000ff500000, 0x00000000ff600000)
         tenured generation   total 10240K, used 4770K [0x00000000ff600000, 0x0000000100000000, 0x0000000100000000)
         **the space 10240K,  46% used [0x00000000ff600000, 0x00000000ffaa8b08, 0x00000000ffaa8c00, 0x0000000100000000)
         Metaspace       used 3228K, capacity 4494K, committed 4864K, reserved 1056768K
         class space    used 348K, capacity 386K, committed 512K, reserved 1048576K

         */
    }
}
