package com.guzmans.appventas.service.impl;

import com.guzmans.appventas.repository.ResetTokenDAO;
import com.guzmans.appventas.repository.model.ResetToken;
import com.guzmans.appventas.service.ResetTokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResetTokenServiceImpl implements ResetTokenService {

	@Autowired
	private ResetTokenDAO repo;

	@Override
	public ResetToken findByToken(String token) {
		return repo.findByToken(token);
	}

	@Override
	public void guardar(ResetToken token) {
		repo.save(token);

	}

	@Override
	public void eliminar(ResetToken token) { 
		repo.delete(token);
	}

}
