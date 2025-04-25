package com.xworkz.gymapp.runner;

import com.xworkz.gymapp.constant.MemberShipType;
import com.xworkz.gymapp.dto.GymMembershipDetailsDto;
import com.xworkz.gymapp.repositiry.GymMembershipRepository;
import com.xworkz.gymapp.repositiry.GymMembershipRepositoryImpl;
import com.xworkz.gymapp.service.GymMemberShipService;
import com.xworkz.gymapp.service.GymMembershipServiceImplementation;

public class GymMemberShipRunner {
    public static void main(String[] args) {
        GymMembershipDetailsDto dto = new GymMembershipDetailsDto();
        dto.setMemberId(1);
        dto.setMemberName("meghashree");
        dto.setMemberEmailId("meghas@gmail.com");
        dto.setMemberShipType(MemberShipType.DAILY);
        System.out.println(dto.getMemberId());
        System.out.println(dto.getMemberName());
        System.out.println(dto.getMemberEmailId());
        System.out.println(dto.getClass());
        System.out.println(dto.toString());

        GymMembershipRepository gymMembershipRepository = new GymMembershipRepositoryImpl();

        GymMemberShipService service = new GymMembershipServiceImplementation (gymMembershipRepository);
        System.out.println(" invoking");
        service.validateDate(dto);
        System.out.println(" invoking");
        service.validateDate(dto);
        System.out.println(" invoking");
        service.validateDate(dto);



    }

}
