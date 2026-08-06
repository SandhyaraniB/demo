package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


@Service
public class ProducerService {
    @Autowired
    KafkaTemplate<String , String> kafkaTemplate;

    public void pushingToKafka(String message){
        System.out.println("Input message : "+message);
        kafkaTemplate.send("Chocolate",message);
    }
}
