package JVM.Chapter2_Java内存区域与内存溢出异常;

/**
 * Created by cycy on 2018/6/25.
 */
public class StringIntern {
    public static void main(String argv[])
    {
        String s1 = "HelloWorld";  //Runtime Constant Pool
        String s2 = new String("HelloWorld");  //Heap
        String s3 = "Hello";//Runtime Constant Pool
        String s4 = "World";//Runtime Constant Pool
        String s5 = "Hello" + "World";//Heap
        String s6 = s3 + s4;//Heap
        //s6 = s3.intern() + s4.intern()//Heap

        System.out.println(s1 == s2);
        System.out.println(s1 == s5);
        System.out.println(s1 == s6);
        System.out.println(s1 == s6.intern());
        System.out.println(s2 == s2.intern());
        System.out.println(s5 == s6);
    }
}
