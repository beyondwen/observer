package com.wenhao.designpatterns.observer.common;

import java.util.Observable;

public interface Observer {

    void update(Observable observable, Object obj);
}
