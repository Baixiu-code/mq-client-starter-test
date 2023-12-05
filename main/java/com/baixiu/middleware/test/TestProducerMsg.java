package com.baixiu.middleware.test;

import com.baixiu.middleware.mq.core.impl.rocketmq.config.RocketBootConfig;
import com.baixiu.middleware.mq.core.inner.CustomMessageProducer;
import com.baixiu.middleware.mq.model.CommonMessage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author baixiu
 * @date 创建时间 2023/11/29 7:15 PM
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@ComponentScan(basePackages={"com.baixiu.middleware.test","com.baixiu.middleware.mq"})
@TestPropertySource("classpath:rocketmq.properties")
public class TestProducerMsg {

    @Autowired
    private CustomMessageProducer customMessageProducer;

    public void sendMsgTest(){
        try {
            CommonMessage commonMessage=new CommonMessage ();
            commonMessage.setTopic("test");
            commonMessage.setText ("hello baixiu mq.");
            customMessageProducer.send ("test",commonMessage);
            System.out.println ("test topic send succeed");
        } catch (Exception e) {
            throw new RuntimeException (e);
        }
    }

    @Test
    public void testSendMsg(){
        sendMsgTest();
    }

}
