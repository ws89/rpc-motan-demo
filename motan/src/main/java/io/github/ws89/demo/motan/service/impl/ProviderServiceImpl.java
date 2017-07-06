package io.github.ws89.demo.motan.service.impl;

import com.weibo.api.motan.rpc.RpcContext;
import io.github.ws89.demo.motan.service.ProviderService;
import org.springframework.stereotype.Service;

/**
 * Created by mikon on 2017-07-01.
 */
@Service("ProviderServiceImpl")
public class ProviderServiceImpl implements ProviderService {

    public String hello(String name) {
        System.out.println(name + " invoked rpc service.");
        RpcContext rpcContext = RpcContext.getContext();

        return "hello " + name;
    }
}
