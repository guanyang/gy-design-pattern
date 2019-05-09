package org.gy.demo.creation.singleton;

/**
 * 另一种单例模式<br>
 * <li>Singleton缺点：如果在构造函数中抛出异常，实例将永远得不到创建，也会出错</li> <li>新思路：在创建类的时候进行同步，所以只要将创建和getInstance()分开，单独为创建加synchronized关键字</li>
 * 
 */
public class SingletonTest {

    /* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */
    private static SingletonTest instance = null;

    /* 私有构造方法，防止被实例化 */
    private SingletonTest() {
    }

    // 在创建类的时候进行同步
    private static synchronized void syncInit() {
        if (instance == null) {
            instance = new SingletonTest();
        }
    }

    // 获取实例
    public static SingletonTest getInstance() {
        if (instance == null) {
            syncInit();
        }
        return instance;
    }

}
