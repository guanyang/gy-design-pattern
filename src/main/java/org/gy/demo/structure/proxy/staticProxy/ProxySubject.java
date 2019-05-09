package org.gy.demo.structure.proxy.staticProxy;

/**
 * 　静态代理类，实现了代理接口。<br>
 * 所谓静态也就是在程序运行前就已经存在代理类的字节码文件，代理类和委托类的关系在运行前就确定了</li><br>
 */
public class ProxySubject implements Subject {

    // 代理类持有一个委托类的对象引用
    private Subject delegate;

    public ProxySubject(Subject delegate) {
        this.delegate = delegate;
    }

    public void dealTask(String taskName) {
        long stime = System.currentTimeMillis();
        // 将请求分派给委托类处理
        delegate.dealTask(taskName);
        long ftime = System.currentTimeMillis();
        System.out.println("执行任务耗时" + (ftime - stime) + "毫秒");

    }

}
