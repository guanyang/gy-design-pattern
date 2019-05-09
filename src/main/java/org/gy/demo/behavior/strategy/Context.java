package org.gy.demo.behavior.strategy;

/**
 * 环境角色类，持有一个Strategy的引用<br>
 * <strong>策略模式属于对象的行为模式。其用意是针对一组算法，将每一个算法封装到具有共同接口的独立的类中，从而使得它们可以相互替换。策略模式使得算法可以在不影响到客户端的情况下发生变化。</strong>
 */
public class Context {

    // 持有一个具体策略的对象
    private Strategy strategy;

    public Context(Strategy strategy) {
        super();
        this.strategy = strategy;
    }

    /**
     * 策略方法
     */
    public void contextInterface() {

        strategy.strategyInterface();
    }

    public static void main(String[] args) {
        Strategy strategy = new ConcreteStrategyA();
        Context context = new Context(strategy);
        context.contextInterface();

        strategy = new ConcreteStrategyB();
        context = new Context(strategy);
        context.contextInterface();
    }

}
