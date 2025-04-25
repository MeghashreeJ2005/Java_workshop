package com.xworkz.gymapp.dto;

import com.xworkz.gymapp.constant.MemberShipType;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;
@Getter
@Setter
public class GymMembershipDetailsDto {

    private int memberId;
    private String memberName;
    private String memberEmailId;
    private long contactNumber;
    private LocalDate issuedate;
    private LocalTime issuedTime;
    private LocalDate expDate;
    private MemberShipType memberShipType;



}
