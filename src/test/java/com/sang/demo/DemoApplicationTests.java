package com.sang.demo;

import com.sang.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    UserService userService;
    @Test
    void contextLoads() {
        userService.insert("admin1111111111111111111111",new BCryptPasswordEncoder().encode("admin"));
        System.out.println(userService.loadUserByUsername("admin"));
    }

}
