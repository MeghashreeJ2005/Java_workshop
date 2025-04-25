package com.xworkz.gymapp.service;
import com.xworkz.gymapp.dto.GymMembershipDetailsDto;

public interface GymMemberShipService {
    boolean validateDate(GymMembershipDetailsDto dto);

    void readDto();
}
