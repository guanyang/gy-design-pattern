package org.gy.demo.structure.proxy.staticProxy;

/**
 * 真正执行任务的类，实现了代理接口。
 */
public class RealSubject implements Subject {

    public void dealTask(String taskName) {
        System.out.println("正在执行任务：" + taskName);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
