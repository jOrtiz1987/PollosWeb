package com.mx.pollos.DAO.impl;

import java.util.List;

import com.mx.pollos.DAO.GastoDAO;
import com.mx.pollos.model.Gasto;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.hibernate.HibernateException;

public class GastoDAOImpl extends HibernateDaoSupport implements GastoDAO {

	@Override
	public Gasto buscar(Integer id) {
		try {
			return (Gasto) getHibernateTemplate().get(Gasto.class, id);
		} catch (HibernateException he) {
			he.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Gasto> buscar(String consulta) {
		try {
			return getHibernateTemplate().find(consulta);
		} catch (HibernateException he) {
			he.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Gasto> buscar(Gasto gasto) {
		try {
			return getHibernateTemplate().findByExample(gasto);
		} catch (HibernateException he) {
			he.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean eliminar(Gasto gasto) {
		try {
			getHibernateTemplate().delete(gasto);
			return true;
		} catch (HibernateException he) {
			he.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean insertarModificar(Gasto gasto) {
		try {
			getHibernateTemplate().saveOrUpdate(gasto);
			return true;
		} catch (HibernateException he) {
			he.printStackTrace();
			return false;
		}
	}

}
