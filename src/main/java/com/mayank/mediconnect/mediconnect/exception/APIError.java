package com.mayank.mediconnect.mediconnect.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.OffsetDateTime;

@Getter
@Builder
@AllArgsConstructor
public class APIError {

    private OffsetDateTime timestamp;

    private int status;

    private String error;

    private String message;

    private String path;
}