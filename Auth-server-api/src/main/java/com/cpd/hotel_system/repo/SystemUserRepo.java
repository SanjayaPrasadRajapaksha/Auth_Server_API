package com.cpd.hotel_system.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cpd.hotel_system.entity.SystemUser;


public interface SystemUserRepo extends JpaRepository<SystemUser, String> {



}
