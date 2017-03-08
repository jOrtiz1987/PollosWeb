package com.mx.pollos.DAO;

import java.util.List;

import com.mx.pollos.model.Dia;

public interface DiaDAO {

	public boolean insertarModificar(Dia dia);
	
	public boolean eliminar(Dia dia);
	
	public Dia buscar(Integer id);
	
	public List<Dia> buscar(String consulta);

	public List<Dia> buscar(Dia dia);
	
}
