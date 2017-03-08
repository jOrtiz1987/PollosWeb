package com.mx.pollos.DAO;

import java.util.List;

import com.mx.pollos.model.ServicioCompra;

public interface ServicioCompraDAO {

	public boolean insertarModificar(ServicioCompra servicioCompra);
	
	public boolean eliminar(ServicioCompra servicioCompra);
	
	public ServicioCompra buscar(Integer id);
	
	public List<ServicioCompra> buscar(String consulta);

	public List<ServicioCompra> buscar(ServicioCompra servicioCompra);
	
}
