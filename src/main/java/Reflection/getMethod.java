package Reflection;

import java.lang.reflect.Constructor;

import static java.lang.System.out;

/**
 * Created by cycy on 2018/8/9.
 */
public class getMethod {
    public static void main(String[] args) throws Exception{
        Class clazz=Class.forName("Reflection.Student");
        Constructor[] constr=clazz.getConstructors();
        for(Constructor c:constr)
            out.println(c);
    }
}
