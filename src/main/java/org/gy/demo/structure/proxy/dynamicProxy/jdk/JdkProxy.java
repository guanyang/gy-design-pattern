package org.gy.demo.structure.proxy.dynamicProxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK动态代理，只能对实现了接口的类生成代理，而不能针对类<br>
 * 具体步骤是：<br>
 * <li>实现InvocationHandler接口创建自己的调用处理器</li><br>
 * <li>给Proxy类提供ClassLoader和代理接口类型数组创建动态代理类</li><br>
 * <li>以调用处理器类型为参数，利用反射机制得到动态代理类的构造函数</li><br>
 * <li>以调用处理器对象为参数，利用动态代理类的构造函数创建动态代理类对象</li><br>
 * <strong>Proxy类的静态方法newProxyInstance对上面具体步骤的后三步做了封装，简化了动态代理对象的获取过程<strong><br>
 */
public class JdkProxy implements InvocationHandler {

    // 代理类持有一个委托类的对象引用
    private Object delegate;

    public Object getProxy(Object delegate) {
        this.delegate = delegate;
        return Proxy.newProxyInstance(this.delegate.getClass().getClassLoader(), this.delegate.getClass().getInterfaces(), this);
    }

    public void before() {
        System.out.println("JdkProxy before");
    }

    public void after() {
        System.out.println("JdkProxy after");
    }

    public Object invoke(Object proxy,
                         Method method,
                         Object[] args) throws Throwable {
        Object result = null;
        this.before();
        result = method.invoke(this.delegate, args);
        this.after();
        return result;
    }

}
