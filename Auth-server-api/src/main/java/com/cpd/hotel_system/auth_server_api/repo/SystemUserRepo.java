package com.cpd.hotel_system.auth_server_api.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cpd.hotel_system.auth_server_api.entity.SystemUser;


public interface SystemUserRepo extends JpaRepository<SystemUser, String> {
//@Query(value = "select * from system_user WHERE email=?1", nativeQuery = true)
public Optional<SystemUser> findByEmail(String email);

}
