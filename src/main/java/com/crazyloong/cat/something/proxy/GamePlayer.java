package com.crazyloong.cat.something.proxy;

public class GamePlayer implements IGamePlayer {

    private String name = "";

    private IGamePlayer proxy = null;

    public GamePlayer(String _name){
        this.name = _name;
    }


    @Override
    public void login(String user, String password) {
       /* if (this.isProxy()){
            System.out.println(name + " 登陆");
        } else {
            System.out.println("请使用制定的代理类");
        }*/
        System.out.println(name + " 登陆");
    }

    @Override
    public void killBoss() {
        /*if (this.isProxy()){
            System.out.println("在打怪");
        } else {
            System.out.println("请使用制定的代理类");
        }*/
        System.out.println("在打怪");
    }

    @Override
    public void upgrade() {
        /*if (this.isProxy()){
            System.out.println("升级了");
        } else {
            System.out.println("请使用制定的代理类");
        }*/
        System.out.println("升级了");
    }

    //找到自己的代理类
    @Override
    public IGamePlayer getProxy() {
      this.proxy = new GamePlayerProzy(this);
      return this.proxy;
    }

    /*private boolean isProxy(){
        if (this.proxy == null){
            return false;
        } else {
            return true;
        }

    }*/


}
