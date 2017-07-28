package com.mx.pollos.DAO;

import java.util.List;

import com.mx.pollos.model.Comida;

public interface ComidaDAO {

	public boolean insertarModificar(Comida comida);
	
	public boolean eliminar(Comida comida);
	
	public Comida buscar(Integer id);
	
	public List<Comida> buscar(String consulta);

	public List<Comida> buscar(Comida comida);
	
}
