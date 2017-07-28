package com.mx.pollos.DAO.impl;

import java.util.List;

import com.mx.pollos.DAO.CompraProductoDAO;
import com.mx.pollos.model.CompraProducto;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.hibernate.HibernateException;

public class CompraProductoDAOImpl extends HibernateDaoSupport implements CompraProductoDAO {

	@Override
	public CompraProducto buscar(Integer id) {
		try {
			return (CompraProducto) getHibernateTemplate().get(CompraProducto.class, id);
		} catch (HibernateException he) {
			he.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CompraProducto> buscar(String consulta) {
		try {
			return getHibernateTemplate().find(consulta);
		} catch (HibernateException he) {
			he.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CompraProducto> buscar(CompraProducto compraProducto) {
		try {
			return getHibernateTemplate().findByExample(compraProducto);
		} catch (HibernateException he) {
			he.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean eliminar(CompraProducto compraProducto) {
		try {
			getHibernateTemplate().delete(compraProducto);
			return true;
		} catch (HibernateException he) {
			he.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean insertarModificar(CompraProducto compraProducto) {
		try {
			getHibernateTemplate().saveOrUpdate(compraProducto);
			return true;
		} catch (HibernateException he) {
			he.printStackTrace();
			return false;
		}
	}

}
