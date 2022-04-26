package com.example;

import jakarta.inject.Singleton;

@Singleton
public class HelloService {

    public String sayHi(String name) {
        return "Hello " + name;
    }
}
