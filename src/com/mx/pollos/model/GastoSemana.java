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
 * Gastosemana generated by hbm2java
 */
@Entity
@Table(name = "gastosemana")
public class GastoSemana implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idGastoSemana;
	private Gasto gasto;
	private VentaRemolque ventaremolque;
	private SemanaDia semanadia;
	private Double importe;

	public GastoSemana() {
	}

	public GastoSemana(Gasto gasto, VentaRemolque ventaremolque,
			SemanaDia semanadia, Double importe) {
		this.gasto = gasto;
		this.ventaremolque = ventaremolque;
		this.semanadia = semanadia;
		this.importe = importe;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idGastoSemana", unique = true, nullable = false)
	public Integer getIdGastoSemana() {
		return this.idGastoSemana;
	}

	public void setIdGastoSemana(Integer idGastoSemana) {
		this.idGastoSemana = idGastoSemana;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "gasto", nullable = false)
	public Gasto getGasto() {
		return this.gasto;
	}

	public void setGasto(Gasto gasto) {
		this.gasto = gasto;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ventaRemolque", nullable = false)
	public VentaRemolque getVentaremolque() {
		return this.ventaremolque;
	}

	public void setVentaremolque(VentaRemolque ventaremolque) {
		this.ventaremolque = ventaremolque;
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
