package JVM.Chapter8_虚拟机字节码执行引擎;

import static java.lang.System.out;

/**
 * Created by cycy on 2018/8/2.
 */
public class InvokeMethods {
    static class Human{
        public void sayHello()
        {
            out.println("Human say hello");
        }
    }
    static class Man extends Human{
        public void sayHello(){
            out.println("Man say hello");
        }
    }
    static class Woman extends Human{
        public void sayHello(){
            out.println("Woman say hello");
        }
    }

    public static void sayhello(Human h){
        out.println("Executor: Human");
        h.sayHello();
    }
    public static void sayhello(Man h){
        out.println("Executor: Man");
        h.sayHello();
    }
    public static void sayhello(Woman h){
        out.println("Executor: Woman");
        h.sayHello();
    }
    public static void main(String[] args) {
        Human man=new Man();
        Human woman=new Woman();
        sayhello(man);
        sayhello(woman);
    }
}
