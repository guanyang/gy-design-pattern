package org.gy.demo.creation.factory.abstractFactory;

import org.gy.demo.creation.factory.commonFactory.Sender;
import org.gy.demo.creation.factory.commonFactory.SmsSender;

public class SmsSenderFactory implements Provider {

    public Sender produce() {
        return new SmsSender();
    }

}
