package com.mx.pollos.DAO.impl;

import java.util.List;

import com.mx.pollos.DAO.EmpleadoActividadDAO;
import com.mx.pollos.model.EmpleadoActividad;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.hibernate.HibernateException;

public class EmpleadoActividadDAOImpl extends HibernateDaoSupport implements EmpleadoActividadDAO {

	@Override
	public EmpleadoActividad buscar(Integer id) {
		try {
			return (EmpleadoActividad) getHibernateTemplate().get(EmpleadoActividad.class, id);
		} catch (HibernateException he) {
			he.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<EmpleadoActividad> buscar(String consulta) {
		try {
			return getHibernateTemplate().find(consulta);
		} catch (HibernateException he) {
			he.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<EmpleadoActividad> buscar(EmpleadoActividad empleadoActividad) {
		try {
			return getHibernateTemplate().findByExample(empleadoActividad);
		} catch (HibernateException he) {
			he.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean eliminar(EmpleadoActividad empleadoActividad) {
		try {
			getHibernateTemplate().delete(empleadoActividad);
			return true;
		} catch (HibernateException he) {
			he.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean insertarModificar(EmpleadoActividad empleadoActividad) {
		try {
			getHibernateTemplate().saveOrUpdate(empleadoActividad);
			return true;
		} catch (HibernateException he) {
			he.printStackTrace();
			return false;
		}
	}

	@Override
	public List<EmpleadoActividad> buscarEmpleadoActividadValidos(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

}
