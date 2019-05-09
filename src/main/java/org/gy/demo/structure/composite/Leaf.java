package org.gy.demo.structure.composite;

/**
 * 叶子节点，没有子节点
 */
public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void add(Component c) {
        // TODO Auto-generated method stub

    }

    @Override
    public void remove(Component c) {
        // TODO Auto-generated method stub

    }

    @Override
    public void foreach() {
        System.out.println("叶子节点：" + this.getName());

    }

}
