package com.lomo.dubbo.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lomo on 2016/12/27.
 */
public class Consumer {
  public static void main(String[] args) {
    ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(new String[]{"dubbo-demo-consumer.xml"});
    ctx.start();
    DemoService demoService = (DemoService) ctx.getBean("demoService");
    String response = demoService.sayHello("lomo");
    System.out.println(response);
  }
}
