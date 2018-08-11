package Descriptor.Override;

import static java.lang.System.out;

/**
 * Created by cycy on 2018/8/2.
 */
public class SubClass extends SuperClass {
    public void method2(){
        out.println("SubClass");
        out.println("method2");
    }

    public static void main(String[] args) {
        new SubClass().method1();
    }
}
