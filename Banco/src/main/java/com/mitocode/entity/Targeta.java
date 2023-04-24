package com.mitocode.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity

@Table(name = "targeta")
public class Targeta {
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name="nombre",  length=50)
	private String nombre;
	
	@Column(name="cupo_aprobado")
	private Integer cupoAprobado;
	
	@Column(name="fecha_pagomensual")
	private Date fechaPago;
	
	@Column(name="interes_dia_mora")
	private Integer interesDia;
	
	@Column(name="fecha_vencimiento")
	private Date fechaVencimiento;
	
	@Column(name="id_tipotargeta")
	private Integer idTipotargeta;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCupoAprobado() {
		return cupoAprobado;
	}

	public void setCupoAprobado(Integer cupoAprobado) {
		this.cupoAprobado = cupoAprobado;
	}

	public Date getFechaPago() {
		return fechaPago;
	}

	public void setFechaPago(Date fechaPago) {
		this.fechaPago = fechaPago;
	}

	public Integer getInteresDia() {
		return interesDia;
	}

	public void setInteresDia(Integer interesDia) {
		this.interesDia = interesDia;
	}

	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public Integer getIdTipotargeta() {
		return idTipotargeta;
	}

	public void setIdTipotargeta(Integer idTipotargeta) {
		this.idTipotargeta = idTipotargeta;
	}
	
	
	
}
