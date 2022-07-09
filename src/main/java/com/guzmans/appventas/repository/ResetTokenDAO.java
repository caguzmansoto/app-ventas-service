package com.guzmans.appventas.repository;

import com.guzmans.appventas.repository.model.ResetToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResetTokenDAO extends JpaRepository<ResetToken, Integer> {
	
	//from ResetToken where token = :?
	ResetToken findByToken(String token);

}

