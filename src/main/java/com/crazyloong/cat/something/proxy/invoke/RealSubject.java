package com.crazyloong.cat.something.proxy.invoke;

public class RealSubject implements Subject {
    @Override
    public void doSomething(String str) throws Exception{

        System.out.println("我是真的obj"+str);
        throw new Exception("报错了");
    }

    @Override
    public void doSomething2(String str) {

        System.out.println("我是真的obj2"+str);
    }
}
