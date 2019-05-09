package org.gy.demo.behavior.strategy;

/**
 * 具体策略(ConcreteStrategy)角色：包装了相关的算法或行为
 *
 */
public class ConcreteStrategyA implements Strategy {

    public void strategyInterface() {
        System.out.println("ConcreteStrategyA");
    }

}
