package com.wenhao.designpatterns.observer.common;

import lombok.Data;

@Data
public class HanFeiZi implements IHanFeiZi {

    private boolean isHaveBreakFast = false;
    private boolean isHaveFun = false;

    private IList lisi = new Lisi();


    @Override
    public void haveBreakFast() {
        System.out.println("韩非子开始吃饭了");
        this.lisi.update("韩非子在吃饭了");
    }

    @Override
    public void haveFun() {
        System.out.println("韩非子开始娱乐了");
        this.lisi.update("韩非子开始娱乐了");
    }
}
