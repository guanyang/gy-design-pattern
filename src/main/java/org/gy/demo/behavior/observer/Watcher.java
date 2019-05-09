package org.gy.demo.behavior.observer;

import java.util.Observable;
import java.util.Observer;

public class Watcher implements Observer {

    private String state;

    public String getState() {
        return state;
    }

    public Watcher(Observable o) {
        o.addObserver(this);
    }

    public void update(Observable o, Object arg) {
        Watched oWatched = (Watched) o;
        System.out.println("观察者原状态：" + state);
        this.state = oWatched.getData();
        System.out.println("状态发生变化：" + state);
    }
}
