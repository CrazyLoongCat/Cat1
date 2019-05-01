package com.crazyloong.cat.something.proxy;

public class GamePlayerProzy implements IGamePlayer,IProxy{

    private IGamePlayer gamePlayer = null;

    public GamePlayerProzy(IGamePlayer _gamePlayer){
        this.gamePlayer = _gamePlayer;
    }

    @Override
    public void login(String user, String password) {
        this.gamePlayer.login(user,password);
    }

    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    /** 代理类可以为真实角色预处理消息，过滤消息，消息转发
     * 事后处理消息等功能
     *
     */

    @Override
    public void upgrade() {
        this.gamePlayer.upgrade();
        this.count();
    }

    @Override
    public IGamePlayer getProxy() {
        return this;
    }

    @Override
    public void count() {
        System.out.println("收费150元");
    }
}
