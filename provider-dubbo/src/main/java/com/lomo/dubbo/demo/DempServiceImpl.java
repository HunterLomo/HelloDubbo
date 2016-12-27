package com.lomo.dubbo.demo;

import com.alibaba.dubbo.rpc.RpcContext;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by lomo on 2016/12/27.
 */
public class DempServiceImpl implements DemoService {
  @Override
  public String sayHello(String name) {
    System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name
        + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
    return "Hello " + name + ", response form provider: " + RpcContext.getContext().getLocalAddress();
  }
}
