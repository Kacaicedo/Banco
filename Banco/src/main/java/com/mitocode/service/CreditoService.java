package com.mitocode.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mitocode.entity.Credito;
import com.mitocode.repository.IcreditoRepository;
@Service
public class CreditoService {

	@Autowired
	IcreditoRepository icreditoRepo;
	
	public void crear(Credito credito) { 
		icreditoRepo.save(credito);
	}
	public Integer edades (Integer id) {
		Integer edad =icreditoRepo.getEdades(id);
		return edad;
		
	}
	public Integer Cuota (Integer id) {
		Integer CuotaMes= icreditoRepo.getCuota(id);
		return CuotaMes;
	}
	public Integer consultarId (Integer id) {	
		Integer  credito= icreditoRepo.getEdades(id);
		return credito;
	//public Integer consultaEdad (Integer id) {
		//Integer creditos = icreditoRepo.getEdadCliente(id);
		//return creditos;
	}
	//public void crear(Itegern credito) {
		// TODO Auto-generated method stub
	//public void crear(Integer credito) {
		// TODO Auto-generated method stub
		
	
		}
	
	
		// TODO Auto-generated method stub
		


