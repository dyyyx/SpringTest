package com.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author <a href="mailto:dongyuxiang@vpgame.cn">dongyuxiang</a>
 * @date 2020/04/28 19:02
 **/
@Service
public class ServiceB {
    @Autowired
    private ServiceA serviceA;

    public void testB1() {
        System.out.println("testB1 Method");
    }
}
