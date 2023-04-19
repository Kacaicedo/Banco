package com.mitocode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mitocode.entity.ProductoF;
import com.mitocode.service.ProductoFService;

@RequestMapping(value="/productofinancieroC/")
@RestController
public class ProductoFController {

	@Autowired
	ProductoFService productoFService;

    @PostMapping("/crearProductoFinanciero")
	public ResponseEntity<?> crearProductoFinanciero(@RequestBody ProductoF productoF) {
    	productoFService.crear(productoF);
	return ResponseEntity.status(HttpStatus.OK).body("registro creado");
	}


}
