package com.mitocode.entity;

import java.math.BigInteger;
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
@Table(name = "cuenta")
public class Cuenta {
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	public Integer id;
	
	@Column(name="fecha_apertura")
	public Date fechaApertura;
	
	@Column(name="saldo")
	public Integer saldo;
	
	@Column(name="numero_cuenta")
	public BigInteger numeroCuenta;
	
	@Column(name="id_tipocuenta")
	public Integer idTipoCuenta;
	
	
}
