package org.gy.demo.creation.factory.commonFactory;

/**
 * 工厂方法模式<br>
 * <li>普通工厂</li>
 * <li>多个工厂方法</li>
 * <li>静态工厂方法</li>
 */
public class SenderFactory {

    /*************** 1、普通工厂 *****************/
    public Sender produce(String type) {
        if ("mail".equals(type)) {
            return new MailSender();
        } else if ("sms".equals(type)) {
            return new SmsSender();
        } else {
            throw new RuntimeException("type error");
        }
    }

    /*************** 2、多个工厂方法 *****************/
    public Sender produceMail() {
        return new MailSender();
    }

    public Sender produceSms() {
        return new SmsSender();
    }

    /*************** 3、静态工厂方法 *****************/
    public static Sender produceMailStatic() {
        return new MailSender();
    }

    public static Sender produceSmsStatic() {
        return new SmsSender();
    }

}
