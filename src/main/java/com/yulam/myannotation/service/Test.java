package com.yulam.myannotation.service;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by CarloJones on 2018/10/11.
 */
@Component
@Order(value = 1)
public class Test implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        ClassPathXMLApplicationContext path =
                new ClassPathXMLApplicationContext(
                        "configAnnotation.xml");
        UserServiceImpl userService =(UserServiceImpl)path.getBean("userService");
        userService.show();
    }
}
