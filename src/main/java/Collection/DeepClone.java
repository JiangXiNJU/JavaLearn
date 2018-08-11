package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 方法一: Collections.copy，前提是预先分配好空间
 * 方法二: List.addAll() 深克隆
 * 方法三: 实现Cloneable接口的集合能深克隆
 */
public class DeepClone {
    public static void main(String[] args) {
        /*创建一个存储数据的ArrayList链表*/
        List<Integer> intList=new ArrayList<Integer>(Arrays.asList(new Integer[]{4,2,6,8,1}));
        System.out.println("intList的值为："+intList);

/*第一种方法*/
        List<Integer> newList1=new ArrayList<Integer>(Arrays.asList(new Integer[intList.size()]));
        Collections.copy(newList1, intList);
        System.out.println("newList1的值为："+newList1);

/*第二种方法*/
        List<Integer> newList2=new ArrayList<Integer>();
        Collections.addAll(newList2, new Integer[intList.size()]);
        Collections.copy(newList2, intList);
        System.out.println("newList2的值为："+newList2);

/*第三种方法*/
        List<Integer> newList3=new ArrayList<Integer>();
        newList3.addAll(intList);
        System.out.println("newList3的值为："+newList3);

        /*第三种方法*/
        ArrayList<Integer> newList4=(ArrayList<Integer>) (((ArrayList<Integer>)intList).clone());


/*改变intList的值，发现复制的List变量的内容都没有改变*/
        System.out.println("=============请叫我分界线=============");
        intList.set(1, new Integer(0));
        System.out.println("intList的值为："+intList);
        System.out.println("newList1的值为："+newList1);
        System.out.println("newList2的值为："+newList2);
        System.out.println("newList3的值为："+newList3);
        System.out.println("newList3的值为："+newList4);

    }
}
