package Reflection;

import static java.lang.System.out;

/**
 * Created by cycy on 2018/8/9.
 */
public class Student {
    String name;
    static String school;
    public Student(){
        name="张三";
        school="BD";
    }
    public Student(String n,String s){
        name=n;
        school=s;
    }
    public  void printName(){
        out.println("Student's name is "+name);
    }
    public static void printSchool(){
        out.println("School's name is "+school);
    }
}
