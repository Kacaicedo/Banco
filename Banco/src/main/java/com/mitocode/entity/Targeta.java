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
@Table(name = "targeta")
public class Targeta {
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	public Integer id;
	
	@Column(name="nombre",  length=50)
	public String nombre;
	
	@Column(name="cupo_aprobado")
	public Integer cupoAprobado;
	
	@Column(name="fecha_pagomensual")
	public Date fechaPago;
	
	@Column(name="interes_dia_mora")
	public Integer interesDia;
	
	@Column(name="fecha_vencimiento")
	public Date fechaVencimiento;
	
	@Column(name="id_tipotargeta")
	public Integer idTipotargeta;
	
}
