package com.kafka.demo.springbootkafka.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaServiceImpl implements KafkaService{
    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;

    private final String kafkaTopic = "KafkaExample";

    @Override
    public String produceMessage(String message) {
        try {
            this.kafkaTemplate.send(kafkaTopic, message);
            return message + " Produced successfully";
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}
