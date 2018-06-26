package JVM.Chapter2_Java内存区域与内存溢出异常;

import static java.lang.System.out;

/**
 * Created by cycy on 2018/6/14.
 * 如果线程请求的栈深度大于JVM所允许的深度，将抛出StackOverflowError
 * 如果虚拟机栈可以动态扩展，且扩展时无法申请到足够的内存，将抛出OutOfMemoryError
 */
public class RecursionAndStack {
    public void recur(int x){
        out.println(x);
        recur(x);
    }
    public static void main(String[] args){
        RecursionAndStack s=new RecursionAndStack();
        s.recur(1);
    }
}
