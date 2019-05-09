package org.gy.demo.structure.proxy.dynamicProxy.jdk;

import org.gy.demo.structure.proxy.staticProxy.RealSubject;
import org.gy.demo.structure.proxy.staticProxy.Subject;

public class SubjectJdkProxyFactory {

    public static Subject getInstance() {
        return (Subject) new JdkProxy().getProxy(new RealSubject());
    }

    public static void main(String[] args) {
        Subject subject = SubjectJdkProxyFactory.getInstance();
        subject.dealTask("test JdkProxy");

    }

}
