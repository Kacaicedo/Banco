package com.mitocode.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitocode.entity.ClienteProducto;
import com.mitocode.repository.IclienteProductoRepository;
@Service 
public class ClienteProductoService {
	@Autowired
	IclienteProductoRepository iclienteProductoRepo;
		
	public void crear (ClienteProducto clienteProducto) {
		iclienteProductoRepo.save(clienteProducto);
}
}
