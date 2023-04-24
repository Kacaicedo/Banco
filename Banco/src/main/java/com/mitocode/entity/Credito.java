package com.mitocode.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "credito")
public class Credito {

	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer idCr;
	
	@Column(name="fecha")
	private Date fechaCr;
	
	@Column(name="valor")
	private Integer valorCr;
	
	@Column(name="cuota_mes")
	private Integer cuotaCr;
	
	@Column(name="fecha_pagomes")
	private Date fechaPagoCr;
	
	@Column(name="interes_dia_mora")
	private Integer interesDiaCr;
	
	@Column(name="fecha_pagofinal")
	private Date pagoFinalCr;
	
	@Column(name="duracion" , length=50)
	private String duracionCr;
	
	@Column(name="id_tipocredito")
	private Integer idTipoCr;
	
	@Column(name="numcuota")
	private Integer numeroCuota;

	public Integer getIdCr() {
		return idCr;
	}

	public void setIdCr(Integer idCr) {
		this.idCr = idCr;
	}

	public Date getFechaCr() {
		return fechaCr;
	}

	public void setFechaCr(Date fechaCr) {
		this.fechaCr = fechaCr;
	}

	public Integer getValorCr() {
		return valorCr;
	}

	public void setValorCr(Integer valorCr) {
		this.valorCr = valorCr;
	}

	public Integer getCuotaCr() {
		return cuotaCr;
	}

	public void setCuotaCr(Integer cuotaCr) {
		this.cuotaCr = cuotaCr;
	}

	public Date getFechaPagoCr() {
		return fechaPagoCr;
	}

	public void setFechaPagoCr(Date fechaPagoCr) {
		this.fechaPagoCr = fechaPagoCr;
	}

	public Integer getInteresDiaCr() {
		return interesDiaCr;
	}

	public void setInteresDiaCr(Integer interesDiaCr) {
		this.interesDiaCr = interesDiaCr;
	}

	public Date getPagoFinalCr() {
		return pagoFinalCr;
	}

	public void setPagoFinalCr(Date pagoFinalCr) {
		this.pagoFinalCr = pagoFinalCr;
	}

	public String getDuracionCr() {
		return duracionCr;
	}

	public void setDuracionCr(String duracionCr) {
		this.duracionCr = duracionCr;
	}

	public Integer getIdTipoCr() {
		return idTipoCr;
	}

	public void setIdTipoCr(Integer idTipoCr) {
		this.idTipoCr = idTipoCr;
	}

	public Integer getNumeroCuota() {
		return numeroCuota;
	}

	public void setNumeroCuota(Integer numeroCuota) {
		this.numeroCuota = numeroCuota;
	}
	
}

