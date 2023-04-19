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

@Getter
@Setter
@Table(name = "credito")
public class Credito {

	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	public Integer idCr;
	
	@Column(name="fecha")
	public Date fechaCr;
	
	@Column(name="valor")
	public Integer valorCr;
	
	@Column(name="cuota_mes")
	public Integer cuotaCr;
	
	@Column(name="fecha_pagomes")
	public Date fechaPagoCr;
	
	@Column(name="interes_dia_mora")
	public Integer interesDiaCr;
	
	@Column(name="fecha_pagofinal")
	public Date pagoFinalCr;
	
	@Column(name="duracion" , length=50)
	public String duracionCr;
	
	@Column(name="id_tipocredito")
	public Integer idTipoCr;
}

