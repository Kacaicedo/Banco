package com.mitocode.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mitocode.entity.Targeta;
import com.mitocode.repository.ItargetaRepository;

@Service
public class TargetaService  {
	@Autowired
	ItargetaRepository itargetaRepo;
	
	public void crear (Targeta targeta) {
		itargetaRepo.save(targeta);
	}
	
	public void Eliminar (Targeta targeta) {
		itargetaRepo.delete(targeta);
	}
	public void actualizar (Targeta targeta) {
		itargetaRepo.save(targeta);		
	}
	public List<Targeta> consultar () {	
		 List<Targeta> targeta= itargetaRepo.findAll();
		return targeta;	
	}

}
