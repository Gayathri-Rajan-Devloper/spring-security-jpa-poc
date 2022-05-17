package com.security.jpa.springsecurityjpapoc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

    @GetMapping("/")
    public String test()
    {
        return "Welcome Back you are Strong";
    }

    @GetMapping("/user")
    public String user()
    {
        return "Welcome Back User";
    }

    @GetMapping("/admin")
    public String admin()
    {
        return "Welcome Back admin";
    }
}
