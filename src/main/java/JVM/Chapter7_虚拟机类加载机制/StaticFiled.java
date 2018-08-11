package JVM.Chapter7_虚拟机类加载机制;

/**
 * Created by cycy on 2018/7/29.
 */


class SuperClass{
    static{
        System.out.println("Super Class init");
    }
    public static int value=123;
    public static void method(){
        System.out.println("Super Class Method");
    }
}

class SubClass extends SuperClass{
    static{
        System.out.println("Sub Class init");
    }
}

public class StaticFiled {
    public static void main(String[] args) {
//        System.out.println(SubClass.value);
        SubClass.method();
    }

}