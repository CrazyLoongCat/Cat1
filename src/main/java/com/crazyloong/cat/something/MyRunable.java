package com.crazyloong.cat.something;

public class MyRunable implements Runnable {
    @Override
    public void run() {
        for(int i = 0;i<1000; i++){
            System.out.println(" 执行了:"+i+"次");
        }
    }

    public static void main(String[] args) {
        MyRunable r1 = new MyRunable();
        MyRunable r2 = new MyRunable();
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
    }
}
