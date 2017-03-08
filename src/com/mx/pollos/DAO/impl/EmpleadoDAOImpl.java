package com.mx.pollos.DAO.impl;

import java.util.List;

import com.mx.pollos.DAO.EmpleadoDAO;
import com.mx.pollos.model.Empleado;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.hibernate.HibernateException;

public class EmpleadoDAOImpl extends HibernateDaoSupport implements EmpleadoDAO {

	@Override
	public Empleado buscar(Integer id) {
		try {
			return (Empleado) getHibernateTemplate().get(Empleado.class, id);
		} catch (HibernateException he) {
			he.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Empleado> buscar(String consulta) {
		try {
			return getHibernateTemplate().find(consulta);
		} catch (HibernateException he) {
			he.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Empleado> buscar(Empleado empleado) {
		try {
			return getHibernateTemplate().findByExample(empleado);
		} catch (HibernateException he) {
			he.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean eliminar(Empleado empleado) {
		try {
			getHibernateTemplate().delete(empleado);
			return true;
		} catch (HibernateException he) {
			he.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean insertarModificar(Empleado empleado) {
		try {
			getHibernateTemplate().saveOrUpdate(empleado);
			return true;
		} catch (HibernateException he) {
			he.printStackTrace();
			return false;
		}
	}

}
