package com.luban.consumer;

import com.luban.api.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author 马鹏勇
 * @Date 2020/2/18 上午8:24
 */
public class Consumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("dubbo-consumer.xml");
        applicationContext.start();

        HelloService helloService = applicationContext.getBean(HelloService.class);
        for (int i = 0; i < 10; i++) {
            String result = helloService.sayHello("mpy");
            System.out.println(result);
        }
    }
}
