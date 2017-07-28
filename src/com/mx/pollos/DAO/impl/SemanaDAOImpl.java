package com.mx.pollos.DAO.impl;

import java.util.List;

import com.mx.pollos.DAO.SemanaDAO;
import com.mx.pollos.model.Semana;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.hibernate.HibernateException;

public class SemanaDAOImpl extends HibernateDaoSupport implements SemanaDAO {

	@Override
	public Semana buscar(Integer id) {
		try {
			return (Semana) getHibernateTemplate().get(Semana.class, id);
		} catch (HibernateException he) {
			he.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Semana> buscar(String consulta) {
		try {
			return getHibernateTemplate().find(consulta);
		} catch (HibernateException he) {
			he.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Semana> buscar(Semana semana) {
		try {
			return getHibernateTemplate().findByExample(semana);
		} catch (HibernateException he) {
			he.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean eliminar(Semana semana) {
		try {
			getHibernateTemplate().delete(semana);
			return true;
		} catch (HibernateException he) {
			he.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean insertarModificar(Semana semana) {
		try {
			getHibernateTemplate().saveOrUpdate(semana);
			return true;
		} catch (HibernateException he) {
			he.printStackTrace();
			return false;
		}
	}
}
