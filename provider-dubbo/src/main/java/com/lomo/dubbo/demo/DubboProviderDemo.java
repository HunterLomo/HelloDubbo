package com.lomo.dubbo.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lomo on 2016/12/27.
 */
public class DubboProviderDemo {
  public static void main(String[] args) {
    ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(new String[]{"dubbo-demo-provider.xml"});
    ctx.start();
    long startTime = System.currentTimeMillis();
    long endTime = startTime + 30 * 60 * 1000;
    while (true) {
      if (System.currentTimeMillis() == endTime) {
        ctx.stop();
      }
    }
//    System.in.read();
  }
}
