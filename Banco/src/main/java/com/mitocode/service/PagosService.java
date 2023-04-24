package com.mitocode.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.mitocode.entity.Pagos;
import com.mitocode.repository.IpagosRepository;

@Service
public class PagosService {

	@Autowired
	IpagosRepository ipagosRepo;
	
	public void crear(Pagos pagos) { 
		ipagosRepo.save(pagos);
		}
		public Integer Consultacuota (Integer idCredito) {
		Integer Consultacuotas= ipagosRepo.getCantCuotas(idCredito);
		return Consultacuotas;
		}
		
	public Integer ConsultaSaldo ( Integer id_credito ){
		Integer UltimoSaldo = ipagosRepo.getSaldo(id_credito);
		return UltimoSaldo;
	}
	
	public Integer CuotaPendiente ( Integer id_credito ){
		Integer CuotaPendientes  = ipagosRepo.getCuotasPendientes(id_credito);
		return CuotaPendientes ;
	}
	
		/*Targeta
		
		public Integer ConsultacuotaTr (Integer idTargeta) {
		Integer ConsultacuotasTr= ipagosRepo.getCantCuotasTr(idTargeta);
		return ConsultacuotasTr;
		}
		*/
		
	public void Eliminar (Pagos pagos) {
		ipagosRepo.delete(pagos);
	}
	public void actualizar (Pagos pagos) {
		ipagosRepo.save(pagos);	
	}
	public List<Pagos> consultar () {	
		 List<Pagos>  pagos= ipagosRepo.findAll();
		return  pagos ;
}
}