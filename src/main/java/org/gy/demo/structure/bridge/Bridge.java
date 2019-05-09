package org.gy.demo.structure.bridge;

import org.gy.demo.structure.proxy.staticProxy.Subject;

/**
 * 桥接模式（Bridge）<br>
 * 桥接的用意是：<strong>将抽象化与实现化解耦，使得二者可以独立变化</strong>
 */
public abstract class Bridge {

    private Subject subject;

    public void method(String taskName) {
        subject.dealTask(taskName);
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

}
