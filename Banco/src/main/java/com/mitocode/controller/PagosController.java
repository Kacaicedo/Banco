package com.mitocode.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mitocode.entity.Pagos;
import com.mitocode.service.PagosService;

@RequestMapping(value = "/pagosC/")
@RestController
public class PagosController {

	@Autowired
	PagosService pagosService;

	@PostMapping("/crear")

	private ResponseEntity<?> crear(@RequestBody Pagos pagos) {
		Integer cuotaMensual = pagosService.valormensual(pagos.getIdCr());
		Pagos valoresPagos = pagosService.registroPagos(pagos.getIdCr());
		int suma = valoresPagos.getValor() + pagos.getValor();
		int resta = valoresPagos.getValor() + pagos.getValor() - cuotaMensual;
		int pagoMayorValor = pagos.getValor()/ cuotaMensual;
		

		String messeger = null;
		// para actualizar una cuota
		if (valoresPagos.getValor().intValue()< cuotaMensual.intValue() && suma < cuotaMensual.intValue() || suma == cuotaMensual.intValue()) {
			valoresPagos.setValor(suma);
			pagosService.actualizar(valoresPagos);
			return ResponseEntity.status(HttpStatus.OK).body("actualizacion realizada");
		}
		// IF PARA ACTUALIZAR Y PAGAR UNA CUOTA
		if (valoresPagos.getValor().intValue() < cuotaMensual.intValue() && suma > cuotaMensual.intValue()) {
			valoresPagos.setValor(cuotaMensual);
			pagosService.actualizar(valoresPagos);

			pagos.setValor(resta);
			pagosService.crear(pagos);
			return ResponseEntity.status(HttpStatus.OK).body("pago exitoso1");
		}
		// IF PARA PAGAR VARIAS CUOTAS AL TIEMPO DEBO UTILIZAR UN BUCLE WHILE PARA QUE
		// CADA QUE LA CUOTA SEA DE 3
		// Y EL VALOR INGRESADO SEA MAYOR EL SISTEMA GENERE UN PAGO NUEVO
		
		if (valoresPagos.getValor().intValue() == cuotaMensual.intValue() && pagos.getValor().intValue() > cuotaMensual.intValue()) {
			for (int i = 1; i <= pagoMayorValor; i++) {
		      System.out.println(i);
		      pagos.setValor(cuotaMensual);
		      // puse la condicion porque el id se estaba repitiendo 
		      //esta linea significa que si el id es null genere otro pago 
		      pagos.setId(null);
			      pagosService.crear(pagos);
			 }
				
				//return ResponseEntity.status(HttpStatus.OK).body("pago nuevo");    

		}
		pagosService.crear(pagos);
		return ResponseEntity.status(HttpStatus.OK).body("pago nuevo ");
	}

	@PutMapping("/actualizar")
	protected ResponseEntity<?> actualizar(@RequestBody Pagos pagos) {
		pagosService.actualizar(pagos);
		return ResponseEntity.status(HttpStatus.OK).body("actualizacion realizada");
	}

	@GetMapping("/consultar")
	protected ResponseEntity<?> consultar() {
		List<Pagos> pagos = pagosService.consultar();
		return ResponseEntity.status(HttpStatus.OK).body(pagos);
	}
}
/*
 * }
 * 
 * messeger ="eres menor de edad"; return
 * ResponseEntity.status(HttpStatus.BAD_REQUEST).body(messeger);
 * 
 * }else { if(credito.idCr != null && Cuotam <= credito.cuotaCr || Cuotam >
 * credito.cuotaCr) { creditoService.pagarcuota(credito); return
 * ResponseEntity.status(HttpStatus.OK).body("Pago realizado");
 * 
 */
