package com.crazyloong.cat.something.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class GamePlayIH implements InvocationHandler {

    //被代理者
    Class cls = null;

    //被代理的实例
    Object obj = null;

    //我要代理谁
    public GamePlayIH(Object _obj){
        this.obj = _obj;
    }

    //调用被代理的方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(this.obj,args);

        return result;
    }

    public static void main(String[] args) {
        IGamePlayer player = new GamePlayer("张三");
        InvocationHandler handler = new GamePlayIH(player);
        ClassLoader cl = player.getClass().getClassLoader();
        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(cl,new Class[]{IGamePlayer.class},handler);
        proxy.login("zhangsan","password");
        proxy.killBoss();
        proxy.upgrade();
    }
}
