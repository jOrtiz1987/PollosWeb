package com.mx.pollos.DAO;

import java.util.List;

import com.mx.pollos.model.Ganancia;

public interface GananciaDAO {

	public boolean insertarModificar(Ganancia ganancia);
	
	public boolean eliminar(Ganancia ganancia);
	
	public Ganancia buscar(Integer id);
	
	public List<Ganancia> buscar(String consulta);

	public List<Ganancia> buscar(Ganancia ganancia);
	
}
