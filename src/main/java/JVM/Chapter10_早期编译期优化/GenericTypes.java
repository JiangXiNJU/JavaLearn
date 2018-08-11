package JVM.Chapter10_早期编译期优化;

import java.util.List;

import static java.lang.System.out;

/**
 * Created by cycy on 2018/8/6.
 */
public class GenericTypes {
//    public static int method(List<Integer> list){
//        out.println(" invoke method List<Integer>");
//        return 1;
//    }
    public static String method(List<String> list){
        out.println(" invoke method List<String>");
        return "String";
    }
}
