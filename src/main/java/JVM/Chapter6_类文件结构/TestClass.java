package JVM.Chapter6_类文件结构;

/**
 * Created by cycy on 2018/7/28.
 */
public class TestClass{
    private int m;
    static class c{
        int x;
    }
    public int inc( ) {
//        int y=x+1;
        return m + 1;
//        return 3;
    }
}
