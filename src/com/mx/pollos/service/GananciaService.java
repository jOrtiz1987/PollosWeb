package com.mx.pollos.service;

import java.util.Date;

import com.mx.pollos.model.Ganancia;

public interface GananciaService {

	public Ganancia consultarGanancia(Date fecha);
	
	public Boolean registrarGanancia(Date fecha, Double pagoJorge, Double gasJorge, Double total, Double libre);
}
