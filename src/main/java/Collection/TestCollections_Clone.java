package Collection;


import java.util.*;

import static java.lang.System.out;
import static javax.swing.UIManager.put;

/**
 * Created by cycy on 2018/8/1.
 */
public class TestCollections_Clone {
    public static void main(String[] args) {
        List<Integer> l=new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        out.print(l);
        int a=Integer.MAX_VALUE+8;
        out.println(a-Integer.MAX_VALUE);

        LinkedList<Integer> ll1=new LinkedList<Integer>();
        ll1.add(1);
        ll1.add(2);
        LinkedList<Integer> ll2=(LinkedList<Integer>)ll1.clone();
        ll1.removeLast();
        out.println(ll2);

        Vector<Integer> v1=new Vector<Integer>();
        v1.add(1);
        v1.add(2);
        Vector<Integer> v2=(Vector<Integer>)v1.clone();
        Stack<Integer> s3=new Stack<Integer>();
        s3.add(3);
        s3.add(4);
        Stack<Integer> s4=(Stack<Integer>) s3.clone();
        v1.remove(1);
        s3.remove(1);
        out.println("v1: "+v1);
        out.println("v2: "+v2);
        out.println("s3: "+s3);
        out.println("s4: "+s4);


        Set<Integer> set=new HashSet<Integer>(4);
        out.println(set.add(1));
        out.println(set.add(2));
        out.println(set.add(1));
        out.println(set.add(null));
        out.println(set.add(3));
        out.println(set.add(4));
        out.println("set: "+set);

        TreeMap<Integer,Integer> tm=new TreeMap<Integer, Integer>();
        tm.put(1,1);
        tm.put(2,2);
        tm.put(1,3);
        tm.put(1,null);
        out.println("TreeMap: "+tm);

        HashMap<Integer,Integer> hm=new HashMap<Integer, Integer>();
        hm.put(3,3);
        hm.put(1,1);
        hm.put(2,2);
        hm.put(1,3);
        hm.put(1,null);

        out.println("HashMap: "+hm);
        Iterator hm_it=hm.entrySet().iterator();
        out.println("HashMap Iterator");
        while(hm_it.hasNext()) {
            out.print(hm_it.next()+" , ");
        }
        out.println();

        LinkedHashMap<Integer,Integer> lhm=new LinkedHashMap<Integer, Integer>();
        lhm.put(3,3);
        lhm.put(1,1);
        lhm.put(2,2);
        lhm.put(1,3);
        lhm.put(1,null);
        lhm.put(null,null);

        lhm.remove(1);
        out.println("LinkedHashMap: "+lhm);
        Iterator lhm_it=lhm.entrySet().iterator();
        out.println("LinkedHashMap Iterator");
        while(lhm_it.hasNext()) {
            out.print(lhm_it.next()+" , ");
        }
        out.println();

    }
}
