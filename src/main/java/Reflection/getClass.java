package Reflection;

import static java.lang.System.out;

/**
 * Created by cycy on 2018/8/9.
 */
public class getClass {
    public static void main(String[] args) {
        Student stu1=new Student("JX","ND");
        Class stu_class=stu1.getClass();
        out.println(stu_class.getName());

        Class Student_class=Student.class;
        out.print("stu_class == Student_class ? ");
        out.println(stu_class==Student_class);//true
        try {
            /**
             * 常用第三种
             */
            Class Student_class2 = Class.forName("Reflection.Student");
            out.print("Student_class == Student_class2 ? ");
            out.println(Student_class==Student_class2);//true
        }catch(Exception e){
            e.printStackTrace();
        }


    }

}
