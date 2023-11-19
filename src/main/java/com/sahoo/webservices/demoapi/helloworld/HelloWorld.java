package com.sahoo.webservices.demoapi.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @RequestMapping(method = RequestMethod.GET,path = "/hello-world")
    public String helloWorld(){
        return "HelloWorld its working 2";
    }
}
