package org.gy.demo.structure.flyweight.simple;

/**
 * 单纯享元模式-具体享元(ConcreteFlyweight)角色<br>
 * <li>内蕴状态(Internal State)：一个内蕴状态是存储在享元对象内部的，并且是不会随环境的改变而有所不同</li><br>
 * <li>外蕴状态(External State)：一个外蕴状态是随环境的改变而改变的、不可以共享的</li><br>
 */
public class ConcreteFlyweight implements Flyweight {

    // 内蕴状态
    private Integer internalState;

    public ConcreteFlyweight(Integer internalState) {
        super();
        this.internalState = internalState;
    }

    // 外蕴状态作为参数传入方法中，改变方法的行为
    public void operation(String state) {
        System.out.println("Internal State = " + this.internalState);
        System.out.println("External State = " + state);
    }

}
