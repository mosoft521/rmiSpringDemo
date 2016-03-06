package com.gmail.mosoft521.rmiSpringDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RmiServer {

    public static void main(String[] args) throws InterruptedException {
        new ClassPathXmlApplicationContext("server.xml");

        Object lock = new Object();
        synchronized (lock) {
            lock.wait();
        }
    }
}
/*
11:08:54 [main] ClassPathXmlApplicationContext - Refreshing org.springframework.context.support.ClassPathXmlApplicationContext@59e5ddf: startup date [Sun Mar 06 11:08:54 CST 2016]; root of context hierarchy
11:08:54 [main] XmlBeanDefinitionReader - Loading XML bean definitions from class path resource [server.xml]
11:09:01 [RMI TCP Connection(2)-192.168.1.3] MobileAccountServiceImpl - Message is: Your mobile number is "13800138000", protocol type is "5".
 */