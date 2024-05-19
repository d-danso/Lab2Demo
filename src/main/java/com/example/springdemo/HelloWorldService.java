package com.example.springdemo;

public class HelloWorldService implements MessageService {
    @Override
    public String getMessage() {
        return "Hello, World!";
    }
}