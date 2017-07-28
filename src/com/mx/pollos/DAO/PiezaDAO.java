package com.mx.pollos.DAO;

import java.util.List;

import com.mx.pollos.model.Pieza;

public interface PiezaDAO {

	public boolean insertarModificar(Pieza pieza);
	
	public boolean eliminar(Pieza pieza);
	
	public Pieza buscar(Integer id);

	public List<Pieza> buscarPiezasValidas(String nombre);
	
	public List<Pieza> buscar(String consulta);

	public List<Pieza> buscar(Pieza pieza);
	
}
