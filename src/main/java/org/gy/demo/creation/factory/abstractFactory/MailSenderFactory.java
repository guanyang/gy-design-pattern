package org.gy.demo.creation.factory.abstractFactory;

import org.gy.demo.creation.factory.commonFactory.MailSender;
import org.gy.demo.creation.factory.commonFactory.Sender;

public class MailSenderFactory implements Provider {

    public Sender produce() {
        return new MailSender();
    }

}
