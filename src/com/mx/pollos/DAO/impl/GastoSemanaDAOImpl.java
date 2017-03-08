package com.mx.pollos.DAO.impl;

import java.util.List;

import com.mx.pollos.DAO.GastoSemanaDAO;
import com.mx.pollos.model.GastoSemana;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.hibernate.HibernateException;

public class GastoSemanaDAOImpl extends HibernateDaoSupport implements GastoSemanaDAO {

	@Override
	public GastoSemana buscar(Integer id) {
		try {
			return (GastoSemana) getHibernateTemplate().get(GastoSemana.class, id);
		} catch (HibernateException he) {
			he.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<GastoSemana> buscar(String consulta) {
		try {
			return getHibernateTemplate().find(consulta);
		} catch (HibernateException he) {
			he.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<GastoSemana> buscar(GastoSemana gastoSemana) {
		try {
			return getHibernateTemplate().findByExample(gastoSemana);
		} catch (HibernateException he) {
			he.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean eliminar(GastoSemana gastoSemana) {
		try {
			getHibernateTemplate().delete(gastoSemana);
			return true;
		} catch (HibernateException he) {
			he.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean insertarModificar(GastoSemana gastoSemana) {
		try {
			getHibernateTemplate().saveOrUpdate(gastoSemana);
			return true;
		} catch (HibernateException he) {
			he.printStackTrace();
			return false;
		}
	}

}
