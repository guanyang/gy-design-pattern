package org.gy.demo.structure.bridge;

import org.gy.demo.structure.proxy.staticProxy.Subject;

public class SubjectTwo implements Subject {

    public void dealTask(String taskName) {

        System.out.println("SubjectTwo:" + taskName);

    }

}
