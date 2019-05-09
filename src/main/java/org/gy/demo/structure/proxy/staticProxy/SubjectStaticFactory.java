package org.gy.demo.structure.proxy.staticProxy;

/**
 * 静态代理类工厂
 */
public class SubjectStaticFactory {

    public static Subject getInstance() {
        return new ProxySubject(new RealSubject());
    }

    public static void main(String[] args) {
        Subject proxySubject = SubjectStaticFactory.getInstance();
        proxySubject.dealTask("test");
    }

}
