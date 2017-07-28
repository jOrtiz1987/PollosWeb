package com.mx.pollos.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.mx.pollos.DAO.DiaDAO;
import com.mx.pollos.DAO.SemanaDAO;
import com.mx.pollos.DAO.SemanaDiaDAO;
import com.mx.pollos.model.Semana;
import com.mx.pollos.model.SemanaDia;

public class SemanaServiceImpl implements com.mx.pollos.service.SemanaService {

	private SemanaDAO semanaDAO;
	private SemanaDiaDAO semanaDiaDAO;
	private DiaDAO diaDAO;
	
	@Override
	public Boolean crearSemana(Semana semana) {
		return semanaDAO.insertarModificar(semana);
	}

	@Override
	public Boolean editarSemana(Semana semana) {
		return semanaDAO.insertarModificar(semana);
	}

	@Override
	public Semana obtenerSemana(Date fecha) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		return semanaDAO.buscar("From Semana Where fechaInicio <= '" + formatter.format(fecha) + "' and fechaFin >= '" + formatter.format(fecha) + "' ").get(0);
	}

	@Override
	public SemanaDia obtenerSemanaDia(Semana semana, Date fecha) {
		int day = fecha.getDay();
		SemanaDia semanaDia = semanaDiaDAO.buscar("From SemanaDia Where semana = " + semana.getIdSemana() + " and dia = " + day ).get(0);
		return semanaDia;
	}

	public void setSemanaDAO(SemanaDAO semanaDAO) {
		this.semanaDAO = semanaDAO;
	}

	public void setSemanaDiaDAO(SemanaDiaDAO semanaDiaDAO) {
		this.semanaDiaDAO = semanaDiaDAO;
	}

	public void setDiaDAO(DiaDAO diaDAO) {
		this.diaDAO = diaDAO;
	}

	@Override
	public List<Semana> buscarSemana(Semana semana) {
		return semanaDAO.buscar(semana);
	}

	@Override
	public Semana buscarId(Integer id) {
		return semanaDAO.buscar(id);
	}
	
}
