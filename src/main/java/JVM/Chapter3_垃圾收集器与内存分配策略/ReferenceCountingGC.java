package JVM.Chapter3_垃圾收集器与内存分配策略;

/**
 * Created by cycy on 2018/6/26.
 */
public class ReferenceCountingGC {
    public Object instance=null;
    private static final int _1MB=1024*1024;
    private byte[] bigSize=new byte[2*_1MB];

    public static void main(String[] args) {
        ReferenceCountingGC a=new ReferenceCountingGC();
        ReferenceCountingGC b=new ReferenceCountingGC();
        a.instance=b;
        b.instance=a;

        a=null;
        b=null;

        System.gc();
        System.out.println(a);
        System.out.println(b);
        /**
        [GC (System.gc())  6758K->984K(125952K), 0.0023037 secs]
        [Full GC (System.gc())  984K->677K(125952K), 0.0054881 secs]
         说明 a 和 b都被回收了，引用计数法并未被采用
         */
    }
}
