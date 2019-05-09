package org.gy.demo.structure.adapter.classAdapter;

/**
 * 类的适配器模式，通过继承的方式实现<br>
 * 核心思想就是：有一个Source类，拥有一个方法，待适配，目标接口是Targetable，通过Adapter类，将Source的功能扩展到Targetable里
 */
public class ClassAdapter extends Source implements Targetable {

    public void method2() {
        System.out.println("this is the targetable method!");
    }

    public static void main(String[] args) {
        Targetable target = new ClassAdapter();
        target.method1();
        target.method2();
    }

}
