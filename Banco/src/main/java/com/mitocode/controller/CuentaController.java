package com.mitocode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mitocode.entity.Cuenta;
import com.mitocode.service.CuentaService;
@RequestMapping(value = "/cuentaC/")
@RestController
public class CuentaController {
	@Autowired
	CuentaService cuentaService;

	  @PostMapping("/crear")
	  protected ResponseEntity<?> crearCredito(@RequestBody Cuenta cuenta){
		 cuentaService.crear(cuenta);
			return ResponseEntity.status(HttpStatus.OK).body("registro exitoso");
		}
	  
}
