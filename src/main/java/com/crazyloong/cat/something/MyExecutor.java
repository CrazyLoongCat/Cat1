package com.crazyloong.cat.something;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyExecutor {

    public static void main(String[] args) throws Exception{
        System.out.println("程序开始运行啦 看好了");
        ExecutorService pool = Executors.newFixedThreadPool(5);
        List<Future> listF = new ArrayList<Future>() ;
        for (int i = 0;i < 5; i++) {
            MyCall m = new MyCall(String.valueOf(i));
            Future f = pool.submit(m);
            listF.add(f);
        }
        pool.shutdown();
        for (Future f :listF){
            f.isDone();
            System.out.println(f.get());
        }
    }
}
