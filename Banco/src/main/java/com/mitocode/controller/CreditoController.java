package com.mitocode.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.mitocode.entity.Credito;
import com.mitocode.service.CreditoService;



@RequestMapping(value = "/creditoC/")
@RestController
public class CreditoController {
	@Autowired
	CreditoService creditoService;
	
	 
	//STO ESTA BIEN ASI FUNCIONA 
	@PostMapping("/crearCredito")
	 protected ResponseEntity<?> crearCredito(@RequestParam  (name="id", required= true)Integer id,@RequestBody Credito credito  ){
	  Integer consultaEdad= creditoService.consultarId (id);	  
	  String messeger = null;
	  
	  if(consultaEdad < 18) {
		  messeger ="eres menor de edad";
		  return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(messeger);
	  }		
	
	  creditoService.crear(credito);
		return ResponseEntity.status(HttpStatus.OK).body("Credito creado");
	}
	}
	

	  
			

