package com.mitocode.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mitocode.entity.TipoCredito;
import com.mitocode.repository.ItipoCreditoRepository;

@Service
public class TipoCreditoService {
	@Autowired
	ItipoCreditoRepository itipoCreditoRepo;
		
	public void crear (TipoCredito tipocredito) {
		itipoCreditoRepo.save(tipocredito);
	}
}
