package algortithmsTest;

import com.crazyloong.cat.Algorithms.Counter;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class FlipsMax {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        Counter heads = new Counter("heads");
        Counter tails = new Counter("tails");
        for (int i = 0; i < num; i++){
            if (StdRandom.bernoulli(0.5)){
                heads.increment();
            } else {
                tails.increment();
            }
        }
        if (heads.tally() == tails.tally()){
            StdOut.println("平局");
        } else {
            StdOut.println(Counter.max(tails, heads)+"赢了");
        }

    }
}
