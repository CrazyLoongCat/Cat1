package com.crazyloong.cat.something;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class MyCall implements Callable {

    public String a = "";

    public MyCall(String a){
        this.a = a ;
    }

    @Override
    public String call() throws Exception {

        for(int i = 0;i<1000; i++){
            System.out.println(" 执行了:"+i+"次");
        }
        return a;
    }

    public static void main(String[] args) {
        MyCall m1 = new MyCall("");
        FutureTask f1 = new FutureTask(m1);
        Thread t1 = new Thread(f1);
        t1.start();
        System.out.println(f1);
        System.out.println("2");
    }
}
