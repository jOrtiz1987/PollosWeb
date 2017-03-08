package com.mx.pollos.DAO;

import java.util.List;

import com.mx.pollos.model.Gasto;

public interface GastoDAO {

	public boolean insertarModificar(Gasto gasto);
	
	public boolean eliminar(Gasto gasto);
	
	public Gasto buscar(Integer id);
	
	public List<Gasto> buscar(String consulta);

	public List<Gasto> buscar(Gasto gasto);
	
}
