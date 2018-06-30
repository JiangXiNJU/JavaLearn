package JVM.Chapter2_Java内存区域与内存溢出异常;

/**
 * JDK 1.6 String.intern() 返回 常量池中（永久代）中此String实例的引用
 * JDK 1.7以后，String.intern() 返回 第一个相同内容的实例在堆中的引用，减少了常量池拷贝操作
 */
public class StringIntern {
    public static void main(String argv[])
    {
        String s1 = "HelloWorld";  //Runtime Constant Pool
        String s2 = new String("HelloWorld");  //Heap
        String s3 = "Hello";//Runtime Constant Pool
        String s4 = "World";//Runtime Constant Pool
        String s5 = "Hello" + "World";//Runtime Constant Pool
        String s6 = s3 + s4;//Heap
        //s6 = s3.intern() + s4.intern()//Heap

        System.out.println(s1==s1.intern());//true
        System.out.println(s5==s5.intern());//true
        System.out.println(s6==s6.intern());//
        System.out.println(s1.intern()==s5.intern());//true
        System.out.println(s1 == s2);//false
        System.out.println(s1 == s5);//true
        System.out.println(s1 == s6);//false
        System.out.println(s1 == s6.intern());//true
        System.out.println(s2 == s2.intern());//false
        System.out.println(s5 == s6);//false
        System.out.println(s1.intern()==s6.intern());//true

        System.out.println();
        String str1=new StringBuilder("计算机").append("软件").toString();
        System.out.println(str1==str1.intern());

        String str2=new StringBuilder("ja").append("va").toString();
        System.out.println(str2==str2.intern());
    }
}
