package com.cpd.hotel_system.auth_server_api.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cpd.hotel_system.auth_server_api.entity.Otp;


public interface OtpRepo extends JpaRepository<Otp, String> {



}
