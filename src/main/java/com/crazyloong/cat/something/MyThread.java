package com.crazyloong.cat.something;

public class MyThread extends Thread {

    public String s = "";
    public MyThread(String s){
        this.s = s;
    }

    @Override
    public void run(){
        for(int i = 0;i<1000; i++){
            System.out.println("这是线程: "+s +"  执行了:"+i+"次");
        }
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread("t1");
        MyThread t2 = new MyThread("t2");
        t1.start();
        t2.start();
    }
}
