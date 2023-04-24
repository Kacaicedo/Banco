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
import com.mitocode.entity.Pagos;
import com.mitocode.service.PagosService;

@RequestMapping (value = "/pagosC/")
@RestController
public class PagosController {

	@Autowired
	PagosService pagosService;
	
	 @PostMapping("/crear")
	
	 protected ResponseEntity<?> crear(@RequestBody Pagos pagos  )  {
	
		  Integer UltimaCuotapagada = pagosService.Consultacuota(pagos.getIdTr());
		  UltimaCuotapagada = UltimaCuotapagada +=1;
		  pagos.setCuotasPendientes(UltimaCuotapagada);
		  
		  
		  /*Integer UltimaCuotapagadaTr = pagosService.ConsultacuotaTr(pagos.idTr);
		  UltimaCuotapagadaTr = UltimaCuotapagadaTr +=1;
		  pagos.cuotaPagar= UltimaCuotapagadaTr;
		  */
		  
		  Integer ValorTotalCredito = pagosService.ConsultaSaldo(pagos.getIdCr());
		   ValorTotalCredito = ValorTotalCredito - pagos.getValor();
		  pagos.setSaldo=ValorTotalCredito;
		 
		  Integer Cuotasporpagar = pagosService.CuotaPendiente(pagos.idCr);
		  Cuotasporpagar = Cuotasporpagar -=1;
		 pagos.cuotasPendientes = Cuotasporpagar ;
		
		if(pagos.cuotaPagar!=null|| !pagos.cuotaPagar.equals(null) ) {
			UltimaCuotapagada +=1 ; 
	    }
		else{
		   pagos.cuotaPagar.equals(UltimaCuotapagada); 
		}
		if(pagos.saldo.equals(null) || !pagos.saldo.equals(null) ) {
			 ValorTotalCredito-= pagos.valor;
			
	    }
		else{
			pagos.saldo.equals(ValorTotalCredito); 
		
		}
		
		if(pagos.cuotasPendientes.equals(null) || !pagos.cuotasPendientes.equals(null) ) {
			 Cuotasporpagar -=1;
			
	    }
		else{
			pagos.cuotasPendientes.equals( Cuotasporpagar); 
		
		}
		
		
		pagosService.crear(pagos);
		return ResponseEntity.status(HttpStatus.OK).body("pago exitoso ");
		}
	
		
		/*SERVICIO DE TARGETA 
		
		Integer UltimaCuotapagadaTr = pagosService.ConsultacuotaTr(pagos.idTr);
		  UltimaCuotapagadaTr = UltimaCuotapagadaTr +=1;
		  pagos.cuotaPagar= UltimaCuotapagadaTr;
		
		  
		  if(pagos.cuotasPendientesTr.equals(null) || !pagos.cuotasPendientesTr.equals(null) ) {
			  UltimaCuotapagadaTr +=1;
				
		    }
			else{
				pagos.cuotasPendientesTr.equals(UltimaCuotapagadaTr); 
			
			}*/
		  
	 
	    @DeleteMapping("/eliminar")
		protected ResponseEntity<?> elimar(@RequestBody Pagos pagos) {
	    	pagosService.Eliminar(pagos);
		return ResponseEntity.status(HttpStatus.OK).body("registro eliminado ");
		}
	    
	    @PutMapping("/actualizar")
	     protected ResponseEntity<?> actualizar (@RequestBody Pagos pagos) {
	    	pagosService.actualizar(pagos);
	   	return ResponseEntity.status(HttpStatus.OK).body("actualizacion realizada");
	    }
	    
	    @GetMapping("/consultar")
	    protected  ResponseEntity<?> consultar() {
	    	List<Pagos>  pagos=pagosService.consultar();
	   	return ResponseEntity.status(HttpStatus.OK).body(pagos);
	    }  
	}

