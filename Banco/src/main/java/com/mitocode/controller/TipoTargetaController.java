package com.mitocode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mitocode.entity.TipoTargeta;

import com.mitocode.service.TipoTargetaService;

@RequestMapping(value = "/tipoTargetaC/")
@RestController
public class  TipoTargetaController {
	@Autowired
	TipoTargetaService tipoTargetaService;

	  @PostMapping("/crear")
	  protected ResponseEntity<?> crear(@RequestBody TipoTargeta tipoTargeta){
		 tipoTargetaService.crear(tipoTargeta);
			return ResponseEntity.status(HttpStatus.OK).body("registro exitoso");
		}
}
