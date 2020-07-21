package com.test.proxy.normal;

/**
 * @author <a href="mailto:dongyuxiang@vpgame.cn">dongyuxiang</a>
 * @date 2020/07/21 09:55
 **/

public class UserProxy implements UserInterface {

    private UserInterface target;

    public UserProxy(UserInterface target){
        this.target = target;
    }

    @Override
    public void login() {
        System.out.println("用户登录前");
        target.login();
        System.out.println("用户登录后");
    }

    @Override
    public String queryUserInfo() {
        String userInfo = target.queryUserInfo();
        return userInfo + "222";
    }

    @Override
    public String logout(String s) {
        return target.logout(s);
    }
}
