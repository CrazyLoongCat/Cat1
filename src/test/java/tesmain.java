import com.crazyloong.cat.Algorithms.Counter;
import edu.princeton.cs.algs4.Bag;

import java.util.*;

public class tesmain {
    public static void main(String[] args) {
        //list();
        Object x = new Object();
        Object y = new Object();
        System.out.println(x.equals(y));
        Counter a = new Counter("a");
        Counter b = new Counter("a");
        System.out.println(a.equals(b));
        Queue
    }

   static void list(){
        /*List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        String[] strs = new String[9];
       strs =  list.toArray(strs);
       for (String str : strs) {
           System.out.println(str);
       }*/

        /*String a = "bbb";
        changeString(a);
       System.out.println(a);
       StringBuffer sb = new StringBuffer("bbb");
       changeString(sb);
       System.out.println(sb.toString());
        int c = 1;
        changeInt(c);
       System.out.println(c);*/
        /*for (String item : list) {
            if ("2".equals(item)) {
                list.remove(item);
            }
        }*/
       /*String[] str = new String[] { "you", "wu" };
       List list = Arrays.asList(str);
       list.add("aaa");*/
    }
    static void string (){
        Integer a = 127;
        Integer b = 127;
        Integer c = new Integer("127");
        Integer d = new Integer("127");
        System.out.println(a==b);
        System.out.println(c==b);
        System.out.println(c==d);
        String ddd = null;
        String dd = new String(ddd);
    }

    static void changeString(String str){
        str += "aaaa";
    }

    static void changeString(StringBuffer sb){
        sb.append("aaaa");
    }
    static void changeInt(int a){
        a++;
    }
}
