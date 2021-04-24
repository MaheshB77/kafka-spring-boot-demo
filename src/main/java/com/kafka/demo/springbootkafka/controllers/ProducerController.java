package com.kafka.demo.springbootkafka.controllers;

import com.kafka.demo.springbootkafka.services.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("kafka")
public class ProducerController {
    @Autowired
    private KafkaService kafkaService;

    @GetMapping("produce/{message}")
    public String produceMessage(@PathVariable("message") String message) {
        return this.kafkaService.produceMessage(message);
    }

//    @PostMapping("produce/")
}
