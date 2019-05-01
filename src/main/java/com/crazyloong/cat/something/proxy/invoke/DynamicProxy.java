package com.crazyloong.cat.something.proxy.invoke;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicProxy<T> {
    public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h){
        if (true) {
            (new BeforeAdvice()).exec();
        }

        return (T) Proxy.newProxyInstance(loader,interfaces,h);

    }

    public static void main(String[] args) {
        Subject subject = new RealSubject();
        InvocationHandler handler = new MyInvocationHandler(subject);
        Subject proxy = DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(),
                subject.getClass().getInterfaces(),handler);
        try {
            proxy.doSomething("aaaa");
            proxy.doSomething2("bbbb");
        } catch (Exception e){
            System.out.println(e.getCause().getMessage());
        }

    }
}
