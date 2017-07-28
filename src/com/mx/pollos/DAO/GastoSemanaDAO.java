package com.mx.pollos.DAO;

import java.util.List;

import com.mx.pollos.model.GastoSemana;

public interface GastoSemanaDAO {

	public boolean insertarModificar(GastoSemana gastoSemana);
	
	public boolean eliminar(GastoSemana gastoSemana);
	
	public GastoSemana buscar(Integer id);
	
	public List<GastoSemana> buscar(String consulta);

	public List<GastoSemana> buscar(GastoSemana gastoSemana);
	
}
