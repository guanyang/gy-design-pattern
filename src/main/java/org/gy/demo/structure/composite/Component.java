package org.gy.demo.structure.composite;

/**
 * 组合中的对象声明接口，声明接口用于访问和管理Component子部件
 */
public abstract class Component {

    private String name;

    public Component(String name) {
        super();
        this.name = name;
    }

    public abstract void add(Component c);

    public abstract void remove(Component c);

    public abstract void foreach();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
