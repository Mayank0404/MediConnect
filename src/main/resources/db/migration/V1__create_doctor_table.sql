CREATE TABLE doctors
(
    id BIGSERIAL PRIMARY KEY,

    first_name VARCHAR(100) NOT NULL,

    last_name VARCHAR(100) NOT NULL,

    gender VARCHAR(20) NOT NULL,

    qualification VARCHAR(150) NOT NULL,

    license_number VARCHAR(100) NOT NULL UNIQUE,

    email VARCHAR(255) NOT NULL UNIQUE,

    phone_number VARCHAR(20) NOT NULL UNIQUE,

    years_of_experience INTEGER NOT NULL,

    is_active BOOLEAN NOT NULL DEFAULT TRUE,

    created_at TIMESTAMPTZ NOT NULL DEFAULT CURRENT_TIMESTAMP,

    updated_at TIMESTAMPTZ NOT NULL DEFAULT CURRENT_TIMESTAMP,

    CONSTRAINT chk_doctor_experience
        CHECK (years_of_experience >= 0),

    CONSTRAINT chk_doctor_gender
        CHECK (gender IN ('MALE', 'FEMALE', 'OTHER'))
);