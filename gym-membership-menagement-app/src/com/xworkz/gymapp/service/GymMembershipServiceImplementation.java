package com.xworkz.gymapp.service;

import com.xworkz.gymapp.dto.GymMembershipDetailsDto;
import com.xworkz.gymapp.repositiry.GymMembershipRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter@AllArgsConstructor
public class GymMembershipServiceImplementation implements GymMemberShipService {

    private GymMembershipRepository gymMembershipRepository;


    @Override
    public boolean validateDate(GymMembershipDetailsDto dto) {
        if (dto != null) {
            System.out.println("dto is not save the data");
            boolean saveResult = gymMembershipRepository.saveDto(dto);
            return saveResult;
        }
        return true;
    }

    @Override
    public void readDto(){
        this.gymMembershipRepository.readDto();
    }
}



