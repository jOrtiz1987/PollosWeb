package com.mx.pollos.DAO;

import java.util.List;

import com.mx.pollos.model.SemanaDia;

public interface SemanaDiaDAO {

	public boolean insertarModificar(SemanaDia semanaDia);
	
	public boolean eliminar(SemanaDia semanaDia);
	
	public SemanaDia buscar(Integer id);
	
	public List<SemanaDia> buscar(String consulta);

	public List<SemanaDia> buscar(SemanaDia semanaDia);
	
}
