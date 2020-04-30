package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author <a href="mailto:dongyuxiang@vpgame.cn">dongyuxiang</a>
 * @date 2020/04/28 17:38
 **/
@EnableAsync
@SpringBootApplication
public class SpringTestApplication {
    public static void main(String[] args){
        SpringApplication.run(SpringTestApplication.class, args);
    }
}
