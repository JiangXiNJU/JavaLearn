package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/**
 * Created by cycy on 2018/8/8.
 */
public class TestHashMap_resize_Treeify {

    private static final String REG = "[0-9]+";
    static class MapKey{
        private String key;
        public MapKey(String key) {
            this.key = key;
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            MapKey mapKey = (MapKey) o;

            return !(key != null ? !key.equals(mapKey.key) : mapKey.key != null);

        }

        @Override
        public int hashCode() {
            if (key == null)
                return 0;
            Pattern pattern = Pattern.compile(REG);
            if (pattern.matcher(key).matches())
                return 1;
            else
                return 2;
        }

        @Override
        public String toString() {
            return key;
        }
    }

    public static void main(String[] args) {
        Map<MapKey,Integer> map = new HashMap<MapKey, Integer>();


//        //第一阶段
//        for (int i = 0; i < 6; i++) {
//            map.put(new MapKey(String.valueOf(i)), "A");
//        }
//
//
//
//        //第二阶段
//        for (int i = 0; i < 10; i++) {
//            map.put(new MapKey(String.valueOf(i)), "B");
//        }
//

        //第三阶段
        for (int i = 0; i < 50; i++) {
            map.put(new MapKey(String.valueOf(i)), i);
        }



        //第四阶段
        map.put(new MapKey("X"), (int)'X');
        map.put(new MapKey("Y"), (int)'Y');
        map.put(new MapKey("Z"), (int)'Z');

        System.out.println(map);
    }

}
