package com.mitocode.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity


@Table(name = "cliente_productof")
public class ClienteProducto {

	@Id	
	 
	 @Column(name="id_cliente")
	private Integer idCliente;
	
	
	@Column(name="id_productof")
	private Integer idProductoF;


	public Integer getIdCliente() {
		return idCliente;
	}


	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}


	public Integer getIdProductoF() {
		return idProductoF;
	}


	public void setIdProductoF(Integer idProductoF) {
		this.idProductoF = idProductoF;
	}
	
	
}
