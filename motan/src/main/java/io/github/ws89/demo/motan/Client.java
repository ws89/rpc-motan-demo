package io.github.ws89.demo.motan;

import com.weibo.api.motan.rpc.Future;
import com.weibo.api.motan.rpc.FutureListener;
import com.weibo.api.motan.rpc.ResponseFuture;
import io.github.ws89.demo.motan.service.ProviderService;
import io.github.ws89.demo.motan.service.ProviderServiceAsync;
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

        // async call
        asyncCall();
    }

    private static void asyncCall(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:motan_client.xml");

        // sync call
        ProviderServiceAsync service = (ProviderServiceAsync) applicationContext.getBean("remoteServiceAsync");
        System.out.println(service.hello("sync motan"));;

        // async call
        ResponseFuture responseFuture = service.helloAsync("async motan");
        System.out.println(responseFuture.getValue());

        // multi call
        ResponseFuture future1 = service.helloAsync("motan async multi-1");
        ResponseFuture future2 = service.helloAsync("motan async multi-2");
        System.out.println(future1.getValue() + "," + future2.getValue());

        // async with listener
        FutureListener listener = new FutureListener() {
            public void operationComplete(Future future) throws Exception {
                System.out.println("async call "
                        + (future.isSuccess() ? "sucess! value:" + future.getValue() : "fail! exception:"
                        + future.getException().getMessage())
                        );
            }
        };

        ResponseFuture future3 = service.helloAsync("motan async multi-3");
        ResponseFuture future4 = service.helloAsync("motan async multi-4");
        future3.addListener(listener);
        future4.addListener(listener);
    }
}