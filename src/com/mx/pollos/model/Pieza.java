package com.mx.pollos.model;

// Generated 08-dic-2015 22:32:59 by Hibernate Tools 3.2.4.GA

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Pieza generated by hbm2java
 */
@Entity
@Table(name = "pieza")
public class Pieza implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idPieza;
	private String descripcion;
	private Double descuento;
	private Boolean valides;
	private Set<VentaRemolquePieza> ventaremolquepiezas = new HashSet<VentaRemolquePieza>(0);

	public Pieza() {
	}

	public Pieza(String descripcion, Double descuento, Boolean valides) {
		this.descripcion = descripcion;
		this.descuento = descuento;
		this.valides = valides;
	}

	public Pieza(String descripcion, Double descuento, Boolean valides,
			Set<VentaRemolquePieza> ventaremolquepiezas) {
		this.descripcion = descripcion;
		this.descuento = descuento;
		this.valides = valides;
		this.ventaremolquepiezas = ventaremolquepiezas;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idPieza", unique = true, nullable = false)
	public Integer getIdPieza() {
		return this.idPieza;
	}

	public void setIdPieza(Integer idPieza) {
		this.idPieza = idPieza;
	}

	@Column(name = "descripcion", nullable = false, length = 45)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name = "descuento", nullable = false, precision = 22, scale = 0)
	public Double getDescuento() {
		return this.descuento;
	}

	public void setDescuento(Double descuento) {
		this.descuento = descuento;
	}

	@Column(name = "valides", nullable = false)
	public Boolean getValides() {
		return this.valides;
	}

	public void setValides(Boolean valides) {
		this.valides = valides;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pieza")
	public Set<VentaRemolquePieza> getVentaremolquepiezas() {
		return this.ventaremolquepiezas;
	}

	public void setVentaremolquepiezas(
			Set<VentaRemolquePieza> ventaremolquepiezas) {
		this.ventaremolquepiezas = ventaremolquepiezas;
	}

}
