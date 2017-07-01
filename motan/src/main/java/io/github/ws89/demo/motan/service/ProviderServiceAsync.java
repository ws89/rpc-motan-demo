package io.github.ws89.demo.motan.service;

import com.weibo.api.motan.rpc.ResponseFuture;

/**
 * Created by mikon on 2017-07-01.
 */
public interface ProviderServiceAsync {
    public String hello(String name);

    public ResponseFuture helloAsync(String name);
}
