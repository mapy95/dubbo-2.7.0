package com.luban.provider;

import com.luban.api.HelloService;
import org.apache.dubbo.common.URL;
import org.apache.dubbo.rpc.RpcContext;

/**
 * @Author 马鹏勇
 * @Date 2020/2/18 上午8:25
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String username) {
        URL url = RpcContext.getContext().getUrl();
        return "hello "+username +String.format("; protocol is %s,address is %s ",url.getProtocol(),url.getAddress());
    }
}
