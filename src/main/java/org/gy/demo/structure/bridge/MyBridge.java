package org.gy.demo.structure.bridge;

import org.gy.demo.structure.proxy.staticProxy.Subject;

public class MyBridge extends Bridge {

    @Override
    public void method(String taskName) {
        System.out.println("MyBridge:" + taskName);
        super.method(taskName);
    }

    public static void main(String[] args) {
        Subject subject = new SubjectOne();
        Bridge bridge = new MyBridge();
        bridge.setSubject(subject);
        bridge.method("test");
    }

}
