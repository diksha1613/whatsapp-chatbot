package com.example.whatsapp_bot.controller;

import com.example.whatsapp_bot.model.MessageRequest;
import com.example.whatsapp_bot.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/webhook")
public class WebhookController {

    @Autowired
    private ChatService chatService;

    @PostMapping
    public String receiveMessage(@RequestBody MessageRequest request) {

        // Log incoming message
        System.out.println("Received message: " + request.getMessage());

        // Get reply
        String reply = chatService.getReply(request.getMessage());

        return reply;
    }
}