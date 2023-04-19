package com.mitocode.entity;

import java.math.BigInteger;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity

@Getter
@Setter
@Table(name = "cliente")
public class Cliente {
	
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	public Integer idC;
	
	@Column(name="edad")
	public Integer edadC;
	
	@Column(name="cedula")
	public BigInteger cedulaC ;
	
	@Column(name="nombre",  length=50)
	public String nombreC;
	
	@Column(name="ciudad", length=50)
	public String ciudadC;
	
	@Column(name="direccion", length=50)
	public String direccionC;
	
	@Column (name="contacto")
	public BigInteger contactoC;
	
	@Column(name="correo", length=50)
	public String correoC;
}