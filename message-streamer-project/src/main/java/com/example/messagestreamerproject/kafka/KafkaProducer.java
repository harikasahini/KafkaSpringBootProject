package com.example.messagestreamerproject.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {


    private static final Logger LOGGER= LoggerFactory.getLogger(KafkaProducer.class);
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
// constructor based injection of dependency
//    public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
//        this.kafkaTemplate = kafkaTemplate;
//    }

    public void sendMessage(String message){
        LOGGER.info(String.format("Message sent from producer senMessage method %s",message));
        kafkaTemplate.send("jackTopic", message);
    }
}
