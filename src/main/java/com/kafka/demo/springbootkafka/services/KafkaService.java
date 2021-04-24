package com.kafka.demo.springbootkafka.services;

import com.kafka.demo.springbootkafka.models.User;

public interface KafkaService {
//    public String produceMessage(String message);
    public String produceUser(User user);
}
