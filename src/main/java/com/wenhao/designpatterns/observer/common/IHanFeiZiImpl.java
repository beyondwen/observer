package com.wenhao.designpatterns.observer.common;

import lombok.Data;

@Data
public class IHanFeiZiImpl implements IHanFeiZi {

    private boolean isHaveBreakFast = false;
    private boolean isHaveFun = false;


    @Override
    public void haveBreakFast() {
        System.out.println("韩非子开始吃饭了");
        this.isHaveBreakFast = true;
    }

    @Override
    public void haveFun() {
        System.out.println("韩非子开始娱乐了");
        this.isHaveFun = true;
    }
}
