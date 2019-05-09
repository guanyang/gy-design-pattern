package org.gy.demo.structure.flyweight.composite;

import java.util.HashMap;
import java.util.Map;

import org.gy.demo.structure.flyweight.simple.Flyweight;

/**
 * 复合享元模式-复合享元(ConcreteCompositeFlyweight)角色<br>
 * <li>复合享元角色所代表的对象是不可以共享的，但是一个复合享元对象可以分解成为多个本身是单纯享元对象的组合</li><br>
 * <li>一个复合享元对象的所有单纯享元对象元素的外蕴状态都是与复合享元对象的外蕴状态相等的；而一个复合享元对象所含有的单纯享元对象的内蕴状态一般是不相等的</li><br>
 */
public class ConcreteCompositeFlyweight implements Flyweight {

    private Map<Integer, Flyweight> files = new HashMap<Integer, Flyweight>();

    /**
     * 增加一个新的单纯享元对象到聚集中
     */
    public void add(Integer key, Flyweight fly) {
        files.put(key, fly);
    }

    /**
     * 外蕴状态作为参数传入到方法中
     */
    public void operation(String state) {
        Flyweight fly = null;
        for (Object o : files.keySet()) {
            fly = files.get(o);
            fly.operation(state);
        }

    }

}
