package com.mitocode.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mitocode.entity.TipoTargeta;
import com.mitocode.repository.ItipoTargetaRepository;

@Service 
public class TipoTargetaService {
	@Autowired
	ItipoTargetaRepository itipoTargetaRepo;
		
	public void crear (TipoTargeta tipoTargeta) {
		itipoTargetaRepo.save(tipoTargeta);
	}
	public void Eliminar (TipoTargeta tipoTargeta) {
		itipoTargetaRepo.delete(tipoTargeta);
	}
	public void actualizar (TipoTargeta tipoTargeta) {
		itipoTargetaRepo.save(tipoTargeta);	
	}
	public List<TipoTargeta> consultar () {	
		 List<TipoTargeta>  tipoTargeta= itipoTargetaRepo.findAll();
		return  tipoTargeta ;	

}
}





