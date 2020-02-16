package com.example.demo.topic;

import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class TopicController {
    
    @RequestMapping("/topics")
    public List<Topic> getTopics() {
        return Arrays.asList(
        new Topic("0912","Java","This Is Java!!!"),    
        new Topic("0932","Dart","This Is Dart!!!")
        
        );
    }
    

}