package com.cpd.hotel_system.auth_server_api.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cpd.hotel_system.auth_server_api.entity.Otp;


public interface OtpRepo extends JpaRepository<Otp, String> {
@Query(value = "SELECT * FROM Otp WHERE system_user_id= ?1",nativeQuery=true)
    public Optional<Otp> findBySystemUserId(String id);



}
