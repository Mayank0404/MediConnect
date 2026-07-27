package com.mayank.mediconnect.mediconnect.controller;

import com.mayank.mediconnect.mediconnect.dto.request.CreateDoctorRequest;
import com.mayank.mediconnect.mediconnect.dto.response.DoctorResponse;
import com.mayank.mediconnect.mediconnect.service.DoctorService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/doctors")
@RequiredArgsConstructor
public class DoctorController {
    private final DoctorService doctorService;
    @PostMapping
    public DoctorResponse createDoctor(@Valid @RequestBody CreateDoctorRequest request){
        return doctorService.createDoctor(request);
    }
}
