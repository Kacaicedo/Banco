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

import com.mitocode.entity.Cliente;
import com.mitocode.service.ClienteService;

@RequestMapping(value="/clienteC/")
@RestController
public class ClienteController {

	@Autowired
	ClienteService clienteService;

    @PostMapping("/crearCliente")
	public ResponseEntity<?> crearCliente(@RequestBody Cliente cliente) {
		clienteService.crear(cliente);
	return ResponseEntity.status(HttpStatus.OK).body("cliente creado");
	}
    @DeleteMapping("/eliminar")
	private ResponseEntity<?> elimar(@RequestBody Cliente cliente) {
    	clienteService.Eliminar(cliente);
	return ResponseEntity.status(HttpStatus.OK).body("cliente eliminado ");
	}
    
    @PutMapping("/actualizar")
     private ResponseEntity<?> actualizar (@RequestBody Cliente cliente) {
    	clienteService.actualizar(cliente);
   	return ResponseEntity.status(HttpStatus.OK).body("actualizacion realizada");
    }
    
    @GetMapping("/consultar")
   private  ResponseEntity<?> consultar() {
    	List<Cliente>  cliente=clienteService.consultar();
   	return ResponseEntity.status(HttpStatus.OK).body(cliente);
    }  
    

}
