package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @KafkaListener(topics = "Chocolate",groupId = "Eating_item")
  public void consumeMessage(String msg){
      System.out.println("Consumed msg : "+msg);
  }
}
