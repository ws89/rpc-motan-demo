package io.github.ws89.demo.motan.service;

import com.weibo.api.motan.transport.async.MotanAsync;

/**
 * Created by mikon on 2017-07-01.
 */
@MotanAsync
public interface ProviderService {

    public String hello(String name);

}
