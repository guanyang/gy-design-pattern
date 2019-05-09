package org.gy.demo.behavior.observer;

import java.util.Observable;

public class Watched extends Observable {

    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        if ((data == null && this.data != null) || (data != null && !data.equals(this.data))) {
            this.data = data;
            setChanged();
            notifyObservers();
        }
    }

}
