package com.hospitalManagement.Patient.ExceptionHandling;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
public class ErrorResponse {
    private final int status;
    private final String error;
    private final String message;
    private final String path;

    // Private constructor
   
}