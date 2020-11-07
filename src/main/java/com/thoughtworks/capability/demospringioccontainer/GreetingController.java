package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_SINGLETON;

@RestController
@Scope(SCOPE_SINGLETON)
//have to be  singleton scope
public class GreetingController {

    private GreetingService greetingService;

    @Autowired
    public GreetingController(GreetingService greetingService){
//         this line does not matter to result
//        this.greetingService = greetingService;
        System.out.println("Controller: init instance...");
    }

    @GetMapping("/greet")
    public String greet() {
        return getPrototypeService().sayHi();
    }

    @Lookup
    public GreetingService getPrototypeService() {
        return greetingService;
    }
}