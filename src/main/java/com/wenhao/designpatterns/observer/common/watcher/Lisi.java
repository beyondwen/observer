package com.wenhao.designpatterns.observer.common.watcher;

import com.wenhao.designpatterns.observer.common.Observer;

import java.util.Observable;

public class Lisi implements Observer {

    //首先李斯是个观察者，一旦韩非子有活动，他就知道，他就要向老板汇报
    public void update(Observable observable, Object obj){
        System.out.println("李斯：观察到韩非子活动，开始向老板汇报了...");
        this.reportToQinShiHuang(obj.toString());
        System.out.println("李斯：汇报完毕...\n");
    }

    //汇报给秦始皇
    private void reportToQinShiHuang(String reportContext) {
        System.out.println("李斯：报告，秦老板！韩非子有活动了--->" + reportContext);
    }
}
