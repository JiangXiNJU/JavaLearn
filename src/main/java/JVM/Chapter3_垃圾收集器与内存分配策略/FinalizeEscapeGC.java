package JVM.Chapter3_垃圾收集器与内存分配策略;

/**
 * 此代码展示三点
 * 1、对象可以在GC时自我拯救
 * 2、自救机会只有一次，因为一个对象的finalize()方法最多被调用一次
 * 3、finalize()优先级别很低，所以要等待0.5s
 */
public class FinalizeEscapeGC {
    public static FinalizeEscapeGC SAVE_HOOK=null;

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("finalize method executed!");
        FinalizeEscapeGC.SAVE_HOOK=this;
    }

    public static void main(String[] args) throws Throwable {
        SAVE_HOOK=new FinalizeEscapeGC();
        //第一次自救
        SAVE_HOOK=null;
        System.gc();
        Thread.sleep(500);
        if(SAVE_HOOK!=null) System.out.println("I am still alive!");
        else System.out.println("I am dead!");

        //第二次自救
        SAVE_HOOK=null;
        System.gc();
        Thread.sleep(500);
        if(SAVE_HOOK!=null) System.out.println("I am still alive!");
        else System.out.println("I am dead!");
    }
}
