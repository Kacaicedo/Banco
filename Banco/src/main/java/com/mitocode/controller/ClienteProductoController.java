package com.mitocode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mitocode.entity.ClienteProducto;
import com.mitocode.service.ClienteProductoService;

@RequestMapping(value="/clienteproductoC/")
@RestController
public class ClienteProductoController {

	@Autowired
	ClienteProductoService clienteProductoService;

    @PostMapping("/crear")
	public ResponseEntity<?> crear(@RequestBody ClienteProducto clienteProducto) {
    	clienteProductoService.crear(clienteProducto);
	return ResponseEntity.status(HttpStatus.OK).body("registro creado");
	}



}
