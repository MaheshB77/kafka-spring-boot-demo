package com.kafka.demo.springbootkafka.controllers;

import com.kafka.demo.springbootkafka.services.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kafka")
public class ConsumerController {
    @Autowired
    private KafkaService kafkaService;

    @GetMapping("produce/{message}")
    public String produceMessage(@PathVariable("message") String message) {
        return this.kafkaService.produceMessage(message);
    }
}
