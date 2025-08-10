package com.cpd.hotel_system.auth_server_api.service;

import com.cpd.hotel_system.auth_server_api.dto.request.SystemUserRequestDto;

public interface SystemUserService {
    public void createUser(SystemUserRequestDto dto);
}



