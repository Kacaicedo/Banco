package com.mitocode.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitocode.entity.Cliente;
import com.mitocode.repository.IclienteRepository;

@Service 

public class ClienteService {

	@Autowired
	IclienteRepository iclienteRepo;
		
	public void crear (Cliente cliente) {
		iclienteRepo.save(cliente);
	}
	public void Eliminar (Cliente cliente) {
		iclienteRepo.delete(cliente);
	}
	public void actualizar (Cliente cliente) {
		iclienteRepo.save(cliente);	
	}
	public List<Cliente> consultar () {	
		 List<Cliente> cliente= iclienteRepo.findAll();
		return cliente;	
	}
	
}
