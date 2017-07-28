package com.mx.pollos.bean;
import java.io.Serializable;
import java.util.List;

import com.mx.pollos.model.Semana;
import com.mx.pollos.service.SemanaService;

/**
 * @author Jorge Ortiz
 * @version 1.0
 * @created 27-ene-2017 12:33:45 p.m.
 */
public class SemanaBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Semana semana = new Semana();
	private SemanaService semanaService;
	private List<Semana> semanas;

	public List<Semana> getSemanas() {
		llenarTabla();
		return semanas;
	}

	public void setSemanas(List<Semana> semanas) {
		this.semanas = semanas;
	}

	public Semana getSemana() {
		return semana;
	}

	public void setSemana(Semana semana) {
		this.semana = semana;
	}

	public void setSemanaService(SemanaService semanaService) {
		this.semanaService = semanaService;
	}

	public SemanaBean(){
		semana = new Semana();
	}

	public void finalize() throws Throwable {

	}

	public String agregar(){
		try{
			semanaService.crearSemana(semana);
		}
		catch(Exception exception){
			exception.printStackTrace();
		}
		return llenarTabla();
	}

	public String buscar(){
		try{
			System.out.println(semana.getIdSemana());
			semanas = semanaService.buscarSemana(semana);
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
			semana = new Semana();
			semanas = semanaService.buscarSemana(semana);
		}
		catch(Exception exception){
			exception.printStackTrace();
		}
		return "semanas";
	}
	
	public String borrar(){
		return "";
	}
	
	public String inicioAgregar(){
		return "agregar";
	}

}