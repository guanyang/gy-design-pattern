package org.gy.demo.structure.proxy.dynamicProxy.cglib;

import org.gy.demo.structure.proxy.staticProxy.RealSubject;
import org.gy.demo.structure.proxy.staticProxy.Subject;

public class SubjectCglibProxyFactory {

    public static Subject getInstance() {
        return (Subject) new CglibProxy().getProxy(RealSubject.class);
    }

    public static void main(String[] args) {
        Subject subject = SubjectCglibProxyFactory.getInstance();
        subject.dealTask("test CglibProxy");

    }

}
