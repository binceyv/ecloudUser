package com.ecloud.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecloud.user.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	

}
