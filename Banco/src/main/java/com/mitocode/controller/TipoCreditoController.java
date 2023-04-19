package com.mitocode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.mitocode.entity.TipoCredito;

import com.mitocode.service.TipoCreditoService;

@RequestMapping(value="/tipocreditoC/")
@RestController
public class TipoCreditoController {
	@Autowired
	TipoCreditoService  tipoCreditoService;
	 @PostMapping("/crearCredito")
		public ResponseEntity<?> crearCliente(@RequestBody TipoCredito tipoCredito) {
			tipoCreditoService.crear(tipoCredito);
		return ResponseEntity.status(HttpStatus.OK).body("credito exitoso");
}
}
