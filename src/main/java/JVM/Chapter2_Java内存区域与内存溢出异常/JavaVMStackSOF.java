package JVM.Chapter2_Java内存区域与内存溢出异常;

/**
 * Created by cycy on 2018/6/26.
 * VM args:
 * -Xss128k
 * 单线程中，栈帧太大或虚拟机栈容量太小，返回的都是StackOverFlow异常
 * 多线程中，不断地建立线程，可以产生OutOfMemory异常
 */
public class JavaVMStackSOF {
    private int stackLength=1;
    public void stackLeak(){
        stackLength++;
        stackLeak();
    }
    public void stackLeakByThread(){
        while(true){
            Thread thread=new Thread(new Runnable() {
                @Override
                public void run() {
                    while(true){}
                }
            });
            thread.start();
        }
    }
    public static void main(String[] args) throws Throwable{
        JavaVMStackSOF oom=new JavaVMStackSOF();
        oom.stackLeakByThread();
        try{
            oom.stackLeak();
        }catch (Throwable e){
            System.out.println("stack length : "+oom.stackLength);
            throw e;
        }
    }
}
