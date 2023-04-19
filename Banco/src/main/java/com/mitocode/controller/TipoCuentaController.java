package com.mitocode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mitocode.entity.TipoCuenta;
import com.mitocode.service.TipoCuentaService;

@RequestMapping(value = "/tipocuentaC/")
@RestController
public class  TipoCuentaController {
	@Autowired
	TipoCuentaService tipoCuentaService;

	  @PostMapping("/crear")
	  protected ResponseEntity<?> crear(@RequestBody TipoCuenta tipoCuenta){
		 tipoCuentaService.crear(tipoCuenta);
			return ResponseEntity.status(HttpStatus.OK).body("registro exitoso");
		}
	  @DeleteMapping("/eliminar")
	  protected ResponseEntity<?> eliminar(@RequestBody TipoCuenta tipoCuenta){
			 tipoCuentaService.Eliminar(tipoCuenta);
		return ResponseEntity.status(HttpStatus.OK).body("registro eliminado");
		}
}




