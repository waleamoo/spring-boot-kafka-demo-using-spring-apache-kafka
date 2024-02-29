package com.techqwerty.springbootkafkademo.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);

    // one consumer 
    @KafkaListener(topics = "${spring.kafka.topic.name}", groupId = "${spring.kafka.consumer.group-id}")
    public void consume(String messaage){
        LOGGER.info(String.format("Message is received -> %s", messaage));

    }
}
