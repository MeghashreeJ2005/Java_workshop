package com.xworkz.gymapp.repositiry;

import com.xworkz.gymapp.dto.GymMembershipDetailsDto;

public interface GymMembershipRepository {

    boolean saveDto(GymMembershipDetailsDto dto);
    void readDto();
}
