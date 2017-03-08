package com.mx.pollos.DAO.impl;

import java.util.List;

import com.mx.pollos.DAO.GananciaDAO;
import com.mx.pollos.model.Ganancia;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.hibernate.HibernateException;

public class GananciaDAOImpl extends HibernateDaoSupport implements GananciaDAO {

	@Override
	public Ganancia buscar(Integer id) {
		try {
			return (Ganancia) getHibernateTemplate().get(Ganancia.class, id);
		} catch (HibernateException he) {
			he.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Ganancia> buscar(String consulta) {
		try {
			return getHibernateTemplate().find(consulta);
		} catch (HibernateException he) {
			he.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Ganancia> buscar(Ganancia ganancia) {
		try {
			return getHibernateTemplate().findByExample(ganancia);
		} catch (HibernateException he) {
			he.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean eliminar(Ganancia ganancia) {
		try {
			getHibernateTemplate().delete(ganancia);
			return true;
		} catch (HibernateException he) {
			he.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean insertarModificar(Ganancia ganancia) {
		try {
			getHibernateTemplate().saveOrUpdate(ganancia);
			return true;
		} catch (HibernateException he) {
			he.printStackTrace();
			return false;
		}
	}

}
