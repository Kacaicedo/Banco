package com.mitocode.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mitocode.entity.ProductoF;
import com.mitocode.repository.IproductoFRepository;

@Service 
public class ProductoFService {
	@Autowired
	IproductoFRepository iproductoFRepo;
		
	public void crear (ProductoF productoF) {
		iproductoFRepo.save(productoF);
}
}
