package com.mitocode.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mitocode.entity.TipoCuenta;
import com.mitocode.repository.ItipoCuentaRepository;

@Service 
public class TipoCuentaService {
	@Autowired
	ItipoCuentaRepository itipoCuentaRepo;
		
	public void crear (TipoCuenta tipoCuenta) {
		itipoCuentaRepo.save(tipoCuenta);
	}
	public void Eliminar (TipoCuenta tipoCuenta) {
		itipoCuentaRepo.delete(tipoCuenta);
	}
	public void actualizar (TipoCuenta tipoCuenta) {
		itipoCuentaRepo.save(tipoCuenta);	
	}
	public List<TipoCuenta> consultar () {	
		 List<TipoCuenta> tipoCuenta= itipoCuentaRepo.findAll();
		return tipoCuenta ;	

}
}
