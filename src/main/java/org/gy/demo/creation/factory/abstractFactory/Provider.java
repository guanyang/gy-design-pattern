package org.gy.demo.creation.factory.abstractFactory;

import org.gy.demo.creation.factory.commonFactory.Sender;

/**
 * 抽象工厂<br>
 * 定义一个工厂的抽象，一旦需要增加新的功能，直接增加新的工厂实现类就可以了
 */
public interface Provider {

    public Sender produce();
}
