package com.mx.pollos.model;

// Generated 08-dic-2015 22:32:59 by Hibernate Tools 3.2.4.GA

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Serviciocompra generated by hbm2java
 */
@Entity
@Table(name = "serviciocompra")
public class ServicioCompra implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idServicioCompra;
	private Servicio servicio;
	private SemanaDia semanadia;
	private Double importe;

	public ServicioCompra() {
	}

	public ServicioCompra(Servicio servicio, SemanaDia semanadia, Double importe) {
		this.servicio = servicio;
		this.semanadia = semanadia;
		this.importe = importe;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idServicioCompra", unique = true, nullable = false)
	public Integer getIdServicioCompra() {
		return this.idServicioCompra;
	}

	public void setIdServicioCompra(Integer idServicioCompra) {
		this.idServicioCompra = idServicioCompra;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "servicio", nullable = false)
	public Servicio getServicio() {
		return this.servicio;
	}

	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "semanaDia", nullable = false)
	public SemanaDia getSemanadia() {
		return this.semanadia;
	}

	public void setSemanadia(SemanaDia semanadia) {
		this.semanadia = semanadia;
	}

	@Column(name = "importe", nullable = false, precision = 22, scale = 0)
	public Double getImporte() {
		return this.importe;
	}

	public void setImporte(Double importe) {
		this.importe = importe;
	}

}
