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
@Table(name = "asesor")
public class Asesor {
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	public Integer id;

	@Column(name="cedula")
	public BigInteger cedula ;
	
	@Column(name="nombre",  length=50)
	public String nombre;
	
	@Column(name="ciudad", length=50)
	public String ciudad;
	
	@Column(name="direccion", length=50)
	public String direccion;
	
	@Column (name="contacto")
	public BigInteger contacto;
	
	@Column(name="correo", length=50)
	public String correo;
}
