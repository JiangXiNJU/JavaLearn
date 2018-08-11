package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import static java.lang.System.out;

/**
 * Created by cycy on 2018/8/6.
 */

public class TestHashMap_MultiThreads {

    static final Map<Integer, Integer> map = new ConcurrentHashMap<Integer, Integer>(2);

    public static void main(String[] args) throws InterruptedException {

        map.put(0, 0);

        for(int i=1;i<10;i++){
            final int index=i;
            new Thread("Thread "+i) {
                public void run() {

                    for(int j=0;j<=5;j++) {
                        map.put(index*10+j, index*10+j);
                    }
                    out.println(this.getName()+map);
                };
            }.start();
        }
//        new Thread("Thread1") {
//            public void run() {
//                map.put(300, 300);
//                System.out.println(map);
//            };
//        }.start();
//
//        new Thread("Thread2") {
//            public void run() {
//                map.put(3, 33);
//                System.out.println(map);
//            };
//        }.start();

    }

}