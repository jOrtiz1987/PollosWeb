package com.mx.pollos.DAO.impl;

import java.util.List;

import com.mx.pollos.DAO.ServicioCompraDAO;
import com.mx.pollos.model.ServicioCompra;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.hibernate.HibernateException;

public class ServicioCompraDAOImpl extends HibernateDaoSupport implements ServicioCompraDAO {

	@Override
	public ServicioCompra buscar(Integer id) {
		try {
			return (ServicioCompra) getHibernateTemplate().get(ServicioCompra.class, id);
		} catch (HibernateException he) {
			he.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ServicioCompra> buscar(String consulta) {
		try {
			return getHibernateTemplate().find(consulta);
		} catch (HibernateException he) {
			he.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ServicioCompra> buscar(ServicioCompra servicioCompra) {
		try {
			return getHibernateTemplate().findByExample(servicioCompra);
		} catch (HibernateException he) {
			he.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean eliminar(ServicioCompra servicioCompra) {
		try {
			getHibernateTemplate().delete(servicioCompra);
			return true;
		} catch (HibernateException he) {
			he.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean insertarModificar(ServicioCompra servicioCompra) {
		try {
			getHibernateTemplate().saveOrUpdate(servicioCompra);
			return true;
		} catch (HibernateException he) {
			he.printStackTrace();
			return false;
		}
	}
}
