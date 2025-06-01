package com.chat.ChatApp.controller;


import com.chat.ChatApp.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController
{

    // /app/sendMessage
    @MessageMapping("/sendMessage")
    @SendTo("/topic/messages")
    public ChatMessage sendMessage(ChatMessage message)
    {
        return message;
    }

    @GetMapping("chat")
    public String chat()
    {
        return "chat";
    }
}
