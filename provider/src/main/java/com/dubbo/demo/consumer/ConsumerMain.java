package com.dubbo.demo.consumer;

import com.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Jerry Lee
 */
public class ConsumerMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:/application-context-consumer.xml");
        classPathXmlApplicationContext.start();

        HelloService helloService = (HelloService) classPathXmlApplicationContext.getBean("helloService");
        String world = helloService.hello("World");

        System.out.println("=====================================");
        System.out.println(world);
        System.out.println("=====================================");
    }
}
