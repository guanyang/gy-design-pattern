package org.gy.demo.creation.factory.abstractFactory;

import org.gy.demo.creation.factory.commonFactory.Sender;

public class Test {

    public static void main(String[] args) {
        // 如果你现在想增加一个功能：发及时信息，则只需做一个实现类，实现Sender接口，同时做一个工厂类，实现Provider接口，
        // 优点：无需去改动现成的代码。这样做，拓展性较好！
        Provider provider = new MailSenderFactory();
        Sender sender = provider.produce();
        sender.send();
    }

}
