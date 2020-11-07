package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_PROTOTYPE;
import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_SINGLETON;

@Service
@Scope(SCOPE_PROTOTYPE)
public class GreetingService {
    public GreetingService(){
        System.out.println("Service: init instance...");
    }

    String sayHi() {
        return "hello world";
    }
}
