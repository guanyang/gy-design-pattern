package org.gy.demo.structure.adapter.objectAdapter;

import org.gy.demo.structure.adapter.classAdapter.Source;
import org.gy.demo.structure.adapter.classAdapter.Targetable;

/**
 * 对象的适配器模式，通过委托的方式实现<br>
 * 基本思路和类的适配器模式相同，只是将Adapter类作修改，这次不继承Source类，而是持有Source类的实例，以达到解决兼容性的问题
 */
public class ObjectAdapter implements Targetable {

    private Source source;

    public ObjectAdapter(Source source) {
        super();
        this.source = source;
    }

    public void method1() {
        source.method1();

    }

    public void method2() {
        System.out.println("this is the targetable method!");
    }

    public static void main(String[] args) {
        Source source = new Source();
        Targetable targetable = new ObjectAdapter(source);
        targetable.method1();
        targetable.method2();
    }

}
