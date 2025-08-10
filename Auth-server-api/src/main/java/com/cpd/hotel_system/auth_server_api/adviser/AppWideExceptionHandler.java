package com.cpd.hotel_system.auth_server_api.adviser;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.cpd.hotel_system.auth_server_api.exception.BadRequestException;
import com.cpd.hotel_system.auth_server_api.util.StandardResponseDto;


public class AppWideExceptionHandler {
     @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<StandardResponseDto> handleBadRequestException(BadRequestException ex) {
        return new ResponseEntity<StandardResponseDto>(
                new StandardResponseDto(400,ex.getMessage(),ex),
                HttpStatus.BAD_REQUEST
        );
    }
}
