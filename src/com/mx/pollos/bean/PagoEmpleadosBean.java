package com.mx.pollos.bean;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

import com.mx.pollos.model.Actividad;
import com.mx.pollos.model.Empleado;
import com.mx.pollos.model.EmpleadoActividad;
//import com.mx.pollos.model.PagoEmpleados;
import com.mx.pollos.model.Semana;
import com.mx.pollos.service.EmpleadoService;

/**
 * @author Jorge Ortiz
 * @version 1.0
 * @created 27-ene-2017 12:33:45 p.m.
 */
public class PagoEmpleadosBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Empleado empleado;
	private Actividad actividad;
	private ArrayList<SelectItem> empleadosItem;
	private ArrayList<SelectItem> actividadesItem;
	private ArrayList<SelectItem> semanasItem;
	private List<Semana> semanas;
	private List<Actividad> actividades;
	private List<Empleado> empleados;
	private Semana semana;
	private EmpleadoActividad empleadoActividad;
	private EmpleadoService empleadoService;
	//private List<PagoEmpleados> pagos;
	private List<EmpleadoActividad> empleadosActividad;
	
	
	
	public Actividad getActividad() {
		return actividad;
	}

	public void setActividad(Actividad actividad) {
		this.actividad = actividad;
	}

	public List<EmpleadoActividad> getEmpleadosActividad() {
		return empleadosActividad;
	}

	public void setEmpleadosActividad(List<EmpleadoActividad> empleadosActividad) {
		this.empleadosActividad = empleadosActividad;
	}

	public ArrayList<SelectItem> getEmpleadosItem() {
		return empleadosItem;
	}

	public void setEmpleadosItem(ArrayList<SelectItem> empleadosItem) {
		this.empleadosItem = empleadosItem;
	}

	public ArrayList<SelectItem> getActividadesItem() {
		return actividadesItem;
	}

	public void setActividadesItem(ArrayList<SelectItem> actividadesItem) {
		this.actividadesItem = actividadesItem;
	}

	public ArrayList<SelectItem> getSemanasItem() {
		return semanasItem;
	}

	public void setSemanasItem(ArrayList<SelectItem> semanasItem) {
		this.semanasItem = semanasItem;
	}

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

	public List<Semana> getSemanas() {
		return semanas;
	}

	public void setSemanas(List<Semana> semanas) {
		this.semanas = semanas;
	}

	public List<Actividad> getActividades() {
		return actividades;
	}

	public void setActividades(List<Actividad> actividades) {
		this.actividades = actividades;
	}

	public EmpleadoActividad getEmpleadoActividad() {
		return empleadoActividad;
	}

	public void setEmpleadoActividad(EmpleadoActividad empleadoActividad) {
		this.empleadoActividad = empleadoActividad;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public Semana getSemana() {
		return semana;
	}

	public void setSemana(Semana semana) {
		this.semana = semana;
	}

	/*public List<PagoEmpleados> getPagos() {
		return pagos;
	}

	public void setPagos(List<PagoEmpleados> pagos) {
		this.pagos = pagos;
	}*/

	public void setEmpleadoService(EmpleadoService empleadoService) {
		this.empleadoService = empleadoService;
	}

	public PagoEmpleadosBean(){
		empleado = new Empleado();
		semana = new Semana();
		empleadoActividad = new EmpleadoActividad();
	}

	public void finalize() throws Throwable {

	}

	public String agregar(){
		try{
			Actividad eActividad = empleadoService.buscarActividadId(empleadoActividad.getActividad().getIdActividad());
			Empleado eEmpleado = empleadoService.buscarId(empleadoActividad.getEmpleado().getIdEmpleado());
			Semana eSemana = empleadoService.buscarSemanaId(empleadoActividad.getSemana().getIdSemana());
			empleadoService.asignarActividadEmpleado(eActividad, eEmpleado, eSemana);
		}
		catch(Exception exception){
			exception.printStackTrace();
		}
		return llenarTabla();
	}

	public String buscar(){
		try{
			
		}
		catch(Exception exception){
			exception.printStackTrace();
		}
		return "";
	}

	public String imprimir(){
		return "";
	}
	

	public String llenarTabla(){
		try{
			empleado = new Empleado();
			semana = new Semana();
			empleadoActividad = new EmpleadoActividad();
			empleadosActividad = empleadoService.buscarEmpleadoActividad(new EmpleadoActividad(new Empleado(), new Actividad(), new Semana()));
		}
		catch(Exception exception){
			exception.printStackTrace();
		}
		return "pagoempleados";
	}
	
	public String borrar(){
		FacesContext fc = FacesContext.getCurrentInstance();
		Integer idEmpleado = Integer.parseInt(fc.getExternalContext().getRequestParameterMap().get("idEmpleado"));
		Integer idActividad = Integer.parseInt(fc.getExternalContext().getRequestParameterMap().get("idActividad"));
		Integer idSemana = Integer.parseInt(fc.getExternalContext().getRequestParameterMap().get("idSemana"));
		empleadoService.desasignarActividadEmpleado(empleadoService.buscarActividadId(idActividad), empleadoService.buscarId(idEmpleado), empleadoService.buscarSemanaId(idSemana));
		return llenarTabla();
	}
	
	public String inicioAgregar(){
		SelectItem option;
		actividades = empleadoService.buscarActividad(new Actividad());
		actividadesItem = new ArrayList<SelectItem>();
		for (Actividad actividad:actividades){
			option = new SelectItem(actividad.getIdActividad(), actividad.getDescripcion());
			actividadesItem.add(option);
		}
		empleados = empleadoService.buscarEmpleado(new Empleado());
		empleadosItem = new ArrayList<SelectItem>();
		for (Empleado empleado:empleados){
			option = new SelectItem(empleado.getIdEmpleado(), empleado.getNombre());
			empleadosItem.add(option);
		}
		semanas = empleadoService.buscarSemana(new Semana());
		semanasItem = new ArrayList<SelectItem>();
		for (Semana semana:semanas){
			option = new SelectItem(semana.getIdSemana(), semana.getFechaInicio() + " / " + semana.getFechaFin());
			semanasItem.add(option);
		}
		empleadoActividad = new EmpleadoActividad(new Empleado(), new Actividad(), new Semana());
		return "agregar";
	}

}