package com.wenhao.designpatterns.observer.common.watcher;

import com.wenhao.designpatterns.observer.common.Observer;

import java.util.Observable;

public class Liusi implements Observer {

    @Override
    public void update(Observable observable, Object obj) {
        System.out.println("刘斯开始观察韩非子了");
        this.happy(obj.toString());
        System.out.println("刘斯汇报完毕");
    }

    //一看韩非子有活动，他就痛哭
    private void happy(String context) {
        System.out.println("刘斯：因为" + context + "，--所以我快乐呀！");
    }
}
