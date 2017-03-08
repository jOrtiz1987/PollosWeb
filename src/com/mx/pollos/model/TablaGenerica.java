package com.mx.pollos.model;

public class TablaGenerica {

	public String nombre;
	public Double importe;
	
	public TablaGenerica(String nombre, Double importe){
		this.nombre = nombre;
		this.importe = importe;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getImporte() {
		return importe;
	}
	public void setImporte(Double importe) {
		this.importe = importe;
	}
	
	
	
}
