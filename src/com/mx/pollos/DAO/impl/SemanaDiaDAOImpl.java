package com.mx.pollos.DAO.impl;

import java.util.List;

import com.mx.pollos.DAO.SemanaDiaDAO;
import com.mx.pollos.model.SemanaDia;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.hibernate.HibernateException;

public class SemanaDiaDAOImpl extends HibernateDaoSupport implements SemanaDiaDAO {

	@Override
	public SemanaDia buscar(Integer id) {
		try {
			return (SemanaDia) getHibernateTemplate().get(SemanaDia.class, id);
		} catch (HibernateException he) {
			he.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<SemanaDia> buscar(String consulta) {
		try {
			return getHibernateTemplate().find(consulta);
		} catch (HibernateException he) {
			he.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<SemanaDia> buscar(SemanaDia semanaDia) {
		try {
			return getHibernateTemplate().findByExample(semanaDia);
		} catch (HibernateException he) {
			he.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean eliminar(SemanaDia semanaDia) {
		try {
			getHibernateTemplate().delete(semanaDia);
			return true;
		} catch (HibernateException he) {
			he.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean insertarModificar(SemanaDia semanaDia) {
		try {
			getHibernateTemplate().saveOrUpdate(semanaDia);
			return true;
		} catch (HibernateException he) {
			he.printStackTrace();
			return false;
		}
	}
}
