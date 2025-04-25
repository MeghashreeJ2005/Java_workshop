package com.xworkz.meetup.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.security.PrivateKey;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@ToString

    public class MeetupDetailsDto {
        private String date;
        private String time;
        private String personname;
        private String  place ;
        private String gift ;

        private LocalDateTime createdOn;
        private String createdBy;
        private LocalDateTime updatedBy;



    }
