package com.techqwerty.springbootkafkademo.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic techqwertyTopic(){
        return TopicBuilder.name("techqwerty").build();
    }

    @Bean
    public NewTopic techqwertyJsonTopic(){
        return TopicBuilder.name("techqwerty_json").build();
    }
}
