package com.mayank.mediconnect.mediconnect.mapper;

import com.mayank.mediconnect.mediconnect.dto.request.CreateDoctorRequest;
import com.mayank.mediconnect.mediconnect.dto.response.DoctorResponse;
import com.mayank.mediconnect.mediconnect.entity.Doctor;

public final class DoctorMapper {
    private DoctorMapper(){

    }
    public static Doctor toEntity(CreateDoctorRequest request){
        return Doctor.builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .gender(request.getGender())
                .qualification(request.getQualification())
                .licenseNumber(request.getLicenseNumber())
                .email(request.getEmail())
                .phoneNumber(request.getPhoneNumber())
                .yearsOfExperience(request.getYearsOfExperience())
                .build();
    }
    public static DoctorResponse toResponse(Doctor doctor){
        return DoctorResponse.builder()
                .id(doctor.getId())
                .firstName(doctor.getFirstName())
                .lastName(doctor.getLastName())
                .gender(doctor.getGender())
                .qualification(doctor.getQualification())
                .licenseNumber(doctor.getLicenseNumber())
                .email(doctor.getEmail())
                .phoneNumber(doctor.getPhoneNumber())
                .yearsOfExperience(doctor.getYearsOfExperience())
                .isActive(doctor.getIsActive())
                .createdAt(doctor.getCreatedAt())
                .updatedAt(doctor.getUpdatedAt())
                .build();
    }
}
