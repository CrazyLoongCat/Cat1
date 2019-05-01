package algortithmsTest;

import com.crazyloong.cat.Algorithms.Counter;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * 用计数器模拟投硬币
 */
public class Flips {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        Counter heads = new Counter("heads");
        Counter tails = new Counter("tails");
        for (int i = 0; i < num; i++){
            if(StdRandom.bernoulli(0.5)){
                heads.increment();
            } else {
                tails.increment();
            }
        }
        StdOut.println(heads.toString());
        StdOut.println(tails.toString());
        int d = heads.tally() - tails.tally();
        StdOut.println(Math.abs(d));
    }
}
