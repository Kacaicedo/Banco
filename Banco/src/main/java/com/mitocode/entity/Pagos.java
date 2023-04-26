package com.mitocode.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity

@Data
@Table(name = "pagos")
public class Pagos {

	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name="cuotapagar")
	private  Integer cuotaPagar;
	
	@Column(name="fecha")
	private  Date fecha;
	
	@Column(name="valorpago")
	private  Integer valor;
	
	@Column(name="saldo")
	private Integer saldo;
	
	@Column(name="cuotaspendientes")
	private  Integer cuotasPendientes;
	
	@Column(name="id_credito")
	private  Integer idCr;
	
	@Column(name="id_targeta")
	private  Integer idTr;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCuotaPagar() {
		return cuotaPagar;
	}

	public Integer setCuotaPagar(Integer cuotaPagar) {
		return this.cuotaPagar = cuotaPagar;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

	public Integer getSaldo() {
		return saldo;
	}

	public void setSaldo(Integer saldo) {
		this.saldo = saldo;
	}

	public Integer getCuotasPendientes() {
		return cuotasPendientes;
	}

	public void setCuotasPendientes(Integer cuotasPendientes) {
		this.cuotasPendientes = cuotasPendientes;
	}

	public Integer getIdCr() {
		return idCr;
	}

	public void setIdCr(Integer idCr) {
		this.idCr = idCr;
	}

	public Integer getIdTr() {
		return idTr;
	}

	public void setIdTr(Integer idTr) {
		this.idTr = idTr;
	}


	
	
}
