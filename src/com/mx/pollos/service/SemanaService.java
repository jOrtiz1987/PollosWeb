package com.mx.pollos.service;

import java.util.Date;
import java.util.List;

import com.mx.pollos.model.Semana;
import com.mx.pollos.model.SemanaDia;

public interface SemanaService {

	public Boolean crearSemana(Semana semana);
	
	public Boolean editarSemana(Semana semana);
	
	public Semana obtenerSemana(Date fecha);
	
	public List<Semana> buscarSemana(Semana semana);
	
	public SemanaDia obtenerSemanaDia(Semana semana, Date fecha);
}
