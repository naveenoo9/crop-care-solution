package com.crop_care.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crop_care.models.enitity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

}