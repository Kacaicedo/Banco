package com.mitocode.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity

@Getter
@Setter
@Table(name = "cliente_productof")
public class ClienteProducto {

	@Id	
	 
	 @Column(name="id_cliente")
	public Integer idCliente;
	
	
	@Column(name="id_productof")
	public Integer idProductoF;
}
