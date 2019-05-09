package org.gy.demo.structure.adapter.interfaceAdapter;

/**
 * 接口的适配器模式<br>
 * 核心思想：借助于一个抽象类，该抽象类实现了该接口，实现了所有的方法，而我们不和原始的接口打交道，只和该抽象类取得联系，所以我们写一个类，继承该抽象类，重写我们需要的方法就行
 */
public abstract class Wrapper implements Sourceable {

    public void method1() {
    }

    public void method2() {
    }

    public static void main(String[] args) {
        Sourceable source1 = new SourceOne();
        Sourceable source2 = new SourceTwo();

        source1.method1();
        source1.method2();

        source2.method1();
        source2.method2();

    }

}
