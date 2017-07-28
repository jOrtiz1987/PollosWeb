package com.mx.pollos.service.impl;

import java.util.Date;

import com.mx.pollos.DAO.GananciaDAO;
import com.mx.pollos.model.Ganancia;
import com.mx.pollos.model.Semana;
import com.mx.pollos.service.GananciaService;
import com.mx.pollos.service.SemanaService;

public class GananciaServiceImpl implements GananciaService {

	private SemanaService semanaService;
	private GananciaDAO gananciaDAO;
	
	@Override
	public Ganancia consultarGanancia(Date fecha) {
		Semana semana = semanaService.obtenerSemana(fecha);
		Ganancia ganancia = new Ganancia();
		ganancia.setSemana(semana);
		return gananciaDAO.buscar(ganancia).get(0);
	}

	@Override
	public Boolean registrarGanancia(Date fecha, Double pagoJorge,
			Double gasJorge, Double total, Double libre) {
		Ganancia ganancia = new Ganancia();
		ganancia.setGasolinaJorge(gasJorge);
		ganancia.setPagoJorge(pagoJorge);
		ganancia.setImporteLibre(libre);
		ganancia.setImporteTotal(total);
		Semana semana = semanaService.obtenerSemana(fecha);
		ganancia.setSemana(semana);
		return gananciaDAO.insertarModificar(ganancia);
	}

	public void setSemanaService(SemanaService semanaService) {
		this.semanaService = semanaService;
	}

	public void setGananciaDAO(GananciaDAO gananciaDAO) {
		this.gananciaDAO = gananciaDAO;
	}
	
}
