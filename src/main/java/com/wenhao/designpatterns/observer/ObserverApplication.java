package com.wenhao.designpatterns.observer;

import com.wenhao.designpatterns.observer.common.HanFeiZi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ObserverApplication {


    public static void main(String[] args){
        SpringApplication.run(ObserverApplication.class, args);

        //定义出韩非子
        HanFeiZi hanFeiZi = new HanFeiZi();
        hanFeiZi.haveBreakFast();
        hanFeiZi.haveFun();
    }

}
