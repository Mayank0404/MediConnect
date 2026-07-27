package com.mayank.mediconnect.mediconnect.service;

import com.mayank.mediconnect.mediconnect.dto.request.CreateDoctorRequest;
import com.mayank.mediconnect.mediconnect.dto.response.DoctorResponse;

public interface DoctorService {
    DoctorResponse createDoctor(CreateDoctorRequest request);
}
