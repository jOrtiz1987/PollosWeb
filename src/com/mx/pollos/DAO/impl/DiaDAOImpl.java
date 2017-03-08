package com.mx.pollos.DAO.impl;

import java.util.List;

import com.mx.pollos.DAO.DiaDAO;
import com.mx.pollos.model.Dia;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.hibernate.HibernateException;

public class DiaDAOImpl extends HibernateDaoSupport implements DiaDAO {

	@Override
	public Dia buscar(Integer id) {
		try {
			return (Dia) getHibernateTemplate().get(Dia.class, id);
		} catch (HibernateException he) {
			he.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Dia> buscar(String consulta) {
		try {
			return getHibernateTemplate().find(consulta);
		} catch (HibernateException he) {
			he.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Dia> buscar(Dia dia) {
		try {
			return getHibernateTemplate().findByExample(dia);
		} catch (HibernateException he) {
			he.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean eliminar(Dia dia) {
		try {
			getHibernateTemplate().delete(dia);
			return true;
		} catch (HibernateException he) {
			he.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean insertarModificar(Dia dia) {
		try {
			getHibernateTemplate().saveOrUpdate(dia);
			return true;
		} catch (HibernateException he) {
			he.printStackTrace();
			return false;
		}
	}

}
