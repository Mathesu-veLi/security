package com.example.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

  @GetMapping("/hello")
  public String sayHello () {
    return "Hello";
  }

  @GetMapping("/user")
  public String userEndpoint () {
    return "Hello, User";
  }

  @GetMapping("/admin")
  public String adminEndpoint () {
    return "Hello, Admin";
  }
}
