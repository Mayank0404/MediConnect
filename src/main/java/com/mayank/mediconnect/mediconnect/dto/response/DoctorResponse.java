package com.mayank.mediconnect.mediconnect.dto.response;

import com.mayank.mediconnect.mediconnect.constants.Gender;
import lombok.*;

import java.time.OffsetDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class DoctorResponse {
    private Long id;

    private String firstName;

    private String lastName;

    private Gender gender;

    private String qualification;

    private String licenseNumber;

    private String email;

    private String phoneNumber;

    private Integer yearsOfExperience;

    private Boolean isActive;

    private OffsetDateTime createdAt;

    private OffsetDateTime updatedAt;
}
