package JVM.Chapter10_早期编译期优化;

/**
 * Created by cycy on 2018/7/23.
 */
public class AutomaticBoxing {
    public static void main(String[] args) {
        Integer a=1;
        Integer b=2;
        Integer c=3;
        Integer d=3;
        Integer e = Integer.valueOf(-129);
        Integer f = Integer.valueOf(-129);
        Long g=3L;

        System.out.println("c==d "+(c==d));
        System.out.println("e==f "+(e==f));
        System.out.println("c==(a+b) "+(c==(a+b)));
        System.out.println("c.equals(a+b) "+(c.equals(a+b)));
        System.out.println("g==(a+b) "+(g==(a+b)));
        System.out.println("g.equals(a+b) "+(g.equals(a+b)));

    }
}
