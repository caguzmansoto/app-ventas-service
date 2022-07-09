package com.guzmans.appventas.service;

import com.guzmans.appventas.repository.model.ResetToken;

public interface ResetTokenService {
	
	ResetToken findByToken(String token);
	
	void guardar(ResetToken token);
	
	void eliminar(ResetToken token);
}
