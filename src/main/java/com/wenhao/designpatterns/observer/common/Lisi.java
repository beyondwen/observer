package com.wenhao.designpatterns.observer.common;

public class Lisi implements IList {
    @Override
    public void update(String context) {
        System.out.println("李斯开始观察韩非子了");
        reportToQinShiHuang(context);
        System.out.println("李斯汇报完毕");
    }

    //汇报给秦始皇
    private void reportToQinShiHuang(String reportContext) {
        System.out.println("李斯：报告，秦老板！韩非子有活动了--->" + reportContext);
    }
}
