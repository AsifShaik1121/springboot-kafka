package com.asiflearing.cabbookingdriver.service;

import com.asiflearing.cabbookingdriver.AppConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class CabLocationService {
    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;
    public boolean location(String location) {
        kafkaTemplate.send(AppConstants.Cab_Location, location);
        return true;
    }
}
