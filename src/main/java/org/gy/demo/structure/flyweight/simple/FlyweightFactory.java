package org.gy.demo.structure.flyweight.simple;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.gy.demo.structure.flyweight.composite.ConcreteCompositeFlyweight;

/**
 * 享元工厂(FlyweightFactory)角色，定义成静态享元工厂<br>
 * 必须通过享元工厂获取相关对象，客户端不可以直接将具体享元类实例化
 */
public class FlyweightFactory {

    private static final Map<Integer, Flyweight> cacheMap = new HashMap<Integer, Flyweight>();

    /**
     * 单纯享元工厂方法
     */
    public static Flyweight getFlyweight(Integer state) {
        // 先从缓存中查找对象
        Flyweight fly = cacheMap.get(state);
        if (fly == null) {
            synchronized (cacheMap) {
                if ((fly = cacheMap.get(state)) == null) {
                    // 如果对象不存在则创建一个新的Flyweight对象
                    fly = new ConcreteFlyweight(state);
                    // 把这个新的Flyweight对象添加到缓存中
                    cacheMap.put(state, fly);
                }
            }

        }
        return fly;
    }

    public static Flyweight getCompositeFlyweight(List<Integer> compositeState) {
        ConcreteCompositeFlyweight compositeFly = new ConcreteCompositeFlyweight();
        for (Integer state : compositeState) {
            compositeFly.add(state, getFlyweight(state));
        }

        return compositeFly;
    }

    public static void main(String[] args) {
        Flyweight flyweight1 = FlyweightFactory.getFlyweight(1);
        flyweight1.operation("flyweight1");

        Flyweight flyweight2 = FlyweightFactory.getFlyweight(1);
        flyweight2.operation("flyweight2");

        System.out.println("是否是同一享元对象：" + (flyweight1 == flyweight2));

        List<Integer> compositeState = new ArrayList<Integer>();
        compositeState.add(1);
        compositeState.add(2);
        compositeState.add(3);
        compositeState.add(1);
        compositeState.add(2);

        Flyweight compositeFly1 = FlyweightFactory.getCompositeFlyweight(compositeState);
        Flyweight compositeFly2 = FlyweightFactory.getCompositeFlyweight(compositeState);
        compositeFly1.operation("Composite Call");

        System.out.println("复合享元模式是否可以共享对象：" + (compositeFly1 == compositeFly2));
    }

}
