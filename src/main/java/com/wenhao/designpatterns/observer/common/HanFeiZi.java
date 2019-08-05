package com.wenhao.designpatterns.observer.common;

import lombok.Data;

import java.util.ArrayList;
import java.util.Observable;


@Data
public class HanFeiZi extends Observable implements IHanFeiZi {

    //定义个变长数组，存放所有的观察者
    private ArrayList<Observer> observerList = new ArrayList<>();

    private boolean isHaveBreakFast = false;
    private boolean isHaveFun = false;

    @Override
    public void haveBreakFast() {
        System.out.println("韩非子开始吃饭了");
        super.setChanged();
        this.notifyObserver("韩非子在吃饭了");
    }

    @Override
    public void haveFun() {
        System.out.println("韩非子开始娱乐了");
        super.setChanged();
        this.notifyObserver("韩非子开始娱乐了");
    }

    public void addObserver(Observer observer) {
        this.observerList.add(observer);
    }

    public void deleteObserver(Observer observer) {
        this.observerList.remove(observer);
    }

    public void notifyObserver(String context) {
        for (Observer observer : observerList) {
            observer.update(this, context);
        }
    }
}
