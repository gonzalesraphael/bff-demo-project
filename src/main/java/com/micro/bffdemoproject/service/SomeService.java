package com.micro.bffdemoproject.service;


import com.micro.bffdemoproject.data.request.SomeRequest;
import com.micro.bffdemoproject.messaging.producer.KafkaProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SomeService {

    private final KafkaProducer kafkaProducer;

    public void someOperation(SomeRequest request) {
        kafkaProducer.testKafkaProducer(request);
    }
}
