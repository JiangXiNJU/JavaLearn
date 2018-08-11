package Descriptor.Override;

import static java.lang.System.out;

/**
 * Created by cycy on 2018/8/2.
 */
public class SuperClass {
    public void method1(){
        out.println("SuperClass");
        method2();
    }
    public void method2(){
        out.println("SuperClass");
        out.println("method2");
    }
}
