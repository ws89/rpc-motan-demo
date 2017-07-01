package io.github.ws89.demo.motan;

import io.github.ws89.demo.motan.service.ProviderService;
import io.github.ws89.demo.motan.service.call.RemoteService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by mikon on 2017-07-01.
 */
public class Client {

    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:motan_client.xml");

        ProviderService providerService = (ProviderService) applicationContext.getBean("remoteService");

        System.out.println(providerService.hello("motan"));

        System.out.println("client call done.");
    }
}
