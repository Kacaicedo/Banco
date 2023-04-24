package com.mitocode.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name = "producto_financiero")
	public class ProductoF {	
		@Id	
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="id")
		private Integer id;
		
		@Column(name="fecha")
		private Date fecha;
		
		@Column(name="id_asesor")
		private Integer idAsesor;
		
		@Column(name="estado", length = 40)
		private String estado;
		
		@Column(name="id_cuenta")
		private Integer idCuenta;
		
		@Column(name="id_targeta")
		private Integer idTargeta;
		
		@Column(name="id_credito")
		private Integer idCredito;

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public Date getFecha() {
			return fecha;
		}

		public void setFecha(Date fecha) {
			this.fecha = fecha;
		}

		public Integer getIdAsesor() {
			return idAsesor;
		}

		public void setIdAsesor(Integer idAsesor) {
			this.idAsesor = idAsesor;
		}

		public String getEstado() {
			return estado;
		}

		public void setEstado(String estado) {
			this.estado = estado;
		}

		public Integer getIdCuenta() {
			return idCuenta;
		}

		public void setIdCuenta(Integer idCuenta) {
			this.idCuenta = idCuenta;
		}

		public Integer getIdTargeta() {
			return idTargeta;
		}

		public void setIdTargeta(Integer idTargeta) {
			this.idTargeta = idTargeta;
		}

		public Integer getIdCredito() {
			return idCredito;
		}

		public void setIdCredito(Integer idCredito) {
			this.idCredito = idCredito;
		}
			
		
		
		
	}


