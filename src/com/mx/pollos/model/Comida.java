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
 * Comida generated by hbm2java
 */
@Entity
@Table(name = "comida")
public class Comida implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idComida;
	private Double pollo;
	private Double papas;
	private Set<ConsolidadoVentaRemolque> consolidadoventaremolques = new HashSet<ConsolidadoVentaRemolque>(0);

	public Comida() {
	}

	public Comida(Double pollo, Double papas) {
		this.pollo = pollo;
		this.papas = papas;
	}

	public Comida(Double pollo, Double papas,
			Set<ConsolidadoVentaRemolque> consolidadoventaremolques) {
		this.pollo = pollo;
		this.papas = papas;
		this.consolidadoventaremolques = consolidadoventaremolques;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idComida", unique = true, nullable = false)
	public Integer getIdComida() {
		return this.idComida;
	}

	public void setIdComida(Integer idComida) {
		this.idComida = idComida;
	}

	@Column(name = "pollo", nullable = false, precision = 22, scale = 0)
	public Double getPollo() {
		return this.pollo;
	}

	public void setPollo(Double pollo) {
		this.pollo = pollo;
	}

	@Column(name = "papas", nullable = false, precision = 22, scale = 0)
	public Double getPapas() {
		return this.papas;
	}

	public void setPapas(Double papas) {
		this.papas = papas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "comida")
	public Set<ConsolidadoVentaRemolque> getConsolidadoventaremolques() {
		return this.consolidadoventaremolques;
	}

	public void setConsolidadoventaremolques(
			Set<ConsolidadoVentaRemolque> consolidadoventaremolques) {
		this.consolidadoventaremolques = consolidadoventaremolques;
	}

}
