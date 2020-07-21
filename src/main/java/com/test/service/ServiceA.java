package com.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author <a href="mailto:dongyuxiang@vpgame.cn">dongyuxiang</a>
 * @date 2020/04/28 19:02
 **/
@Service
public class ServiceA {

    @Autowired
    private ServiceB serviceB;

    @Async
    public void testA1() {
        System.out.println("testA1 Method");
    }

    public void testA2() {
        System.out.println("testA2 Method");
    }

}
