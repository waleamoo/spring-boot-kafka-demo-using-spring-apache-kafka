package com.techqwerty.springbootkafkademo.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);

    // one consumer 
    @KafkaListener(topics = "techqwerty", groupId = "myGroup")
    public void consume(String messaage){
        LOGGER.info(String.format("Message is received -> %s", messaage));
        
    }
}
