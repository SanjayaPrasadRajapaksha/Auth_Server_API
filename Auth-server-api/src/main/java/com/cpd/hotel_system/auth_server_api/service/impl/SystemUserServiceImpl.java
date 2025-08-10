package com.cpd.hotel_system.auth_server_api.service.impl;

import org.keycloak.admin.client.Keycloak;
import org.springframework.stereotype.Service;

import com.cpd.hotel_system.auth_server_api.dto.request.SystemUserRequestDto;
import com.cpd.hotel_system.auth_server_api.repo.SystemUserRepo;
import com.cpd.hotel_system.auth_server_api.service.SystemUserService;
import com.cpd.hotel_system.auth_server_api.exception.BadRequestException;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SystemUserServiceImpl implements SystemUserService{
    
    private final SystemUserRepo systemUserRepo;

    @Override
    public void createUser(SystemUserRequestDto dto) {
        if(dto.getFirstName() == null || dto.getFirstName().trim().isEmpty()){
            throw new BadRequestException("First name is required");
        }

        if(dto.getLastName() == null || dto.getLastName().trim().isEmpty()){
            throw new BadRequestException("Last name is required");
        }

        if(dto.getEmail() == null || dto.getEmail().trim().isEmpty()){
            throw new BadRequestException("Email is required");
        }

        String userId = "";
        String otp = "";
        Keycloak keycloak = null;
    }
    
}
