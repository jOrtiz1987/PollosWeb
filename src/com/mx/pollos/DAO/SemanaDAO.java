package com.mx.pollos.DAO;

import java.util.List;

import com.mx.pollos.model.Semana;

public interface SemanaDAO {

	public boolean insertarModificar(Semana semana);
	
	public boolean eliminar(Semana semana);
	
	public Semana buscar(Integer id);
	
	public List<Semana> buscar(String consulta);

	public List<Semana> buscar(Semana semana);
	
}
