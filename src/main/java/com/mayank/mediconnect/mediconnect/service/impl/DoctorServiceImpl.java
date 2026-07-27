package com.mayank.mediconnect.mediconnect.service.impl;

import com.mayank.mediconnect.mediconnect.dto.request.CreateDoctorRequest;
import com.mayank.mediconnect.mediconnect.dto.response.DoctorResponse;
import com.mayank.mediconnect.mediconnect.entity.Doctor;
import com.mayank.mediconnect.mediconnect.exception.DuplicateResourceException;
import com.mayank.mediconnect.mediconnect.mapper.DoctorMapper;
import com.mayank.mediconnect.mediconnect.repository.DoctorRepository;
import com.mayank.mediconnect.mediconnect.service.DoctorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
@Service
@RequiredArgsConstructor

public class DoctorServiceImpl implements DoctorService {
    private final DoctorRepository doctorRepository;

    @Override
    public DoctorResponse createDoctor(CreateDoctorRequest request) {
        if(doctorRepository.existsByEmail(request.getEmail())){
            throw new DuplicateResourceException("Doctor email already exists");        }
        if(doctorRepository.existsByPhoneNumber(request.getPhoneNumber())){
            throw new DuplicateResourceException("Doctor email already exists");        }
        if (doctorRepository.existsByLicenseNumber(request.getLicenseNumber())) {
            throw new DuplicateResourceException("Doctor email already exists");        }
        Doctor doctor= DoctorMapper.toEntity(request);
        Doctor savedDoctor = doctorRepository.save(doctor);
        return DoctorMapper.toResponse(savedDoctor);

    }

}
