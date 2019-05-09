package org.gy.demo.creation.builder;

import java.util.ArrayList;
import java.util.List;

import org.gy.demo.creation.factory.commonFactory.MailSender;
import org.gy.demo.creation.factory.commonFactory.Sender;
import org.gy.demo.creation.factory.commonFactory.SmsSender;

/**
 * 建造者模式<br>
 * 工厂类模式提供的是创建单个类的模式，而建造者模式则是将各种产品集中起来进行管理，用来创建复合对象
 */
public class Builder {
    
    private List<Sender> list = new ArrayList<Sender>();  
    
    public void produceMailSender(int count){  
        for(int i=0; i<count; i++){  
            list.add(new MailSender());  
        }  
    }  
      
    public void produceSmsSender(int count){  
        for(int i=0; i<count; i++){  
            list.add(new SmsSender());  
        }  
    }  

}
