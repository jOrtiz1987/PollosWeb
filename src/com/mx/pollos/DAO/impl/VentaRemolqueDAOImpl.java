package com.mx.pollos.DAO.impl;

import java.util.List;

import com.mx.pollos.DAO.VentaRemolqueDAO;
import com.mx.pollos.model.VentaRemolque;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.hibernate.HibernateException;

public class VentaRemolqueDAOImpl extends HibernateDaoSupport implements VentaRemolqueDAO {

	@Override
	public VentaRemolque buscar(Integer id) {
		try {
			return (VentaRemolque) getHibernateTemplate().get(VentaRemolque.class, id);
		} catch (HibernateException he) {
			he.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<VentaRemolque> buscar(String consulta) {
		try {
			return getHibernateTemplate().find(consulta);
		} catch (HibernateException he) {
			he.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<VentaRemolque> buscar(VentaRemolque ventaRemolque) {
		try {
			return getHibernateTemplate().findByExample(ventaRemolque);
		} catch (HibernateException he) {
			he.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean eliminar(VentaRemolque ventaRemolque) {
		try {
			getHibernateTemplate().delete(ventaRemolque);
			return true;
		} catch (HibernateException he) {
			he.printStackTrace();
			return false;
		}
	}

	@Override
	public VentaRemolque insertarModificar(VentaRemolque ventaRemolque) {
		try {
			getHibernateTemplate().saveOrUpdate(ventaRemolque);
			return this.buscar(ventaRemolque).get(0);
		} catch (HibernateException he) {
			he.printStackTrace();
			return null;
		}
	}
}
