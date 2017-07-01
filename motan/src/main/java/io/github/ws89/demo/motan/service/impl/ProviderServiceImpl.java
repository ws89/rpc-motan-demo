package io.github.ws89.demo.motan.service.impl;

import io.github.ws89.demo.motan.service.ProviderService;

/**
 * Created by mikon on 2017-07-01.
 */
public class ProviderServiceImpl implements ProviderService {

    @Override
    public String hello(String name) {
        System.out.println(name + " invoked rpc service.");

        return "hello " + name;
    }
}
