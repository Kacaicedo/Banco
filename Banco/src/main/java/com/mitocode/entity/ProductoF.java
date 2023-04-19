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
@Table(name = "producto_financiero")
	public class ProductoF {	
		@Id	
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="id")
		public Integer id;
		
		@Column(name="fecha")
		public Date fecha;
		
		@Column(name="id_asesor")
		public Integer idAsesor;
		
		@Column(name="estado", length = 40)
		public String estado;
		
		@Column(name="id_cuenta")
		public Integer idCuenta;
		
		@Column(name="id_targeta")
		public Integer idTargeta;
		
		@Column(name="id_credito")
		public Integer idCredito;
			
	}


