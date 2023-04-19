package com.mitocode.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mitocode.entity.Cuenta;
import com.mitocode.repository.IcuentaRepository;

@Service 
public class CuentaService {
	@Autowired
	IcuentaRepository icuentaRepo;
		
	public void crear (Cuenta cuenta) {
		icuentaRepo.save(cuenta);
	}
	public void Eliminar (Cuenta cuenta) {
		icuentaRepo.delete(cuenta);
	}
	public void actualizar (Cuenta cuenta) {
		icuentaRepo.save(cuenta);	
	}
	public List<Cuenta> consultar () {	
		 List<Cuenta> cuenta= icuentaRepo.findAll();
		return cuenta;	


}

}
