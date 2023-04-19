package com.mitocode.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mitocode.entity.Targeta;
import com.mitocode.service.TargetaService;

@RequestMapping(value="/targetaCon/")
@RestController
public class TargetaController  {

	@Autowired
	TargetaService targetaService;

    @PostMapping("/crear")
	public ResponseEntity<?> crear(@RequestBody Targeta targeta) {
    	targetaService.crear(targeta);
	return ResponseEntity.status(HttpStatus.OK).body("registro creado");
	}

    @DeleteMapping("/eliminar")
	public ResponseEntity<?> elimar(@RequestBody Targeta targeta) {
    	targetaService.Eliminar(targeta);
	return ResponseEntity.status(HttpStatus.OK).body("categoria eliminada exitosamente");
	}
    
    @PutMapping("/actualizar")
    public ResponseEntity<?> actualizar (@RequestBody Targeta targeta) {
    	targetaService.actualizar(targeta);
   	return ResponseEntity.status(HttpStatus.OK).body("actualizacion realizada");
    }
    
    @GetMapping("/consultar")
   	public ResponseEntity<?> consultar() {
    	List<Targeta>  targeta=targetaService.consultar();
   	return ResponseEntity.status(HttpStatus.OK).body(targeta);
    }  
    


}
