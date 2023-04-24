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

@Table(name = "cliente")
public class Cliente {
	
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer idC;
	
	@Column(name="edad")
	private Integer edadC;
	
	@Column(name="cedula")
	private BigInteger cedulaC ;
	
	@Column(name="nombre",  length=50)
	private String nombreC;
	
	@Column(name="ciudad", length=50)
	private String ciudadC;
	
	@Column(name="direccion", length=50)
	private String direccionC;
	
	@Column (name="contacto")
	private BigInteger contactoC;
	
	@Column(name="correo", length=50)
	private String correoC;

	public Integer getIdC() {
		return idC;
	}

	public void setIdC(Integer idC) {
		this.idC = idC;
	}

	public Integer getEdadC() {
		return edadC;
	}

	public void setEdadC(Integer edadC) {
		this.edadC = edadC;
	}

	public BigInteger getCedulaC() {
		return cedulaC;
	}

	public void setCedulaC(BigInteger cedulaC) {
		this.cedulaC = cedulaC;
	}

	public String getNombreC() {
		return nombreC;
	}

	public void setNombreC(String nombreC) {
		this.nombreC = nombreC;
	}

	public String getCiudadC() {
		return ciudadC;
	}

	public void setCiudadC(String ciudadC) {
		this.ciudadC = ciudadC;
	}

	public String getDireccionC() {
		return direccionC;
	}

	public void setDireccionC(String direccionC) {
		this.direccionC = direccionC;
	}

	public BigInteger getContactoC() {
		return contactoC;
	}

	public void setContactoC(BigInteger contactoC) {
		this.contactoC = contactoC;
	}

	public String getCorreoC() {
		return correoC;
	}

	public void setCorreoC(String correoC) {
		this.correoC = correoC;
	}
	
	
	
}