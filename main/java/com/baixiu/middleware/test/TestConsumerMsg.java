package com.baixiu.middleware.test;

import com.baixiu.middleware.mq.core.inner.CustomMessageListener;
import com.baixiu.middleware.mq.model.CommonMessage;
import org.springframework.stereotype.Component;

/**
 * @author baixiu
 * @date 创建时间 2023/12/5 2:43 PM
 */
@Component
public class TestConsumerMsg implements CustomMessageListener {

    @Override
    public void onMessage(CommonMessage commonMessage) {
        System.out.println("接收到消息："+commonMessage);
    }

}
