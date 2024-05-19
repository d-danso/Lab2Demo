package com.example.springdemo;

import com.example.springdemo.MessageService;

public class MessagePrinter {
    private MessageService messageService;

    // Setter method for dependency injection
    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void printMessage() {
        System.out.println(messageService.getMessage());
    }
}
