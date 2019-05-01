package algortithmsTest;

import com.crazyloong.cat.Algorithms.Bag;

import java.util.Iterator;

public class TestBag {
    public static void main(String[] args) {
        Bag bag = new Bag();
        bag.add(1);
        bag.add(2);
        bag.add(3);
        bag.add(4);
        bag.add(5);
        bag.add(6);
        Iterator iterator = bag.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println(bag.size());
    }
}
