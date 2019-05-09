package org.gy.demo.creation.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 原型模式（Prototype）<br>
 * 原型模式虽然是创建型的模式，但是与工程模式没有关系，从名字即可看出，该模式的思想就是将一个对象作为原型，对其进行复制、克隆，产生一个和原对象类似的新对象<br>
 * <li>浅复制：将一个对象复制后，基本数据类型的变量都会重新创建，而引用类型，指向的还是原对象所指向的。</li> <br>
 * <li>深复制：将一个对象复制后，不论是基本数据类型还有引用类型，都是重新创建的。</li>
 */
public class Prototype implements Cloneable, Serializable {

    private static final long serialVersionUID = -306073096054013375L;

    private int               num;

    private String            name;

    // 浅复制，必须实现Cloneable接口，只负责克隆按值传递的数据
    public Prototype clone() throws CloneNotSupportedException {
        return (Prototype) super.clone();
    }

    // 深度复制，必须实现Serializable接口
    // 然后把对象（实际上只是对象的拷贝）写到一个流里（序列化），再从流里读回来（反序列化），便可以重建对象

    public Prototype deepClone() throws IOException, ClassNotFoundException {

        /* 写入当前对象的二进制流 */
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        /* 读出二进制流产生的新对象 */
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (Prototype) ois.readObject();

    }

    public static void main(String[] args) throws Exception {
        Prototype prototype = new Prototype();
        prototype.setNum(10);
        prototype.setName("test");
        System.out.println("========浅复制========");
        Prototype prototype2 = prototype.clone();
        System.out.println("prototype属性：" + prototype.toString());
        System.out.println("prototype2属性：" + prototype2.toString());
        System.out.println("prototype与prototype2是否是同一个对象：" + (prototype == prototype2));
        System.out.println("prototype与prototype2的name是否是同一个对象：" + (prototype.getName() == prototype2.getName()));

        System.out.println("========深复制========");
        Prototype prototype3 = prototype.deepClone();
        System.out.println("prototype3属性：" + prototype3.toString());
        System.out.println("prototype与prototype3是否是同一个对象：" + (prototype == prototype3));
        System.out.println("prototype与prototype3的name是否是同一个对象：" + (prototype.getName() == prototype3.getName()));

    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Prototype [num=" + num + ", name=" + name + "]";
    }

}
