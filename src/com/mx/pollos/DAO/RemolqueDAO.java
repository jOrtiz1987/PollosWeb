package com.mx.pollos.DAO;

import java.util.List;

import com.mx.pollos.model.Remolque;

public interface RemolqueDAO {

	public boolean insertarModificar(Remolque remolque);
	
	public boolean eliminar(Remolque remolque);
	
	public Remolque buscar(Integer id);
	
	public List<Remolque> buscar(String consulta);

	public List<Remolque> buscar(Remolque remolque);
	
}
