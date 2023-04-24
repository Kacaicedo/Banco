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
import com.mitocode.entity.Asesor;
import com.mitocode.service.AsesorService;

@RequestMapping(value="/asesorC/")
@RestController
public class AsesorController {

	@Autowired
	AsesorService asesorService;

    @PostMapping("/crearAsesor")
	private ResponseEntity<?> crearAsesor(@RequestBody Asesor asesor) {
		asesorService.crear(asesor);
	return ResponseEntity.status(HttpStatus.OK).body("registro creado");
	}
    @DeleteMapping("/eliminar")
	private ResponseEntity<?> elimar(@RequestBody Asesor asesor) {
    	asesorService.Eliminar(asesor);
	return ResponseEntity.status(HttpStatus.OK).body("registro eliminado ");
	}
    
    @PutMapping("/actualizar")
     private ResponseEntity<?> actualizar (@RequestBody Asesor asesor) {
    	asesorService.actualizar(asesor);
   	return ResponseEntity.status(HttpStatus.OK).body("actualizacion realizada");
    }
    
    @GetMapping("/consultar")
   private  ResponseEntity<?> consultar() {
    	List<Asesor>  asesor=asesorService.consultar();
   	return ResponseEntity.status(HttpStatus.OK).body(asesor);
    }  
}