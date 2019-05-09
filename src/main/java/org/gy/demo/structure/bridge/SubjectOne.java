package org.gy.demo.structure.bridge;

import org.gy.demo.structure.proxy.staticProxy.Subject;

public class SubjectOne implements Subject {

    public void dealTask(String taskName) {
        System.out.println("SubjectOne:" + taskName);
    }

}
