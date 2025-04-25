package com.xworkz.meetup.controller;


import com.xworkz.meetup.dto.MeetupDetailsDto;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

@RequestMapping("/")
@Controller
public class MeetUpController {
    public MeetUpController() {
        System.out.println("MeetupController created");
    }
    @PostMapping("/submit")
    public String acceptPostMethod(@ModelAttribute MeetupDetailsDto dto) {
        System.out.println("acceptPostMethod() invoked");
        dto.setCreatedBy("your name");
        dto.setCreatedOn(LocalDateTime.now());
        System.out.println("dto is:"+dto);


        return "success.jsp";
    }

    @GetMapping("/submit")
    public String acceptGetMethod() {
        System.out.println("acceptGetMethod() invoked");
        return "success.jsp";

    }
}