package com.example.messagestreamerproject.controller;

import com.example.messagestreamerproject.dto.User;
import com.example.messagestreamerproject.kafka.JsonKafkaProducer;
import com.example.messagestreamerproject.kafka.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/kafka")
public class JsonMessageController {

    @Autowired
    private JsonKafkaProducer jsonKafkaProducer;


    @GetMapping("/publishJson")
    public ResponseEntity<String> publish(@RequestBody User user){
        jsonKafkaProducer.sendMessage(user);
        return ResponseEntity.ok("Json Message sent to the topic");
    }
}
