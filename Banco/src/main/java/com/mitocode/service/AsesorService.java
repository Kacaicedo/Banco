package com.mitocode.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mitocode.entity.Asesor;
import com.mitocode.repository.IasesorRepository;

@Service 
public class AsesorService {

	@Autowired
	IasesorRepository iasesorRepo;
		
	public void crear (Asesor asesor) {
		iasesorRepo.save(asesor);
	}
	public void Eliminar (Asesor asesor) {
		iasesorRepo.delete(asesor);
	}
	public void actualizar (Asesor asesor) {
		iasesorRepo.save(asesor);	
	}
	public List<Asesor> consultar () {	
		 List<Asesor> asesor= iasesorRepo.findAll();
		return asesor;	

}
}
