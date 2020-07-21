package com.test.proxy.normal;

/**
 * @author <a href="mailto:dongyuxiang@vpgame.cn">dongyuxiang</a>
 * @date 2020/07/21 09:54
 **/

public class User implements UserInterface {

    @Override
    public void login() {
        System.out.println("用户登录");
    }

    @Override
    public String queryUserInfo() {
        return "用户信息：111";
    }

    @Override
    public String logout(String s) {
        return s;
    }
}
