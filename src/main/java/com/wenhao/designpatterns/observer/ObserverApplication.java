package com.wenhao.designpatterns.observer;

import com.wenhao.designpatterns.observer.common.HanFeiZi;
import com.wenhao.designpatterns.observer.common.Observer;
import com.wenhao.designpatterns.observer.common.watcher.Lisi;
import com.wenhao.designpatterns.observer.common.watcher.Liusi;
import com.wenhao.designpatterns.observer.common.watcher.Wansi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ObserverApplication {


    public static void main(String[] args) {
        SpringApplication.run(ObserverApplication.class, args);
        Observer lisi = new Lisi();
        Observer wansi = new Wansi();
        Observer liusi = new Liusi();

        HanFeiZi hanFeiZi = new HanFeiZi();
        hanFeiZi.addObserver(lisi);
        hanFeiZi.addObserver(wansi);
        hanFeiZi.addObserver(liusi);

        hanFeiZi.haveBreakFast();
    }

}
