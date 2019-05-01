package com.crazyloong.cat.something.proxy.invoke;

public class BeforeAdvice implements IAdvice {
    @Override
    public void exec() {
        System.out.println("我是前置通知 我通知了");
    }
}
