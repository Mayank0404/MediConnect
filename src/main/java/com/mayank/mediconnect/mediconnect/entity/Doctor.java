package com.mayank.mediconnect.mediconnect.entity;

import com.mayank.mediconnect.mediconnect.constants.Gender;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.OffsetDateTime;

@Entity
@Table(name = "doctors")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "first_name", nullable = false, length = 100)
    private String firstName;



    @Column(name = "last_name", nullable = false, length = 100)
    private String lastName;


    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private Gender gender;


    @Column(nullable = false, length = 150)
    private String qualification;


    @Column(name = "license_number", nullable = false, unique = true, length = 100)
    private String licenseNumber;

    @Column(nullable = false, unique = true, length = 255)
    private String email;

    @Column(name = "phone_number", nullable = false, unique = true, length = 20)
    private String phoneNumber;

    @Column(name = "years_of_experience", nullable = false)
    private Integer yearsOfExperience;

    @Builder.Default
    @Column(name = "is_active", nullable = false)
    private Boolean isActive= true;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private OffsetDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at", nullable = false)
    private OffsetDateTime updatedAt;


}