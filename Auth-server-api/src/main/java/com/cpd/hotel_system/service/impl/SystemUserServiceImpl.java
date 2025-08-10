package com.cpd.hotel_system.service.impl;

import org.springframework.stereotype.Service;

import com.cpd.hotel_system.dto.request.SystemUserRequestDto;
import com.cpd.hotel_system.repo.SystemUserRepo;
import com.cpd.hotel_system.service.SystemUserService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SystemUserServiceImpl implements SystemUserService{
    
    private final SystemUserRepo systemUserRepo;

    @Override
    public void createUser(SystemUserRequestDto dto) {
        if(dto.getFirstName() == null || dto.getFirstName().trim().isEmpty()){
            
        }
    }
    
}
