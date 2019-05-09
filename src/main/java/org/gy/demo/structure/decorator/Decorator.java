package org.gy.demo.structure.decorator;

/**
 * 装饰模式（Decorator）<br>
 * 装饰模式就是给一个对象增加一些新的功能，而且是动态的，要求装饰对象和被装饰对象实现同一个接口，装饰对象持有被装饰对象的实例
 */
public class Decorator implements SourceIntf {

    private SourceIntf sourceIntf;

    public Decorator(SourceIntf sourceIntf) {
        super();
        this.sourceIntf = sourceIntf;
    }

    public void method() {
        System.out.println("before Decorator");
        sourceIntf.method();
        System.out.println("after Decorator");

    }

    public static void main(String[] args) {
        SourceIntf intf = new SourceImpl();
        SourceIntf obj = new Decorator(intf);
        obj.method();
    }

}
