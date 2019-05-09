package org.gy.demo.structure.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合模式（Composite）<br>
 * <li>定义：组合模式有时候也叫做部分-整体的模式，它使我们树形结构的问题中，模糊了简单元素和负责元素的概念，客户元素像处理简单元素一样来处理复杂的元素，从而使得客户程序与复杂元素的内部结构解耦</li><br>
 * <li>意图：将对象组合成树形结构以表示“整体和部分”层次结构。Composite模式使得用户对单个对象和组合对象使用具有一致性。</li><br>
 * <li>使用场景：当发现需求中是体现部分与整体层次结构时，以及你希望用户可以忽略组合对象与单个对象的不同，统一地使用组合结构中的所有对象时，就应该考虑组合模式了。</li><br>
 */
public class Composite extends Component {

    private List<Component> child = new ArrayList<Component>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {
        child.add(c);

    }

    @Override
    public void remove(Component c) {
        child.remove(c);

    }

    @Override
    public void foreach() {
        System.out.println("当前节点：" + this.getName());
        for (Component c : child) {
            c.foreach();
        }
    }

    public static void main(String[] args) {
        Component root = new Composite("根节点");
        Component left = new Composite("左子节点");
        Component right = new Composite("右子节点");
        root.add(left);
        root.add(right);
        // 添加叶子节点
        Component left_left = new Leaf("左子节点-左叶子结点");
        Component left_right = new Leaf("左子节点-右叶子结点");
        left.add(left_left);
        left.add(left_right);

        Component right_left = new Leaf("右子节点-左叶子结点");
        right.add(right_left);
        
        root.foreach();
    }

}
