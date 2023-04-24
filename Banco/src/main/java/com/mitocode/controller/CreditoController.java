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
	 //con este consul edad realizo el IF si pongo el programa en DBUG ME VA A PARECER LA EDAD QUE TIENE EL CLIENTE A LA CUAL ACCEDI
	  //DESDE EL REPOSITORY Y LUEGO EN EL SERVICE 
	  Integer consultaEdad= creditoService.consultarId(id);
	  Integer Cuotam = creditoService.Cuota(id);
	  String messeger = null;
	  
	  if(consultaEdad < 18) {
		  messeger ="eres menor de edad";
		  return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(messeger);
				
	  }else {
		  if(credito.idCr != null && Cuotam <= credito.cuotaCr || Cuotam > credito.cuotaCr) {
			  creditoService.pagarcuota(credito);
			  return ResponseEntity.status(HttpStatus.OK).body("Pago realizado");
	}
	}
	  creditoService.crear(credito);
		return ResponseEntity.status(HttpStatus.OK).body("Credito creado");
}
}
	
	
//	  @PostMapping("/crearCredito")
//		 protected ResponseEntity<?> crearCredito(@RequestParam  (name="id", required= true)Integer id,@RequestBody Credito credito  ){
//		 //con este consul edad realizo el IF si pongo el programa en DBUG ME VA A PARECER LA EDAD QUE TIENE EL CLIENTE A LA CUAL ACCEDI
//		  //DESDE EL REPOSITORY Y LUEGO EN EL SERVICE 
//		  Integer consultaEdad= creditoService.consultarId(id);
//		  String messeger = null;
//		  
//		if(consultaEdad < 18 &&credito.cuotaCr== 15000&& credito.idCr!= null) {
//		messeger =  "eres menor de edad no se puede realizar operacio";
//		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(messeger);
//				}
//		creditoService.crear(credito);
//		return ResponseEntity.status(HttpStatus.OK).body("operación exitosa");
	  

	// @PostMapping("/crearCredito")
		 /* protected ResponseEntity<?> crearCredito(@RequestBody Credito credito, Cliente cliente){
			  Integer creditos= creditoService.consultaEdad(cliente.edadC);
				String messeger = null;
				if(cliente.edadC <18) {
					messeger =  "eres menor de edad";
							return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(messeger);
				}
				 creditoService.crear(credito);
				return ResponseEntity.status(HttpStatus.OK).body("credito exitoso");
			*/
			/*protected ResponseEntity<?> crearCredito(@RequestBody Cliente cliente){
			  Integer credito= creditoService.consultaEdad(cliente.edadC);
				String messeger = null;
				if(cliente.edadC <18) {
					messeger =  "eres menor de edad";
							return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(messeger);
							}
			  creditoService.crear(credito);
				return ResponseEntity.status(HttpStatus.OK).body("credito exitoso");
				
				*/
//				protected ResponseEntity<?> crearCredito(@RequestBody Credito credito, ClienteProducto clienteProducto, Cliente cliente ){
//					  Integer edadCliente= creditoService.consultaEdad(cliente.edadC);
//					  cliente.edadC = clienteProducto.idCliente;
//						String messeger = null;
//						if(clienteProducto.idCliente <18) {
//							messeger =  "eres menor de edad";
//									return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(messeger);
//						}
//					  creditoService.crear(credito);
//						return ResponseEntity.status(HttpStatus.OK).body("credito exitoso");
		



	  
			

