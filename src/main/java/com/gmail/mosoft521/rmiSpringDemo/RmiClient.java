package com.gmail.mosoft521.rmiSpringDemo;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RmiClient {

    private static final Logger LOG = Logger.getLogger(RmiClient.class);

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("client.xml");
        AccountService accountService = (AccountService) ctx.getBean("mobileAccountService");
        String result = accountService.shoopingPayment("13800138000", (byte) 5);
        LOG.info(result);
    }
}
/*
11:09:00 [main] ClassPathXmlApplicationContext - Refreshing org.springframework.context.support.ClassPathXmlApplicationContext@59e5ddf: startup date [Sun Mar 06 11:09:00 CST 2016]; root of context hierarchy
11:09:00 [main] XmlBeanDefinitionReader - Loading XML bean definitions from class path resource [client.xml]
 */