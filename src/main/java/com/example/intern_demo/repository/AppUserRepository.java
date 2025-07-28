package com.example.intern_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.intern_demo.model.AppUser;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {
}
