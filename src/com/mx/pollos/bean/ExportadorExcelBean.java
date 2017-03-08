package com.mx.pollos.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.mx.pollos.model.Actividad;
import com.mx.pollos.model.Comida;
import com.mx.pollos.model.Empleado;
import com.mx.pollos.model.Pieza;
import com.mx.pollos.model.Remolque;
import com.mx.pollos.model.Servicio;
import com.mx.pollos.model.TablaGenerica;
import com.mx.pollos.model.VentaRemolque;
import com.mx.pollos.service.EmpleadoService;
import com.mx.pollos.service.GananciaService;
import com.mx.pollos.service.GastosService;
import com.mx.pollos.service.IngresoService;
import com.mx.pollos.service.SemanaService;
import com.mx.pollos.service.VentaService;
import com.mx.pollos.utilerias.ReadExcel;

public class ExportadorExcelBean {

	private EmpleadoService empleadoService;
	private GananciaService gananciaService;
	private GastosService gastosService;
	private IngresoService ingresoService;
	private SemanaService semanaService;
	private VentaService ventaService;
	
	//public Date selectedDate = new Date();
	public String contenidoExcel = "";
	private List<TablaGenerica> gastos = new ArrayList<TablaGenerica>();
	private List<TablaGenerica> sueldos = new ArrayList<TablaGenerica>();
	private Integer contadorTresCruces;
	private Integer contadorPanteones;
	private Integer contadorCondesa;
	private Integer contadorSauceda;
	//Movimiento Pollos y Papas
	private String tt;
	private Double tp;
	private Double tc;
	private Double ts;
	private String pp;
	private Double pt;
	private Double pc;
	private Double ps;
	private String cc;
	private Double ct;
	private Double cp;
	private Double cs;
	private String ss;
	private Double st;
	private Double sp;
	private Double sc;
	private String tt2;
	private Double tp2;
	private Double tc2;
	private Double ts2;
	private String pp2;
	private Double pt2;
	private Double pc2;
	private Double ps2;
	private String cc2;
	private Double ct2;
	private Double cp2;
	private Double cs2;
	private String ss2;
	private Double st2;
	private Double sp2;
	private Double sc2;
	private String tt3;
	private Double tp3;
	private Double tc3;
	private Double ts3;
	private String pp3;
	private Double pt3;
	private Double pc3;
	private Double ps3;
	private String cc3;
	private Double ct3;
	private Double cp3;
	private Double cs3;
	private String ss3;
	private Double st3;
	private Double sp3;
	private Double sc3;
	private String tt4;
	private Double tp4;
	private Double tc4;
	private Double ts4;
	private String pp4;
	private Double pt4;
	private Double pc4;
	private Double ps4;
	private String cc4;
	private Double ct4;
	private Double cp4;
	private Double cs4;
	private String ss4;
	private Double st4;
	private Double sp4;
	private Double sc4;
	//Piezas
	private Double t2;
	private Double p2;
	private Double c2;
	private Double s2;
	private Double t15;
	private Double p15;
	private Double c15;
	private Double s15;
	private Double t5;
	private Double p5;
	private Double c5;
	private Double s5;
	private Double t21;
	private Double p21;
	private Double c21;
	private Double s21;
	private Double t151;
	private Double p151;
	private Double c151;
	private Double s151;
	private Double t51;
	private Double p51;
	private Double c51;
	private Double s51;
	//Gastos General
	private Double pollosTresCruces;
	private Double pollosSauceda;
	private Double pollosCondesa;
	private Double pollosPanteones;
	private Double papasTresCruces;
	private Double papasSauceda;
	private Double papasCondesa;
	private Double papasPanteones;
	private Double pollosMovTresCruces;
	private Double pollosMovSauceda;
	private Double pollosMovCondesa;
	private Double pollosMovPanteones;
	private Double papasMovTresCruces;
	private Double papasMovSauceda;
	private Double papasMovCondesa;
	private Double papasMovPanteones;
	private Double pollosTresCrucesD;
	private Double pollosSaucedaD;
	private Double pollosCondesaD;
	private Double pollosPanteonesD;
	private Double papasTresCrucesD;
	private Double papasSaucedaD;
	private Double papasCondesaD;
	private Double papasPanteonesD;
	private Double pollosMovTresCrucesD;
	private Double pollosMovSaucedaD;
	private Double pollosMovCondesaD;
	private Double pollosMovPanteonesD;
	private Double papasMovTresCrucesD;
	private Double papasMovSaucedaD;
	private Double papasMovCondesaD;
	private Double papasMovPanteonesD;
	private Double ventaPollosTresCruces;
	private Double ventaPollosSauceda;
	private Double ventaPollosCondesa;
	private Double ventaPollosPanteones;
	private Double ventaPollosTresCrucesD;
	private Double ventaPollosSaucedaD;
	private Double ventaPollosCondesaD;
	private Double ventaPollosPanteonesD;
	private Double ventaPapasTresCruces;
	private Double ventaPapasSauceda;
	private Double ventaPapasCondesa;
	private Double ventaPapasPanteones;
	private Double ventaPapasTresCrucesD;
	private Double ventaPapasSaucedaD;
	private Double ventaPapasCondesaD;
	private Double ventaPapasPanteonesD;
	private Double ventaTresCruces;
	private Double ventaSauceda;
	private Double ventaCondesa;
	private Double ventaPanteones;
	private Double ventaTresCrucesD;
	private Double ventaSaucedaD;
	private Double ventaCondesaD;
	private Double ventaPanteonesD;
	private Double maletinTresCruces;
	private Double maletinSauceda;
	private Double maletinCondesa;
	private Double maletinPanteones;
	private Double maletinTresCrucesD;
	private Double maletinSaucedaD;
	private Double maletinCondesaD;
	private Double maletinPanteonesD;
	private Double comidaTresCruces;
	private Double comidaPanteones;
	private Double comidaCondesa;
	private Double comidaSauceda;
	private Double comidaTresCrucesD;
	private Double comidaPanteonesD;
	private Double comidaCondesaD;
	private Double comidaSaucedaD;
	private Double refrescoTresCruces;
	private Double refrescoPanteones;
	private Double refrescoCondesa;
	private Double refrescoSauceda;
	private Double refrescoTresCrucesD;
	private Double refrescoPanteonesD;
	private Double refrescoCondesaD;
	private Double refrescoSaucedaD;
	private Double pollosPiezasTresCruces;
	private Double pollosPiezasPanteones;
	private Double pollosPiezasCondesa;
	private Double pollosPiezasSauceda;
	private Double pollosPiezasTresCrucesD;
	private Double pollosPiezasPanteonesD;
	private Double pollosPiezasCondesaD;
	private Double pollosPiezasSaucedaD;
	private Double descuentosTresCruces;
	private Double descuentosPanteones;
	private Double descuentosSauceda;
	private Double descuentosCondesa;
	private Double descuentosTresCrucesD;
	private Double descuentosPanteonesD;
	private Double descuentosSaucedaD;
	private Double descuentosCondesaD;
	private Double pollosQuedaronTresCruces;
	private Double pollosQuedaronCondesa;
	private Double pollosQuedaronSauceda;
	private Double pollosQuedaronPanteones;
	private Double pollosQuedaronTresCrucesD;
	private Double pollosQuedaronCondesaD;
	private Double pollosQuedaronSaucedaD;
	private Double pollosQuedaronPanteonesD;
	private Double pollosQuedaronDineroTresCruces;
	private Double pollosQuedaronDineroSauceda;
	private Double pollosQuedaronDineroPanteones;
	private Double pollosQuedaronDineroCondesa;
	private Double pollosQuedaronDineroTresCrucesD;
	private Double pollosQuedaronDineroSaucedaD;
	private Double pollosQuedaronDineroPanteonesD;
	private Double pollosQuedaronDineroCondesaD;
	private Double otrosGastosTresCruces;
	private Double otrosGastosCondesa;
	private Double otrosGastosSauceda;
	private Double otrosGastosPanteones;
	private Double otrosGastosTresCrucesD;
	private Double otrosGastosCondesaD;
	private Double otrosGastosSaucedaD;
	private Double otrosGastosPanteonesD;
	private Double dineroTresCruces;
	private Double dineroCondesa;
	private Double dineroSauceda;
	private Double dineroPanteones;
	private Double dineroTresCrucesD;
	private Double dineroCondesaD;
	private Double dineroSaucedaD;
	private Double dineroPanteonesD;
	private Double billetesTresCruces;
	private Double billetesPanteones;
	private Double billetesSauceda;
	private Double billetesCondesa;
	private Double billetesTresCrucesD;
	private Double billetesPanteonesD;
	private Double billetesSaucedaD;
	private Double billetesCondesaD;
	private Double monedasTresCruces;
	private Double monedasPanteones;
	private Double monedasCondesa;
	private Double monedasSauceda;
	private Double monedasTresCrucesD;
	private Double monedasPanteonesD;
	private Double monedasCondesaD;
	private Double monedasSaucedaD;
	private Double totalTresCruces;
	private Double totalCondesa;
	private Double totalSauceda;
	private Double totalPanteones;
	private Double totalTresCrucesD;
	private Double totalCondesaD;
	private Double totalSaucedaD;
	private Double totalPanteonesD;
	private Double diferenciaTresCruces;
	private Double diferenciaPanteones;
	private Double diferenciaCondesa;
	private Double diferenciaSauceda;
	private Double diferenciaTresCrucesD;
	private Double diferenciaPanteonesD;
	private Double diferenciaCondesaD;
	private Double diferenciaSaucedaD;
	
	private Double polloQuedaronTresCruces;
	private Double polloQuedaronPanteones;
	private Double polloQuedaronCondesa;
	private Double polloQuedaronSauceda;
	private Double polloQuedaronTresCrucesD;
	private Double polloQuedaronPanteonesD;
	private Double polloQuedaronCondesaD;
	private Double polloQuedaronSaucedaD;
	private Double papaQuedaronTresCruces;
	private Double papaQuedaronPanteones;
	private Double papaQuedaronCondesa;
	private Double papaQuedaronSauceda;
	private Double papaQuedaronTresCrucesD;
	private Double papaQuedaronPanteonesD;
	private Double papaQuedaronCondesaD;
	private Double papaQuedaronSaucedaD;
	
	private Double gananciaFin;
	
	public void exportarBD(){
		//Empleados Genericos
		Empleado parillero = empleadoService.buscarId(1);
		Empleado chava = empleadoService.buscarId(2);
		//Remolques
		Remolque tresCruces = ventaService.buscarRemolque(1);
		Remolque condesa = ventaService.buscarRemolque(2);
		Remolque sauceda = ventaService.buscarRemolque(3);
		Remolque panteones = ventaService.buscarRemolque(4);
		//fechas genericas falta corregir
		Date fecha = new Date();
		Date fecha2 = new Date();
		//Tabla Venta Remolque - Carga de pollos y papas que se llevan al inicio sabado y domingo
		//Sabado
		VentaRemolque tresCrucesSabado = ventaService.altaVentaRemolque(pollosTresCruces, papasTresCruces, tresCruces, parillero, chava, fecha);
		VentaRemolque condesaSabado = ventaService.altaVentaRemolque(pollosCondesa, papasCondesa, condesa, parillero, chava, fecha);
		VentaRemolque saucedaSabado = ventaService.altaVentaRemolque(pollosSauceda, papasSauceda, sauceda, parillero, chava, fecha);
		VentaRemolque panteonesSabado = ventaService.altaVentaRemolque(pollosPanteones, papasPanteones, panteones, parillero, chava, fecha);
		//Domingo
		VentaRemolque tresCrucesDomingo = ventaService.altaVentaRemolque(pollosTresCrucesD, papasTresCrucesD, tresCruces, parillero, chava, fecha2);
		VentaRemolque condesaDomingo = ventaService.altaVentaRemolque(pollosCondesaD, papasCondesaD, condesa, parillero, chava, fecha2);
		VentaRemolque saucedaDomingo = ventaService.altaVentaRemolque(pollosSaucedaD, papasSaucedaD, sauceda, parillero, chava, fecha2);
		VentaRemolque panteonesDomingo = ventaService.altaVentaRemolque(pollosPanteonesD, papasPanteonesD, panteones, parillero, chava, fecha2);
		//movimiento pollos 
		//Sabado
		if(tp > 0){
			ventaService.movimientoPollos(tp, tresCrucesSabado, panteonesSabado, fecha);
		}if(tc > 0){
			ventaService.movimientoPollos(tc, tresCrucesSabado, condesaSabado, fecha);
		}if(ts > 0){
			ventaService.movimientoPollos(ts, tresCrucesSabado, saucedaSabado, fecha);
		}if(ct > 0){
			ventaService.movimientoPollos(ct, condesaSabado, tresCrucesSabado, fecha);
		}if(cs > 0){
			ventaService.movimientoPollos(cs, condesaSabado, saucedaSabado, fecha);
		}if(cp > 0){
			ventaService.movimientoPollos(cp, condesaSabado, panteonesSabado, fecha);
		}if(sc > 0){
			ventaService.movimientoPollos(sc, saucedaSabado, condesaSabado, fecha);
		}if(st > 0){
			ventaService.movimientoPollos(st, saucedaSabado, tresCrucesSabado, fecha);
		}if(sp > 0){
			ventaService.movimientoPollos(sp, saucedaSabado, panteonesSabado, fecha);
		}if(pc > 0){
			ventaService.movimientoPollos(pc, panteonesSabado, condesaSabado, fecha);
		}if(pt > 0){
			ventaService.movimientoPollos(pt, panteonesSabado, tresCrucesSabado, fecha);
		}if(ps > 0){
			ventaService.movimientoPollos(ps, panteonesSabado, saucedaSabado, fecha);
		}
		//Domingo
		if(tp2 > 0){
			ventaService.movimientoPollos(tp2, tresCrucesSabado, panteonesSabado, fecha2);
		}if(tc2 > 0){
			ventaService.movimientoPollos(tc2, tresCrucesSabado, condesaSabado, fecha2);
		}if(ts2 > 0){
			ventaService.movimientoPollos(ts2, tresCrucesSabado, saucedaSabado, fecha2);
		}if(ct2 > 0){
			ventaService.movimientoPollos(ct2, condesaSabado, tresCrucesSabado, fecha2);
		}if(cs2 > 0){
			ventaService.movimientoPollos(cs2, condesaSabado, saucedaSabado, fecha2);
		}if(cp2 > 0){
			ventaService.movimientoPollos(cp2, condesaSabado, panteonesSabado, fecha2);
		}if(sc2 > 0){
			ventaService.movimientoPollos(sc2, saucedaSabado, condesaSabado, fecha2);
		}if(st2 > 0){
			ventaService.movimientoPollos(st2, saucedaSabado, tresCrucesSabado, fecha2);
		}if(sp2 > 0){
			ventaService.movimientoPollos(sp2, saucedaSabado, panteonesSabado, fecha2);
		}if(pc2 > 0){
			ventaService.movimientoPollos(pc2, panteonesSabado, condesaSabado, fecha2);
		}if(pt2 > 0){
			ventaService.movimientoPollos(pt2, panteonesSabado, tresCrucesSabado, fecha2);
		}if(ps2 > 0){
			ventaService.movimientoPollos(ps2, panteonesSabado, saucedaSabado, fecha2);
		}
		//movimiento papas
		//Sabado
		if(tp3 > 0){
			ventaService.movimientoPapas(tp3, tresCrucesSabado, panteonesSabado, fecha);
		}if(tc3 > 0){
			ventaService.movimientoPapas(tc3, tresCrucesSabado, condesaSabado, fecha);
		}if(ts3 > 0){
			ventaService.movimientoPapas(ts3, tresCrucesSabado, saucedaSabado, fecha);
		}if(ct3 > 0){
			ventaService.movimientoPapas(ct3, condesaSabado, tresCrucesSabado, fecha);
		}if(cs3 > 0){
			ventaService.movimientoPapas(cs3, condesaSabado, saucedaSabado, fecha);
		}if(cp3 > 0){
			ventaService.movimientoPapas(cp3, condesaSabado, panteonesSabado, fecha);
		}if(sc3 > 0){
			ventaService.movimientoPapas(sc3, saucedaSabado, condesaSabado, fecha);
		}if(st3 > 0){
			ventaService.movimientoPapas(st3, saucedaSabado, tresCrucesSabado, fecha);
		}if(sp3 > 0){
			ventaService.movimientoPapas(sp3, saucedaSabado, panteonesSabado, fecha);
		}if(pc3 > 0){
			ventaService.movimientoPapas(pc3, panteonesSabado, condesaSabado, fecha);
		}if(pt3 > 0){
			ventaService.movimientoPapas(pt3, panteonesSabado, tresCrucesSabado, fecha);
		}if(ps3 > 0){
			ventaService.movimientoPapas(ps3, panteonesSabado, saucedaSabado, fecha);
		}
		//Domingo
		if(tp4 > 0){
			ventaService.movimientoPapas(tp4, tresCrucesSabado, panteonesSabado, fecha2);
		}if(tc4 > 0){
			ventaService.movimientoPapas(tc4, tresCrucesSabado, condesaSabado, fecha2);
		}if(ts4 > 0){
			ventaService.movimientoPapas(ts4, tresCrucesSabado, saucedaSabado, fecha2);
		}if(ct4 > 0){
			ventaService.movimientoPapas(ct4, condesaSabado, tresCrucesSabado, fecha2);
		}if(cs4 > 0){
			ventaService.movimientoPapas(cs4, condesaSabado, saucedaSabado, fecha2);
		}if(cp4 > 0){
			ventaService.movimientoPapas(cp4, condesaSabado, panteonesSabado, fecha2);
		}if(sc4 > 0){
			ventaService.movimientoPapas(sc4, saucedaSabado, condesaSabado, fecha2);
		}if(st4 > 0){
			ventaService.movimientoPapas(st4, saucedaSabado, tresCrucesSabado, fecha2);
		}if(sp4 > 0){
			ventaService.movimientoPapas(sp4, saucedaSabado, panteonesSabado, fecha2);
		}if(pc4 > 0){
			ventaService.movimientoPapas(pc4, panteonesSabado, condesaSabado, fecha2);
		}if(pt4 > 0){
			ventaService.movimientoPapas(pt4, panteonesSabado, tresCrucesSabado, fecha2);
		}if(ps4 > 0){
			ventaService.movimientoPapas(ps4, panteonesSabado, saucedaSabado, fecha2);
		}
		//Venta por piezas
		Pieza dos = ventaService.buscarPieza(1);
		Pieza unoYMedio = ventaService.buscarPieza(2);
		Pieza medio = ventaService.buscarPieza(3);
		//Sabado
		if(t2 > 0){
			ventaService.altaVentaRemolquePieza(tresCrucesSabado, dos, t2, fecha);
		}if(p2 > 0){
			ventaService.altaVentaRemolquePieza(panteonesSabado, dos, p2, fecha);
		}if(s2 > 0){
			ventaService.altaVentaRemolquePieza(saucedaSabado, dos, s2, fecha);
		}if(c2 > 0){
			ventaService.altaVentaRemolquePieza(condesaSabado, dos, c2, fecha);
		}if(t15 > 0){
			ventaService.altaVentaRemolquePieza(tresCrucesSabado, unoYMedio, t15, fecha);
		}if(p15 > 0){
			ventaService.altaVentaRemolquePieza(panteonesSabado, unoYMedio, p15, fecha);
		}if(s15 > 0){
			ventaService.altaVentaRemolquePieza(saucedaSabado, unoYMedio, s15, fecha);
		}if(c15 > 0){
			ventaService.altaVentaRemolquePieza(condesaSabado, unoYMedio, c15, fecha);
		}if(t5 > 0){
			ventaService.altaVentaRemolquePieza(tresCrucesSabado, medio, t5, fecha);
		}if(p5 > 0){
			ventaService.altaVentaRemolquePieza(panteonesSabado, medio, p5, fecha);
		}if(s5 > 0){
			ventaService.altaVentaRemolquePieza(saucedaSabado, medio, s5, fecha);
		}if(c5 > 0){
			ventaService.altaVentaRemolquePieza(condesaSabado, medio, c5, fecha);
		}
		//Domingo
		if(t21 > 0){
			ventaService.altaVentaRemolquePieza(tresCrucesDomingo, dos, t21, fecha2);
		}if(p21 > 0){
			ventaService.altaVentaRemolquePieza(panteonesDomingo, dos, p21, fecha2);
		}if(s21 > 0){
			ventaService.altaVentaRemolquePieza(saucedaDomingo, dos, s21, fecha2);
		}if(c21 > 0){
			ventaService.altaVentaRemolquePieza(condesaDomingo, dos, c21, fecha2);
		}if(t151 > 0){
			ventaService.altaVentaRemolquePieza(tresCrucesDomingo, unoYMedio, t151, fecha2);
		}if(p151 > 0){
			ventaService.altaVentaRemolquePieza(panteonesDomingo, unoYMedio, p151, fecha2);
		}if(s151 > 0){
			ventaService.altaVentaRemolquePieza(saucedaDomingo, unoYMedio, s151, fecha2);
		}if(c151 > 0){
			ventaService.altaVentaRemolquePieza(condesaDomingo, unoYMedio, c151, fecha2);
		}if(t51 > 0){
			ventaService.altaVentaRemolquePieza(tresCrucesDomingo, medio, t51, fecha2);
		}if(p51 > 0){
			ventaService.altaVentaRemolquePieza(panteonesDomingo, medio, p51, fecha2);
		}if(s51 > 0){
			ventaService.altaVentaRemolquePieza(saucedaDomingo, medio, s51, fecha2);
		}if(c51 > 0){
			ventaService.altaVentaRemolquePieza(condesaDomingo, medio, c51, fecha2);
		}
		//Agregar Comida
		//Sabado
		Comida comCondesa = new Comida();
		if(comidaCondesa <= 45){
			comCondesa = ventaService.buscarComida(1);
		}else if(comidaCondesa <= 85){
			comCondesa = ventaService.buscarComida(2);
		}else if(comidaCondesa <= 110){
			comCondesa = ventaService.buscarComida(3);
		}else if(comidaCondesa <= 135){
			comCondesa = ventaService.buscarComida(4);
		}else{
			System.out.println("Inserta manueal Comida Sabado Codesa = " + comidaCondesa);
		}
		Comida comSauceda = new Comida();
		if(comidaSauceda <= 45){
			comSauceda = ventaService.buscarComida(1);
		}else if(comidaSauceda <= 85){
			comSauceda = ventaService.buscarComida(2);
		}else if(comidaSauceda <= 110){
			comSauceda = ventaService.buscarComida(3);
		}else if(comidaSauceda <= 135){
			comSauceda = ventaService.buscarComida(4);
		}else{
			System.out.println("Inserta manueal Comida Sabado Sauceda = " + comidaSauceda);
		}
		Comida comTresCruces = new Comida();
		if(comidaTresCruces <= 45){
			comTresCruces = ventaService.buscarComida(1);
		}else if(comidaTresCruces <= 85){
			comTresCruces = ventaService.buscarComida(2);
		}else if(comidaTresCruces <= 110){
			comTresCruces = ventaService.buscarComida(3);
		}else if(comidaTresCruces <= 135){
			comTresCruces = ventaService.buscarComida(4);
		}else{
			System.out.println("Inserta manueal Comida Sabado Tres Cruces = " + comidaTresCruces);
		}
		Comida comPanteones = new Comida();
		if(comidaPanteones <= 45){
			comPanteones = ventaService.buscarComida(1);
		}else if(comidaPanteones <= 85){
			comPanteones = ventaService.buscarComida(2);
		}else if(comidaPanteones <= 110){
			comPanteones = ventaService.buscarComida(3);
		}else if(comidaPanteones <= 135){
			comPanteones = ventaService.buscarComida(4);
		}else{
			System.out.println("Inserta manueal Comida Sabado Panteones = " + comidaPanteones);
		}
		//Domingo
		Comida comCondesaD = new Comida();
		if(comidaCondesaD <= 45){
			comCondesaD = ventaService.buscarComida(1);
		}else if(comidaCondesaD <= 85){
			comCondesaD = ventaService.buscarComida(2);
		}else if(comidaCondesaD <= 110){
			comCondesaD = ventaService.buscarComida(3);
		}else if(comidaCondesaD <= 135){
			comCondesaD = ventaService.buscarComida(4);
		}else{
			System.out.println("Inserta manueal Comida Sabado Codesa = " + comidaCondesa);
		}
		Comida comSaucedaD = new Comida();
		if(comidaSaucedaD <= 45){
			comSaucedaD = ventaService.buscarComida(1);
		}else if(comidaSaucedaD <= 85){
			comSaucedaD = ventaService.buscarComida(2);
		}else if(comidaSaucedaD <= 110){
			comSaucedaD = ventaService.buscarComida(3);
		}else if(comidaSaucedaD <= 135){
			comSaucedaD = ventaService.buscarComida(4);
		}else{
			System.out.println("Inserta manueal Comida Sabado Sauceda = " + comidaSauceda);
		}
		Comida comTresCrucesD = new Comida();
		if(comidaTresCrucesD <= 45){
			comTresCrucesD = ventaService.buscarComida(1);
		}else if(comidaTresCrucesD <= 85){
			comTresCrucesD = ventaService.buscarComida(2);
		}else if(comidaTresCrucesD <= 110){
			comTresCrucesD = ventaService.buscarComida(3);
		}else if(comidaTresCrucesD <= 135){
			comTresCrucesD = ventaService.buscarComida(4);
		}else{
			System.out.println("Inserta manueal Comida Sabado Tres Cruces = " + comidaTresCruces);
		}
		Comida comPanteonesD = new Comida();
		if(comidaPanteonesD <= 45){
			comPanteonesD = ventaService.buscarComida(1);
		}else if(comidaPanteonesD <= 85){
			comPanteonesD = ventaService.buscarComida(2);
		}else if(comidaPanteonesD <= 110){
			comPanteonesD = ventaService.buscarComida(3);
		}else if(comidaPanteonesD <= 135){
			comPanteonesD = ventaService.buscarComida(4);
		}else{
			System.out.println("Inserta manueal Comida Sabado Panteones = " + comidaPanteones);
		}
		//Consolidado
		//Sabado
		ventaService.altaConsolidadoVentaRemolque(tresCrucesSabado, (pollosTresCruces - polloQuedaronTresCruces + tp + tc + ts), (papasTresCruces - papaQuedaronTresCruces + tp3 + tc3 + ts3), comTresCruces, totalTresCruces, billetesTresCruces, monedasTresCruces, diferenciaTresCruces);
		ventaService.altaConsolidadoVentaRemolque(condesaSabado, (pollosCondesa - polloQuedaronCondesa + cp + ct + cs), (papasCondesa - papaQuedaronCondesa + cp3 + ct3 + cs3), comCondesa, totalCondesa, billetesCondesa, monedasCondesa, diferenciaCondesa);
		ventaService.altaConsolidadoVentaRemolque(saucedaSabado, (pollosSauceda - polloQuedaronSauceda + sp + sc + st), (papasSauceda - papaQuedaronSauceda + sp3 + sc3 + st3), comSauceda, totalSauceda, billetesSauceda, monedasSauceda, diferenciaSauceda);
		ventaService.altaConsolidadoVentaRemolque(panteonesSabado, (pollosPanteones - polloQuedaronPanteones+ pt + pc + ps), (papasPanteones - papaQuedaronPanteones + pt3 + pc3 + ps3), comPanteones, totalPanteones, billetesPanteones, monedasPanteones, diferenciaPanteones);
		//Domingo
		ventaService.altaConsolidadoVentaRemolque(tresCrucesDomingo, (pollosTresCrucesD - polloQuedaronTresCrucesD + tp2 + tc2 + ts2), (papasTresCrucesD - papaQuedaronTresCrucesD + tp4 + tc4 + ts4), comTresCrucesD, totalTresCrucesD, billetesTresCrucesD, monedasTresCrucesD, diferenciaTresCrucesD);
		ventaService.altaConsolidadoVentaRemolque(condesaDomingo, (pollosCondesaD - polloQuedaronCondesaD + cp2 + ct2 + cs2), (papasCondesaD - papaQuedaronCondesaD + cp4 + ct4 + cs4), comCondesaD, totalCondesaD, billetesCondesaD, monedasCondesaD, diferenciaCondesaD);
		ventaService.altaConsolidadoVentaRemolque(saucedaDomingo, (pollosSaucedaD - polloQuedaronSaucedaD + sp2 + sc2 + st2), (papasSaucedaD - papaQuedaronSaucedaD + sp4 + sc4 + st4), comSaucedaD, totalSaucedaD, billetesSaucedaD, monedasSaucedaD, diferenciaSaucedaD);
		ventaService.altaConsolidadoVentaRemolque(panteonesSabado, (pollosPanteonesD - polloQuedaronPanteonesD + pt2 + pc2 + ps2), (papasPanteonesD - papaQuedaronPanteonesD + pt4 + pc4 + ps4), comPanteonesD, totalPanteonesD, billetesPanteonesD, monedasPanteonesD, diferenciaPanteonesD);
		//Gastos
		int cantidadGastos = gastos.size();
		for(int i=0; i<cantidadGastos; i++){
			TablaGenerica gasto = gastos.get(i);
			Servicio servicio = ingresoService.buscarServicio(gasto.getNombre());
			ingresoService.compraServicio(servicio, gasto.getImporte(), fecha);
		}
		//Empleados
		int personasSuledos = sueldos.size();
		for(int j=0; j<personasSuledos; j++){
			TablaGenerica empleado = sueldos.get(j);
			Empleado emp = empleadoService.buscarEmpleadoOrInsert(empleado.getNombre());
			Actividad actividad = new Actividad();
			actividad.setDescripcion("Actividad Generica");
			actividad.setImporte(empleado.getImporte().intValue());
			Actividad actividadGenerica = empleadoService.buscarActividadOrInsert(actividad);
			empleadoService.asignarActividadEmpleado(actividadGenerica, emp, fecha);
		}
		//...
	}
	
	public void procesarArchivo(){
		boolean sabado = false;
		boolean domingo = false;
		boolean gastos = false;
		boolean disabletc = true;
		boolean disablepn = true;
		boolean disablesc = true;
		boolean disablecd = true;
		boolean disablePtc = true;
		boolean disablePpn = true;
		boolean disablePsc = true;
		boolean disablePcd = true;
		contadorTresCruces = 0;
		contadorPanteones = 0;
		contadorCondesa = 0;
		contadorSauceda = 0;
		int contadorPollos = 0;
		int contadorPapas = 0; 
		int contadorBilletes = 0;
		int contadorMonedas = 0;
		int gas = 0;
		int luz = 0;
		ReadExcel readExcel = new ReadExcel();
		String hoja = "";
		ArrayList<String> strings = readExcel.leerArchivoExcel("C:\\Cuentas Pollos.xls");
		for(int i = 0; i< strings.size(); i++){
			
			if(!strings.get(i).equals("")){
				if(strings.get(i).contains("Nombre de la Hoja\t")){
					hoja = strings.get(i).replaceAll("Nombre de la Hoja\t", "");
					System.out.println("Hoja = " + strings.get(i));
					if(hoja.equals("Sabado")){
						contadorBilletes = 0;
						contadorMonedas = 0;
						contadorPollos = 0;
						contadorPapas = 0;
						contadorTresCruces = 0;
						contadorPanteones = 0;
						contadorCondesa = 0;
						contadorSauceda = 0;
						sabado = true;
						domingo = false;
						gastos = false;
						disabletc = true;
						disablepn = true;
						disablesc = true;
						disablecd = true;
					}else if(hoja.equals("Domingo")){
						contadorBilletes = 0;
						contadorMonedas = 0;
						contadorPollos = 0;
						contadorPapas = 0;
						contadorTresCruces = 0;
						contadorPanteones = 0;
						contadorCondesa = 0;
						contadorSauceda = 0;
						domingo = true;
						sabado = false;
						gastos = false;
						disabletc = true;
						disablepn = true;
						disablesc = true;
						disablecd = true;
					}else if(hoja.equals("Gastos")){
						/*contadorBilletes = 0;
						contadorMonedas = 0;
						contadorPollos = 0;
						contadorPapas = 0;
						contadorTresCruces = 0;
						contadorPanteones = 0;
						contadorCondesa = 0;
						contadorSauceda = 0;*/
						domingo = false;
						sabado = false;
						gastos = true;
						/*disabletc = true;
						disablepn = true;
						disablesc = true;
						disablecd = true;*/
					}
				}else if(strings.get(i).contains("Pollos") && !strings.get(i).contains("Total Pollos Vendidos") && sabado && (contadorPollos==0)){
					contadorPollos++;
					pollosTresCruces = Double.parseDouble(strings.get(i+1));
					pollosSauceda = Double.parseDouble(strings.get(i+2));
					pollosCondesa = Double.parseDouble(strings.get(i+3));
					pollosPanteones = Double.parseDouble(strings.get(i+4));
					i = i + 4;
				}else if(strings.get(i).contains("Papas") && sabado && (contadorPapas==0)){
					contadorPapas++;
					papasTresCruces = Double.parseDouble(strings.get(i+1));
					papasSauceda = Double.parseDouble(strings.get(i+2));
					papasCondesa = Double.parseDouble(strings.get(i+3));
					papasPanteones = Double.parseDouble(strings.get(i+4));
					i = i + 4;
				}else if(strings.get(i).contains("Pollos mov") && sabado){
					pollosMovTresCruces = Double.parseDouble(strings.get(i+1));
					pollosMovSauceda = Double.parseDouble(strings.get(i+2));
					pollosMovCondesa = Double.parseDouble(strings.get(i+3));
					pollosMovPanteones = Double.parseDouble(strings.get(i+4));
					i = i + 4;
				}else if(strings.get(i).contains("Papas mov") && sabado){
					papasMovTresCruces = Double.parseDouble(strings.get(i+1));
					papasMovSauceda = Double.parseDouble(strings.get(i+2));
					papasMovCondesa = Double.parseDouble(strings.get(i+3));
					papasMovPanteones = Double.parseDouble(strings.get(i+4));
					i = i + 4;
				}else if(strings.get(i).contains("VentaPollos") && sabado){
					ventaPollosTresCruces = Double.parseDouble(strings.get(i+1));
					ventaPollosSauceda = Double.parseDouble(strings.get(i+2));
					ventaPollosCondesa = Double.parseDouble(strings.get(i+3));
					ventaPollosPanteones = Double.parseDouble(strings.get(i+4));
					i = i + 4;
				}else if(strings.get(i).contains("VentaPapas") && sabado){
					ventaPapasTresCruces = Double.parseDouble(strings.get(i+1));
					ventaPapasSauceda = Double.parseDouble(strings.get(i+2));
					ventaPapasCondesa = Double.parseDouble(strings.get(i+3));
					ventaPapasPanteones = Double.parseDouble(strings.get(i+4));
					i = i + 4;
				}else if(strings.get(i).contains("Venta") && sabado){
					ventaTresCruces = Double.parseDouble(strings.get(i+1));
					ventaSauceda = Double.parseDouble(strings.get(i+2));
					ventaCondesa = Double.parseDouble(strings.get(i+3));
					ventaPanteones = Double.parseDouble(strings.get(i+4));
					i = i + 4;
				}else if(strings.get(i).contains("Maletin") && sabado){
					maletinTresCruces = Double.parseDouble(strings.get(i+1));
					maletinSauceda = Double.parseDouble(strings.get(i+2));
					maletinCondesa = Double.parseDouble(strings.get(i+3));
					maletinPanteones = Double.parseDouble(strings.get(i+4));
					i = i + 4;
				}else if(strings.get(i).contains("Comida") && sabado){
					comidaTresCruces = Double.parseDouble(strings.get(i+1));
					comidaSauceda = Double.parseDouble(strings.get(i+2));
					comidaCondesa = Double.parseDouble(strings.get(i+3));
					comidaPanteones = Double.parseDouble(strings.get(i+4));
					i = i + 4;
				}else if(strings.get(i).contains("Refresco") && sabado){
					refrescoTresCruces = Double.parseDouble(strings.get(i+1));
					refrescoSauceda = Double.parseDouble(strings.get(i+2));
					refrescoCondesa = Double.parseDouble(strings.get(i+3));
					refrescoPanteones = Double.parseDouble(strings.get(i+4));
					i = i + 4;
				}else if(strings.get(i).contains("Pollos piezas") && sabado){
					pollosPiezasTresCruces = Double.parseDouble(strings.get(i+1));
					pollosPiezasSauceda = Double.parseDouble(strings.get(i+2));
					pollosPiezasCondesa = Double.parseDouble(strings.get(i+3));
					pollosPiezasPanteones = Double.parseDouble(strings.get(i+4));
					i = i + 4;
				}else if(strings.get(i).contains("Descuentos") && sabado){
					descuentosTresCruces = Double.parseDouble(strings.get(i+1));
					descuentosSauceda = Double.parseDouble(strings.get(i+2));
					descuentosCondesa = Double.parseDouble(strings.get(i+3));
					descuentosPanteones = Double.parseDouble(strings.get(i+4));
					i = i + 4;
				}else if(strings.get(i).contains("Pollos Quedaron") && sabado){
					pollosQuedaronTresCruces = Double.parseDouble(strings.get(i+1));
					pollosQuedaronSauceda = Double.parseDouble(strings.get(i+2));
					pollosQuedaronCondesa = Double.parseDouble(strings.get(i+3));
					pollosQuedaronPanteones = Double.parseDouble(strings.get(i+4));
					i = i + 4;
				}else if(strings.get(i).contains("Pollos Quedaron Dinero") && sabado){
					pollosQuedaronDineroTresCruces = Double.parseDouble(strings.get(i+1));
					pollosQuedaronDineroSauceda = Double.parseDouble(strings.get(i+2));
					pollosQuedaronDineroCondesa = Double.parseDouble(strings.get(i+3));
					pollosQuedaronDineroPanteones = Double.parseDouble(strings.get(i+4));
					i = i + 4;
				}else if(strings.get(i).contains("Otros Gastos") && sabado){
					otrosGastosTresCruces = Double.parseDouble(strings.get(i+1));
					otrosGastosSauceda = Double.parseDouble(strings.get(i+2));
					otrosGastosCondesa = Double.parseDouble(strings.get(i+3));
					otrosGastosPanteones = Double.parseDouble(strings.get(i+4));
					i = i + 4;
				}else if(strings.get(i).contains("Dinero") && sabado){
					dineroTresCruces = Double.parseDouble(strings.get(i+1));
					dineroSauceda = Double.parseDouble(strings.get(i+2));
					dineroCondesa = Double.parseDouble(strings.get(i+3));
					dineroPanteones = Double.parseDouble(strings.get(i+4));
					i = i + 4;
				}else if(strings.get(i).contains("Billetes") && sabado && (contadorBilletes==0)){
					contadorBilletes++;
					billetesTresCruces = Double.parseDouble(strings.get(i+1));
					billetesSauceda = Double.parseDouble(strings.get(i+2));
					billetesCondesa = Double.parseDouble(strings.get(i+3));
					billetesPanteones = Double.parseDouble(strings.get(i+4));
					i = i + 4;
				}else if(strings.get(i).contains("Monedas") && sabado && (contadorMonedas==0)){
					contadorMonedas++;
					monedasTresCruces = Double.parseDouble(strings.get(i+1));
					monedasSauceda = Double.parseDouble(strings.get(i+2));
					monedasCondesa = Double.parseDouble(strings.get(i+3));
					monedasPanteones = Double.parseDouble(strings.get(i+4));
					i = i + 4;
				}else if(strings.get(i).contains("Total") && sabado){
					totalTresCruces = Double.parseDouble(strings.get(i+1));
					totalSauceda = Double.parseDouble(strings.get(i+2));
					totalCondesa = Double.parseDouble(strings.get(i+3));
					totalPanteones = Double.parseDouble(strings.get(i+4));
					i = i + 4;
				}else if(strings.get(i).contains("Diferencia") && sabado){
					diferenciaTresCruces = Double.parseDouble(strings.get(i+1));
					diferenciaSauceda = Double.parseDouble(strings.get(i+2));
					diferenciaCondesa = Double.parseDouble(strings.get(i+3));
					diferenciaPanteones = Double.parseDouble(strings.get(i+4));
					i = i + 4;
				}else if(strings.get(i).contains("Pollos") && !strings.get(i).contains("Total Pollos Vendidos") && domingo && (contadorPollos==0)){
					contadorPollos++;
					pollosTresCrucesD = Double.parseDouble(strings.get(i+1));
					pollosSaucedaD = Double.parseDouble(strings.get(i+2));
					pollosCondesaD = Double.parseDouble(strings.get(i+3));
					pollosPanteonesD = Double.parseDouble(strings.get(i+4));
					i = i + 4;
				}else if(strings.get(i).contains("Papas") && domingo && (contadorPapas==0)){
					contadorPapas++;
					papasTresCrucesD = Double.parseDouble(strings.get(i+1));
					papasSaucedaD = Double.parseDouble(strings.get(i+2));
					papasCondesaD = Double.parseDouble(strings.get(i+3));
					papasPanteonesD = Double.parseDouble(strings.get(i+4));
					i = i + 4;
				}else if(strings.get(i).contains("Pollos mov") && domingo){
					pollosMovTresCrucesD = Double.parseDouble(strings.get(i+1));
					pollosMovSaucedaD = Double.parseDouble(strings.get(i+2));
					pollosMovCondesaD = Double.parseDouble(strings.get(i+3));
					pollosMovPanteonesD = Double.parseDouble(strings.get(i+4));
					i = i + 4;
				}else if(strings.get(i).contains("Papas mov") && domingo){
					papasMovTresCrucesD = Double.parseDouble(strings.get(i+1));
					papasMovSaucedaD = Double.parseDouble(strings.get(i+2));
					papasMovCondesaD = Double.parseDouble(strings.get(i+3));
					papasMovPanteonesD = Double.parseDouble(strings.get(i+4));
					i = i + 4;
				}else if(strings.get(i).contains("VentaPollos") && domingo){
					ventaPollosTresCrucesD = Double.parseDouble(strings.get(i+1));
					ventaPollosSaucedaD = Double.parseDouble(strings.get(i+2));
					ventaPollosCondesaD = Double.parseDouble(strings.get(i+3));
					ventaPollosPanteonesD = Double.parseDouble(strings.get(i+4));
					i = i + 4;
				}else if(strings.get(i).contains("VentaPapas") && domingo){
					ventaPapasTresCrucesD = Double.parseDouble(strings.get(i+1));
					ventaPapasSaucedaD = Double.parseDouble(strings.get(i+2));
					ventaPapasCondesaD = Double.parseDouble(strings.get(i+3));
					ventaPapasPanteonesD = Double.parseDouble(strings.get(i+4));
					i = i + 4;
				}else if(strings.get(i).contains("Venta") && domingo){
					ventaTresCrucesD = Double.parseDouble(strings.get(i+1));
					ventaSaucedaD = Double.parseDouble(strings.get(i+2));
					ventaCondesaD = Double.parseDouble(strings.get(i+3));
					ventaPanteonesD = Double.parseDouble(strings.get(i+4));
					i = i + 4;
				}else if(strings.get(i).contains("Maletin") && domingo){
					maletinTresCrucesD = Double.parseDouble(strings.get(i+1));
					maletinSaucedaD = Double.parseDouble(strings.get(i+2));
					maletinCondesaD = Double.parseDouble(strings.get(i+3));
					maletinPanteonesD = Double.parseDouble(strings.get(i+4));
					i = i + 4;
				}else if(strings.get(i).contains("Comida") && domingo){
					comidaTresCrucesD = Double.parseDouble(strings.get(i+1));
					comidaSaucedaD = Double.parseDouble(strings.get(i+2));
					comidaCondesaD = Double.parseDouble(strings.get(i+3));
					comidaPanteonesD = Double.parseDouble(strings.get(i+4));
					i = i + 4;
				}else if(strings.get(i).contains("Refresco") && domingo){
					refrescoTresCrucesD = Double.parseDouble(strings.get(i+1));
					refrescoSaucedaD = Double.parseDouble(strings.get(i+2));
					refrescoCondesaD = Double.parseDouble(strings.get(i+3));
					refrescoPanteonesD = Double.parseDouble(strings.get(i+4));
					i = i + 4;
				}else if(strings.get(i).contains("Pollos piezas") && domingo){
					pollosPiezasTresCrucesD = Double.parseDouble(strings.get(i+1));
					pollosPiezasSaucedaD = Double.parseDouble(strings.get(i+2));
					pollosPiezasCondesaD = Double.parseDouble(strings.get(i+3));
					pollosPiezasPanteonesD = Double.parseDouble(strings.get(i+4));
					i = i + 4;
				}else if(strings.get(i).contains("Descuentos") && domingo){
					descuentosTresCrucesD = Double.parseDouble(strings.get(i+1));
					descuentosSaucedaD = Double.parseDouble(strings.get(i+2));
					descuentosCondesaD = Double.parseDouble(strings.get(i+3));
					descuentosPanteonesD = Double.parseDouble(strings.get(i+4));
					i = i + 4;
				}else if(strings.get(i).contains("Pollos Quedaron") && domingo){
					pollosQuedaronTresCrucesD = Double.parseDouble(strings.get(i+1));
					pollosQuedaronSaucedaD = Double.parseDouble(strings.get(i+2));
					pollosQuedaronCondesaD = Double.parseDouble(strings.get(i+3));
					pollosQuedaronPanteonesD = Double.parseDouble(strings.get(i+4));
					i = i + 4;
				}else if(strings.get(i).contains("Pollos Quedaron Dinero") && domingo){
					pollosQuedaronDineroTresCrucesD = Double.parseDouble(strings.get(i+1));
					pollosQuedaronDineroSaucedaD = Double.parseDouble(strings.get(i+2));
					pollosQuedaronDineroCondesaD = Double.parseDouble(strings.get(i+3));
					pollosQuedaronDineroPanteonesD = Double.parseDouble(strings.get(i+4));
					i = i + 4;
				}else if(strings.get(i).contains("Otros Gastos") && domingo){
					otrosGastosTresCrucesD = Double.parseDouble(strings.get(i+1));
					otrosGastosSaucedaD = Double.parseDouble(strings.get(i+2));
					otrosGastosCondesaD = Double.parseDouble(strings.get(i+3));
					otrosGastosPanteonesD = Double.parseDouble(strings.get(i+4));
					i = i + 4;
				}else if(strings.get(i).contains("Dinero") && domingo){
					dineroTresCrucesD = Double.parseDouble(strings.get(i+1));
					dineroSaucedaD = Double.parseDouble(strings.get(i+2));
					dineroCondesaD = Double.parseDouble(strings.get(i+3));
					dineroPanteonesD = Double.parseDouble(strings.get(i+4));
					i = i + 4;
				}else if(strings.get(i).contains("Billetes") && domingo && (contadorBilletes==0)){
					contadorBilletes++;
					billetesTresCrucesD = Double.parseDouble(strings.get(i+1));
					billetesSaucedaD = Double.parseDouble(strings.get(i+2));
					billetesCondesaD = Double.parseDouble(strings.get(i+3));
					billetesPanteonesD = Double.parseDouble(strings.get(i+4));
					i = i + 4;
				}else if(strings.get(i).contains("Monedas") && domingo && (contadorMonedas==0)){
					contadorMonedas++;
					monedasTresCrucesD = Double.parseDouble(strings.get(i+1));
					monedasSaucedaD = Double.parseDouble(strings.get(i+2));
					monedasCondesaD = Double.parseDouble(strings.get(i+3));
					monedasPanteonesD = Double.parseDouble(strings.get(i+4));
					i = i + 4;
				}else if(strings.get(i).contains("Total") && domingo){
					totalTresCrucesD = Double.parseDouble(strings.get(i+1));
					totalSaucedaD = Double.parseDouble(strings.get(i+2));
					totalCondesaD = Double.parseDouble(strings.get(i+3));
					totalPanteonesD = Double.parseDouble(strings.get(i+4));
					i = i + 4;
				}else if(strings.get(i).contains("Diferencia") && domingo){
					diferenciaTresCrucesD = Double.parseDouble(strings.get(i+1));
					diferenciaSaucedaD = Double.parseDouble(strings.get(i+2));
					diferenciaCondesaD = Double.parseDouble(strings.get(i+3));
					diferenciaPanteonesD = Double.parseDouble(strings.get(i+4));
					i = i + 4;
				}else if(strings.get(i).contains("Ganancia") && gastos){
					gananciaFin = Double.parseDouble(strings.get(i+1));
					i = i + 1;
				}else if(strings.get(i).contains("Maletin Sabado") && gastos){
					this.gastos.add(new TablaGenerica("Maletin Sabado", Double.parseDouble(strings.get(i+1))));
					i = i + 1;
				}else if(strings.get(i).contains("Maletin Domingo") && gastos){
					this.gastos.add(new TablaGenerica("Maletin Domingo", Double.parseDouble(strings.get(i+1))));
					i = i + 1;
				}else if(strings.get(i).contains("Verdura") && gastos){
					this.gastos.add(new TablaGenerica("Verdura", Double.parseDouble(strings.get(i+1))));
					i = i + 1;
				}else if(strings.get(i).contains("27 de enero") && gastos){
					this.gastos.add(new TablaGenerica("27 de enero", Double.parseDouble(strings.get(i+1))));
					i = i + 1;
				}else if(strings.get(i).contains("7mo dia") && gastos){
					this.gastos.add(new TablaGenerica("7mo dia", Double.parseDouble(strings.get(i+1))));
					i = i + 1;
				}else if(strings.get(i).contains("Queso") && gastos){
					this.gastos.add(new TablaGenerica("Queso", Double.parseDouble(strings.get(i+1))));
					i = i + 1;
				}else if(strings.get(i).contains("Pollo") && gastos){
					this.gastos.add(new TablaGenerica("Pollo", Double.parseDouble(strings.get(i+1))));
					i = i + 1;
				}else if(strings.get(i).contains("Bolsas y Aluminio") && gastos){
					this.gastos.add(new TablaGenerica("Bolsas y Aluminio", Double.parseDouble(strings.get(i+1))));
					i = i + 1;
				}else if(strings.get(i).contains("Gasolina") && gastos){
					this.gastos.add(new TablaGenerica("Gasolina", Double.parseDouble(strings.get(i+1))));
					i = i + 1;
				}else if(strings.get(i).contains("Gorditas") && gastos){
					this.gastos.add(new TablaGenerica("Gorditas", Double.parseDouble(strings.get(i+1))));
					i = i + 1;
				}else if(strings.get(i).contains("Renta") && gastos){
					this.gastos.add(new TablaGenerica("Renta", Double.parseDouble(strings.get(i+1))));
					i = i + 1;
				}else if(strings.get(i).contains("Agua") && gastos){
					this.gastos.add(new TablaGenerica("Agua", Double.parseDouble(strings.get(i+1))));
					i = i + 1;
				}else if(strings.get(i).contains("Luz") && gastos){
					luz++;
					if(luz == 1){
						this.sueldos.add(new TablaGenerica("Luz", Double.parseDouble(strings.get(i+1))));
					}else if(luz == 2){
						this.gastos.add(new TablaGenerica("Luz", Double.parseDouble(strings.get(i+1))));
					}
					i = i + 1;
				}else if(strings.get(i).contains("Presidencia") && gastos){
					this.gastos.add(new TablaGenerica("Presidencia", Double.parseDouble(strings.get(i+1))));
					i = i + 1;
				}else if(strings.get(i).contains("Tortillas") && gastos){
					this.gastos.add(new TablaGenerica("Tortillas", Double.parseDouble(strings.get(i+1))));
					i = i + 1;
				}else if(strings.get(i).contains("Gas") && gastos){
					gas++;
					if(gas == 2){
						this.gastos.add(new TablaGenerica("Gas", Double.parseDouble(strings.get(i+1))));
						i = i + 1;
					}else if(gas == 3){
						this.gastos.add(new TablaGenerica("Otros Gastos", Double.parseDouble(strings.get(i+1))));
						i = i + 1;
					}
				}else if(strings.get(i).contains("Pepe") && gastos){
					this.sueldos.add(new TablaGenerica("Pepe", Double.parseDouble(strings.get(i+1))));
					i = i + 1;
				}else if(strings.get(i).contains("Toño") && gastos){
					this.sueldos.add(new TablaGenerica("Toño", Double.parseDouble(strings.get(i+1))));
					i = i + 1;
				}else if(strings.get(i).contains("Geo") && gastos){
					this.sueldos.add(new TablaGenerica("Geo", Double.parseDouble(strings.get(i+1))));
					i = i + 1;
				}else if(strings.get(i).contains("Josh") && gastos){
					this.sueldos.add(new TablaGenerica("Josh", Double.parseDouble(strings.get(i+1))));
					i = i + 1;
				}else if(strings.get(i).contains("Sillo") && gastos){
					this.sueldos.add(new TablaGenerica("Sillo", Double.parseDouble(strings.get(i+1))));
					i = i + 1;
				}else if(strings.get(i).contains("Zaida") && gastos){
					this.sueldos.add(new TablaGenerica("Zaida", Double.parseDouble(strings.get(i+1))));
					i = i + 1;
				}else if(strings.get(i).contains("Efrain") && gastos){
					this.sueldos.add(new TablaGenerica("Efrain", Double.parseDouble(strings.get(i+1))));
					i = i + 1;
				}else if(strings.get(i).contains("Susana") && gastos){
					this.sueldos.add(new TablaGenerica("Susana", Double.parseDouble(strings.get(i+1))));
					i = i + 1;
				}else if(strings.get(i).contains("Tanda") && gastos){
					this.sueldos.add(new TablaGenerica("Tanda", Double.parseDouble(strings.get(i+1))));
					i = i + 1;
				}else if(strings.get(i).contains("Cheko") && gastos){
					this.sueldos.add(new TablaGenerica("Cheko", Double.parseDouble(strings.get(i+1))));
					i = i + 1;
				}else if(strings.get(i).contains("Jorge") && gastos){
					this.sueldos.add(new TablaGenerica("Jorge", Double.parseDouble(strings.get(i+1))));
					i = i + 1;
				}else if(strings.get(i).contains("China") && gastos){
					this.sueldos.add(new TablaGenerica("China", Double.parseDouble(strings.get(i+1))));
					i = i + 1;
				}else if(strings.get(i).contains("Diego") && gastos){
					this.sueldos.add(new TablaGenerica("Diego", Double.parseDouble(strings.get(i+1))));
					i = i + 1;
				}else if(strings.get(i).contains("Yo") && gastos){
					this.sueldos.add(new TablaGenerica("Yo", Double.parseDouble(strings.get(i+1))));
					i = i + 1;
				}else if(strings.get(i).contains("Tres Cruces")){
					contadorTresCruces++;
					if(contadorTresCruces == 5){
						disabletc = true;
					}else if(contadorTresCruces == 7){
						disablePtc = true;
					}
				}else if(strings.get(i).contains("Suceda") || strings.get(i).contains("Sauceda")){
					contadorSauceda++;
					if(contadorSauceda == 5){
						disablesc = true;
					}else if(contadorSauceda == 7){
						disablePsc = true;
					}
				}else if(strings.get(i).contains("Condesa")){
					contadorCondesa++;
					if(contadorCondesa == 5){
						disablecd = true;
					}else if(contadorCondesa == 7){
						disablePcd = true;
					}
				}else if(strings.get(i).contains("Panteones")){
					contadorPanteones++;
					if(contadorPanteones == 5){
						disablepn = true;
					}else if(contadorPanteones == 7){
						disablePpn = true;
					}
				}
				if(contadorTresCruces == 4 && disabletc && sabado){
					if(strings.get(i).contains("Tres Cruces")){
						tt = strings.get(i+1);
						ts = Double.parseDouble(strings.get(i+2));
						tc = Double.parseDouble(strings.get(i+3));
						tp = Double.parseDouble(strings.get(i+4));
						i = i + 4;
						disabletc = false;
					}
				}else if(contadorTresCruces == 5 && disabletc && sabado){
					if(strings.get(i).contains("Tres Cruces")){
						tt2 = strings.get(i+1);
						ts2 = Double.parseDouble(strings.get(i+2));
						tc2 = Double.parseDouble(strings.get(i+3));
						tp2 = Double.parseDouble(strings.get(i+4));
						t2 = Double.parseDouble(strings.get(i+7)); 
						s2 = Double.parseDouble(strings.get(i+8));
						c2 = Double.parseDouble(strings.get(i+9));
						p2 = Double.parseDouble(strings.get(i+10));
						i = i + 10;
						disabletc = false;
					}
				}else if(contadorTresCruces == 7 && disablePtc && sabado){
					if(strings.get(i).contains("Tres Cruces")){
						polloQuedaronTresCruces = Double.parseDouble(strings.get(i+1));
						papaQuedaronTresCruces = Double.parseDouble(strings.get(i+2));
						i = i + 2;
						disablePtc = false;
					}
				}if(contadorSauceda == 4 && disablesc && sabado){
					if(strings.get(i).contains("Sauceda")){
						st = Double.parseDouble(strings.get(i+1));
						ss = strings.get(i+2);
						sc = Double.parseDouble(strings.get(i+3));
						sp = Double.parseDouble(strings.get(i+4));
						i = i + 4;
						disablesc = false;
					}
				}else if(contadorSauceda == 5 && disablesc && sabado){
					if(strings.get(i).contains("Sauceda")){
						st2 = Double.parseDouble(strings.get(i+1));
						ss2 = strings.get(i+2);
						sc2 = Double.parseDouble(strings.get(i+3));
						sp2 = Double.parseDouble(strings.get(i+4));
						t15 = Double.parseDouble(strings.get(i+7)); 
						s15 = Double.parseDouble(strings.get(i+8));
						c15 = Double.parseDouble(strings.get(i+9));
						p15 = Double.parseDouble(strings.get(i+10));
						i = i + 10;
						disablesc = false;
					}
				}else if(contadorSauceda == 7 && disablePsc && sabado){
					if(strings.get(i).contains("Sauceda")){
						polloQuedaronSauceda = Double.parseDouble(strings.get(i+1));
						papaQuedaronSauceda = Double.parseDouble(strings.get(i+2));
						i = i + 2;
						disablePsc = false;
					}
				}if(contadorCondesa == 4 && disablecd && sabado){
					if(strings.get(i).contains("Condesa")){
						ct = Double.parseDouble(strings.get(i+1));
						cs = Double.parseDouble(strings.get(i+2));
						cc = strings.get(i+3);
						cp = Double.parseDouble(strings.get(i+4));
						i = i + 4;
						disablecd = false;
					}
				}else if(contadorCondesa == 5 && disablecd && sabado){
					if(strings.get(i).contains("Condesa")){
						ct2 = Double.parseDouble(strings.get(i+1));
						cs2 = Double.parseDouble(strings.get(i+2));
						cc2 = strings.get(i+3);
						cp2 = Double.parseDouble(strings.get(i+4));
						i = i + 4;
						disablecd = false;
					}
				}else if(contadorCondesa == 7 && disablePcd && sabado){
					if(strings.get(i).contains("Condesa")){
						polloQuedaronCondesa = Double.parseDouble(strings.get(i+1));
						papaQuedaronCondesa = Double.parseDouble(strings.get(i+2));
						i = i + 2;
						disablePcd = false;
					}
				}if(contadorPanteones == 4 && disablepn && sabado){
					if(strings.get(i).contains("Panteones")){
						pt = Double.parseDouble(strings.get(i+1));
						ps = Double.parseDouble(strings.get(i+2));
						pc = Double.parseDouble(strings.get(i+3));
						pp = strings.get(i+4);
						i = i + 4;
						disablepn = false;
					}
				}else if(contadorPanteones == 5 && disablepn && sabado){
					if(strings.get(i).contains("Panteones")){
						pt2 = Double.parseDouble(strings.get(i+1));
						ps2 = Double.parseDouble(strings.get(i+2));
						pc2 = Double.parseDouble(strings.get(i+3));
						pp2 = strings.get(i+4);
						t5 = Double.parseDouble(strings.get(i+7)); 
						s5 = Double.parseDouble(strings.get(i+8));
						c5 = Double.parseDouble(strings.get(i+9));
						p5 = Double.parseDouble(strings.get(i+10));
						i = i + 10;
						disablepn = false;
					}
				}else if(contadorPanteones == 7 && disablePpn && sabado){
					if(strings.get(i).contains("Panteones")){
						polloQuedaronPanteones = Double.parseDouble(strings.get(i+1));
						papaQuedaronPanteones = Double.parseDouble(strings.get(i+2));
						i = i + 2;
						disablePpn = false;
					}
				}if(contadorTresCruces == 4 && disabletc && domingo){
					if(strings.get(i).contains("Tres Cruces")){
						tt3 = strings.get(i+1);
						ts3 = Double.parseDouble(strings.get(i+2));
						tc3 = Double.parseDouble(strings.get(i+3));
						tp3 = Double.parseDouble(strings.get(i+4));
						i = i + 4;
						disabletc = false;
					}
				}else if(contadorTresCruces == 5 && disabletc && domingo){
					if(strings.get(i).contains("Tres Cruces")){
						tt4 = strings.get(i+1);
						ts4 = Double.parseDouble(strings.get(i+2));
						tc4 = Double.parseDouble(strings.get(i+3));
						tp4 = Double.parseDouble(strings.get(i+4));
						t21 = Double.parseDouble(strings.get(i+7)); 
						s21 = Double.parseDouble(strings.get(i+8));
						c21 = Double.parseDouble(strings.get(i+9));
						p21 = Double.parseDouble(strings.get(i+10));
						i = i + 10;
						disabletc = false;
					}
				}else if(contadorTresCruces == 7 && disablePtc && domingo){
					if(strings.get(i).contains("Tres Cruces")){
						polloQuedaronTresCrucesD = Double.parseDouble(strings.get(i+1));
						papaQuedaronTresCrucesD = Double.parseDouble(strings.get(i+2));
						i = i + 2;
						disablePtc = false;
					}
				}if(contadorSauceda == 4 && disablesc && domingo){
					if(strings.get(i).contains("Sauceda")){
						st3 = Double.parseDouble(strings.get(i+1));
						ss3 = strings.get(i+2);
						sc3 = Double.parseDouble(strings.get(i+3));
						sp3 = Double.parseDouble(strings.get(i+4));
						i = i + 4;
						disablesc = false;
					}
				}else if(contadorSauceda == 5 && disablesc && domingo){
					if(strings.get(i).contains("Sauceda")){
						st4 = Double.parseDouble(strings.get(i+1));
						ss4 = strings.get(i+2);
						sc4 = Double.parseDouble(strings.get(i+3));
						sp4 = Double.parseDouble(strings.get(i+4));
						t151 = Double.parseDouble(strings.get(i+7)); 
						s151 = Double.parseDouble(strings.get(i+8));
						c151 = Double.parseDouble(strings.get(i+9));
						p151 = Double.parseDouble(strings.get(i+10));
						i = i + 10;
						disablesc = false;
					}
				}else if(contadorSauceda == 7 && disablePsc && domingo){
					if(strings.get(i).contains("Sauceda")){
						polloQuedaronSaucedaD = Double.parseDouble(strings.get(i+1));
						papaQuedaronSaucedaD = Double.parseDouble(strings.get(i+2));
						i = i + 2;
						disablePsc = false;
					}
				}if(contadorCondesa == 4 && disablecd && domingo){
					if(strings.get(i).contains("Condesa")){
						ct3 = Double.parseDouble(strings.get(i+1));
						cs3 = Double.parseDouble(strings.get(i+2));
						cc3 = strings.get(i+3);
						cp3 = Double.parseDouble(strings.get(i+4));
						i = i + 4;
						disablecd = false;
					}
				}else if(contadorCondesa == 5 && disablecd && domingo){
					if(strings.get(i).contains("Condesa")){
						ct4 = Double.parseDouble(strings.get(i+1));
						cs4 = Double.parseDouble(strings.get(i+2));
						cc4 = strings.get(i+3);
						cp4 = Double.parseDouble(strings.get(i+4));
						i = i + 4;
						disablecd = false;
					}
				}else if(contadorCondesa == 7 && disablePcd && domingo){
					if(strings.get(i).contains("Condesa")){
						polloQuedaronCondesaD = Double.parseDouble(strings.get(i+1));
						papaQuedaronCondesaD = Double.parseDouble(strings.get(i+2));
						i = i + 2;
						disablePcd = false;
					}
				}if(contadorPanteones == 4 && disablepn && domingo){
					if(strings.get(i).contains("Panteones")){
						pt3 = Double.parseDouble(strings.get(i+1));
						ps3 = Double.parseDouble(strings.get(i+2));
						pc3 = Double.parseDouble(strings.get(i+3));
						pp3 = strings.get(i+4);
						i = i + 4;
						disablepn = false;
					}
				}else if(contadorPanteones == 5 && disablepn && domingo){
					if(strings.get(i).contains("Panteones")){
						pt4 = Double.parseDouble(strings.get(i+1));
						ps4 = Double.parseDouble(strings.get(i+2));
						pc4 = Double.parseDouble(strings.get(i+3));
						pp4 = strings.get(i+4);
						t51 = Double.parseDouble(strings.get(i+7)); 
						s51 = Double.parseDouble(strings.get(i+8));
						c51 = Double.parseDouble(strings.get(i+9));
						p51 = Double.parseDouble(strings.get(i+10));
						i = i + 10;
						disablepn = false;
					}
				}else if(contadorPanteones == 7 && disablePpn && domingo){
					if(strings.get(i).contains("Panteones")){
						polloQuedaronPanteonesD = Double.parseDouble(strings.get(i+1));
						papaQuedaronPanteonesD = Double.parseDouble(strings.get(i+2));
						i = i + 2;
						disablePpn = false;
					}
				}
			}
        }
	}
	
	public List<TablaGenerica> getGastos() {
		return gastos;
	}

	public void setGastos(List<TablaGenerica> gastos) {
		this.gastos = gastos;
	}

	public List<TablaGenerica> getSueldos() {
		return sueldos;
	}

	public void setSueldos(List<TablaGenerica> sueldos) {
		this.sueldos = sueldos;
	}

	public void setContenidoExcel(String contenidoExcel) {
		this.contenidoExcel = contenidoExcel;
	}

	public String getContenidoExcel() {
		return contenidoExcel;
	}

	public Integer getContadorTresCruces() {
		return contadorTresCruces;
	}

	public void setContadorTresCruces(Integer contadorTresCruces) {
		this.contadorTresCruces = contadorTresCruces;
	}

	public Integer getContadorPanteones() {
		return contadorPanteones;
	}

	public void setContadorPanteones(Integer contadorPanteones) {
		this.contadorPanteones = contadorPanteones;
	}

	public Integer getContadorCondesa() {
		return contadorCondesa;
	}

	public void setContadorCondesa(Integer contadorCondesa) {
		this.contadorCondesa = contadorCondesa;
	}

	public Integer getContadorSauceda() {
		return contadorSauceda;
	}

	public void setContadorSauceda(Integer contadorSauceda) {
		this.contadorSauceda = contadorSauceda;
	}

	public String getTt() {
		return tt;
	}

	public void setTt(String tt) {
		this.tt = tt;
	}

	public Double getTp() {
		return tp;
	}

	public void setTp(Double tp) {
		this.tp = tp;
	}

	public Double getTc() {
		return tc;
	}

	public void setTc(Double tc) {
		this.tc = tc;
	}

	public Double getTs() {
		return ts;
	}

	public void setTs(Double ts) {
		this.ts = ts;
	}

	public String getPp() {
		return pp;
	}

	public void setPp(String pp) {
		this.pp = pp;
	}

	public Double getPt() {
		return pt;
	}

	public void setPt(Double pt) {
		this.pt = pt;
	}

	public Double getPc() {
		return pc;
	}

	public void setPc(Double pc) {
		this.pc = pc;
	}

	public Double getPs() {
		return ps;
	}

	public void setPs(Double ps) {
		this.ps = ps;
	}

	public String getCc() {
		return cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}

	public Double getCt() {
		return ct;
	}

	public void setCt(Double ct) {
		this.ct = ct;
	}

	public Double getCp() {
		return cp;
	}

	public void setCp(Double cp) {
		this.cp = cp;
	}

	public Double getCs() {
		return cs;
	}

	public void setCs(Double cs) {
		this.cs = cs;
	}

	public String getSs() {
		return ss;
	}

	public void setSs(String ss) {
		this.ss = ss;
	}

	public Double getSt() {
		return st;
	}

	public void setSt(Double st) {
		this.st = st;
	}

	public Double getSp() {
		return sp;
	}

	public void setSp(Double sp) {
		this.sp = sp;
	}

	public Double getSc() {
		return sc;
	}

	public void setSc(Double sc) {
		this.sc = sc;
	}

	public String getTt2() {
		return tt2;
	}

	public void setTt2(String tt2) {
		this.tt2 = tt2;
	}

	public Double getTp2() {
		return tp2;
	}

	public void setTp2(Double tp2) {
		this.tp2 = tp2;
	}

	public Double getTc2() {
		return tc2;
	}

	public void setTc2(Double tc2) {
		this.tc2 = tc2;
	}

	public Double getTs2() {
		return ts2;
	}

	public void setTs2(Double ts2) {
		this.ts2 = ts2;
	}

	public String getPp2() {
		return pp2;
	}

	public void setPp2(String pp2) {
		this.pp2 = pp2;
	}

	public Double getPt2() {
		return pt2;
	}

	public void setPt2(Double pt2) {
		this.pt2 = pt2;
	}

	public Double getPc2() {
		return pc2;
	}

	public void setPc2(Double pc2) {
		this.pc2 = pc2;
	}

	public Double getPs2() {
		return ps2;
	}

	public void setPs2(Double ps2) {
		this.ps2 = ps2;
	}

	public String getCc2() {
		return cc2;
	}

	public void setCc2(String cc2) {
		this.cc2 = cc2;
	}

	public Double getCt2() {
		return ct2;
	}

	public void setCt2(Double ct2) {
		this.ct2 = ct2;
	}

	public Double getCp2() {
		return cp2;
	}

	public void setCp2(Double cp2) {
		this.cp2 = cp2;
	}

	public Double getCs2() {
		return cs2;
	}

	public void setCs2(Double cs2) {
		this.cs2 = cs2;
	}

	public String getSs2() {
		return ss2;
	}

	public void setSs2(String ss2) {
		this.ss2 = ss2;
	}

	public Double getSt2() {
		return st2;
	}

	public void setSt2(Double st2) {
		this.st2 = st2;
	}

	public Double getSp2() {
		return sp2;
	}

	public void setSp2(Double sp2) {
		this.sp2 = sp2;
	}

	public Double getSc2() {
		return sc2;
	}

	public void setSc2(Double sc2) {
		this.sc2 = sc2;
	}

	public String getTt3() {
		return tt3;
	}

	public void setTt3(String tt3) {
		this.tt3 = tt3;
	}

	public Double getTp3() {
		return tp3;
	}

	public void setTp3(Double tp3) {
		this.tp3 = tp3;
	}

	public Double getTc3() {
		return tc3;
	}

	public void setTc3(Double tc3) {
		this.tc3 = tc3;
	}

	public Double getTs3() {
		return ts3;
	}

	public void setTs3(Double ts3) {
		this.ts3 = ts3;
	}

	public String getPp3() {
		return pp3;
	}

	public void setPp3(String pp3) {
		this.pp3 = pp3;
	}

	public Double getPt3() {
		return pt3;
	}

	public void setPt3(Double pt3) {
		this.pt3 = pt3;
	}

	public Double getPc3() {
		return pc3;
	}

	public void setPc3(Double pc3) {
		this.pc3 = pc3;
	}

	public Double getPs3() {
		return ps3;
	}

	public void setPs3(Double ps3) {
		this.ps3 = ps3;
	}

	public String getCc3() {
		return cc3;
	}

	public void setCc3(String cc3) {
		this.cc3 = cc3;
	}

	public Double getCt3() {
		return ct3;
	}

	public void setCt3(Double ct3) {
		this.ct3 = ct3;
	}

	public Double getCp3() {
		return cp3;
	}

	public void setCp3(Double cp3) {
		this.cp3 = cp3;
	}

	public Double getCs3() {
		return cs3;
	}

	public void setCs3(Double cs3) {
		this.cs3 = cs3;
	}

	public String getSs3() {
		return ss3;
	}

	public void setSs3(String ss3) {
		this.ss3 = ss3;
	}

	public Double getSt3() {
		return st3;
	}

	public void setSt3(Double st3) {
		this.st3 = st3;
	}

	public Double getSp3() {
		return sp3;
	}

	public void setSp3(Double sp3) {
		this.sp3 = sp3;
	}

	public Double getSc3() {
		return sc3;
	}

	public void setSc3(Double sc3) {
		this.sc3 = sc3;
	}

	public String getTt4() {
		return tt4;
	}

	public void setTt4(String tt4) {
		this.tt4 = tt4;
	}

	public Double getTp4() {
		return tp4;
	}

	public void setTp4(Double tp4) {
		this.tp4 = tp4;
	}

	public Double getTc4() {
		return tc4;
	}

	public void setTc4(Double tc4) {
		this.tc4 = tc4;
	}

	public Double getTs4() {
		return ts4;
	}

	public void setTs4(Double ts4) {
		this.ts4 = ts4;
	}

	public String getPp4() {
		return pp4;
	}

	public void setPp4(String pp4) {
		this.pp4 = pp4;
	}

	public Double getPt4() {
		return pt4;
	}

	public void setPt4(Double pt4) {
		this.pt4 = pt4;
	}

	public Double getPc4() {
		return pc4;
	}

	public void setPc4(Double pc4) {
		this.pc4 = pc4;
	}

	public Double getPs4() {
		return ps4;
	}

	public void setPs4(Double ps4) {
		this.ps4 = ps4;
	}

	public String getCc4() {
		return cc4;
	}

	public void setCc4(String cc4) {
		this.cc4 = cc4;
	}

	public Double getCt4() {
		return ct4;
	}

	public void setCt4(Double ct4) {
		this.ct4 = ct4;
	}

	public Double getCp4() {
		return cp4;
	}

	public void setCp4(Double cp4) {
		this.cp4 = cp4;
	}

	public Double getCs4() {
		return cs4;
	}

	public void setCs4(Double cs4) {
		this.cs4 = cs4;
	}

	public String getSs4() {
		return ss4;
	}

	public void setSs4(String ss4) {
		this.ss4 = ss4;
	}

	public Double getSt4() {
		return st4;
	}

	public void setSt4(Double st4) {
		this.st4 = st4;
	}

	public Double getSp4() {
		return sp4;
	}

	public void setSp4(Double sp4) {
		this.sp4 = sp4;
	}

	public Double getSc4() {
		return sc4;
	}

	public void setSc4(Double sc4) {
		this.sc4 = sc4;
	}

	public Double getT2() {
		return t2;
	}

	public void setT2(Double t2) {
		this.t2 = t2;
	}

	public Double getP2() {
		return p2;
	}

	public void setP2(Double p2) {
		this.p2 = p2;
	}

	public Double getC2() {
		return c2;
	}

	public void setC2(Double c2) {
		this.c2 = c2;
	}

	public Double getS2() {
		return s2;
	}

	public void setS2(Double s2) {
		this.s2 = s2;
	}

	public Double getT15() {
		return t15;
	}

	public void setT15(Double t15) {
		this.t15 = t15;
	}

	public Double getP15() {
		return p15;
	}

	public void setP15(Double p15) {
		this.p15 = p15;
	}

	public Double getC15() {
		return c15;
	}

	public void setC15(Double c15) {
		this.c15 = c15;
	}

	public Double getS15() {
		return s15;
	}

	public void setS15(Double s15) {
		this.s15 = s15;
	}

	public Double getT5() {
		return t5;
	}

	public void setT5(Double t5) {
		this.t5 = t5;
	}

	public Double getP5() {
		return p5;
	}

	public void setP5(Double p5) {
		this.p5 = p5;
	}

	public Double getC5() {
		return c5;
	}

	public void setC5(Double c5) {
		this.c5 = c5;
	}

	public Double getS5() {
		return s5;
	}

	public void setS5(Double s5) {
		this.s5 = s5;
	}

	public Double getT21() {
		return t21;
	}

	public void setT21(Double t21) {
		this.t21 = t21;
	}

	public Double getP21() {
		return p21;
	}

	public void setP21(Double p21) {
		this.p21 = p21;
	}

	public Double getC21() {
		return c21;
	}

	public void setC21(Double c21) {
		this.c21 = c21;
	}

	public Double getS21() {
		return s21;
	}

	public void setS21(Double s21) {
		this.s21 = s21;
	}

	public Double getT151() {
		return t151;
	}

	public void setT151(Double t151) {
		this.t151 = t151;
	}

	public Double getP151() {
		return p151;
	}

	public void setP151(Double p151) {
		this.p151 = p151;
	}

	public Double getC151() {
		return c151;
	}

	public void setC151(Double c151) {
		this.c151 = c151;
	}

	public Double getS151() {
		return s151;
	}

	public void setS151(Double s151) {
		this.s151 = s151;
	}

	public Double getT51() {
		return t51;
	}

	public void setT51(Double t51) {
		this.t51 = t51;
	}

	public Double getP51() {
		return p51;
	}

	public void setP51(Double p51) {
		this.p51 = p51;
	}

	public Double getC51() {
		return c51;
	}

	public void setC51(Double c51) {
		this.c51 = c51;
	}

	public Double getS51() {
		return s51;
	}

	public void setS51(Double s51) {
		this.s51 = s51;
	}

	public Double getPollosTresCruces() {
		return pollosTresCruces;
	}

	public void setPollosTresCruces(Double pollosTresCruces) {
		this.pollosTresCruces = pollosTresCruces;
	}

	public Double getPollosSauceda() {
		return pollosSauceda;
	}

	public void setPollosSauceda(Double pollosSauceda) {
		this.pollosSauceda = pollosSauceda;
	}

	public Double getPollosCondesa() {
		return pollosCondesa;
	}

	public void setPollosCondesa(Double pollosCondesa) {
		this.pollosCondesa = pollosCondesa;
	}

	public Double getPollosPanteones() {
		return pollosPanteones;
	}

	public void setPollosPanteones(Double pollosPanteones) {
		this.pollosPanteones = pollosPanteones;
	}

	public Double getPapasTresCruces() {
		return papasTresCruces;
	}

	public void setPapasTresCruces(Double papasTresCruces) {
		this.papasTresCruces = papasTresCruces;
	}

	public Double getPapasSauceda() {
		return papasSauceda;
	}

	public void setPapasSauceda(Double papasSauceda) {
		this.papasSauceda = papasSauceda;
	}

	public Double getPapasCondesa() {
		return papasCondesa;
	}

	public void setPapasCondesa(Double papasCondesa) {
		this.papasCondesa = papasCondesa;
	}

	public Double getPapasPanteones() {
		return papasPanteones;
	}

	public void setPapasPanteones(Double papasPanteones) {
		this.papasPanteones = papasPanteones;
	}

	public Double getPollosMovTresCruces() {
		return pollosMovTresCruces;
	}

	public void setPollosMovTresCruces(Double pollosMovTresCruces) {
		this.pollosMovTresCruces = pollosMovTresCruces;
	}

	public Double getPollosMovSauceda() {
		return pollosMovSauceda;
	}

	public void setPollosMovSauceda(Double pollosMovSauceda) {
		this.pollosMovSauceda = pollosMovSauceda;
	}

	public Double getPollosMovCondesa() {
		return pollosMovCondesa;
	}

	public void setPollosMovCondesa(Double pollosMovCondesa) {
		this.pollosMovCondesa = pollosMovCondesa;
	}

	public Double getPollosMovPanteones() {
		return pollosMovPanteones;
	}

	public void setPollosMovPanteones(Double pollosMovPanteones) {
		this.pollosMovPanteones = pollosMovPanteones;
	}

	public Double getPapasMovTresCruces() {
		return papasMovTresCruces;
	}

	public void setPapasMovTresCruces(Double papasMovTresCruces) {
		this.papasMovTresCruces = papasMovTresCruces;
	}

	public Double getPapasMovSauceda() {
		return papasMovSauceda;
	}

	public void setPapasMovSauceda(Double papasMovSauceda) {
		this.papasMovSauceda = papasMovSauceda;
	}

	public Double getPapasMovCondesa() {
		return papasMovCondesa;
	}

	public void setPapasMovCondesa(Double papasMovCondesa) {
		this.papasMovCondesa = papasMovCondesa;
	}

	public Double getPapasMovPanteones() {
		return papasMovPanteones;
	}

	public void setPapasMovPanteones(Double papasMovPanteones) {
		this.papasMovPanteones = papasMovPanteones;
	}

	public Double getPollosTresCrucesD() {
		return pollosTresCrucesD;
	}

	public void setPollosTresCrucesD(Double pollosTresCrucesD) {
		this.pollosTresCrucesD = pollosTresCrucesD;
	}

	public Double getPollosSaucedaD() {
		return pollosSaucedaD;
	}

	public void setPollosSaucedaD(Double pollosSaucedaD) {
		this.pollosSaucedaD = pollosSaucedaD;
	}

	public Double getPollosCondesaD() {
		return pollosCondesaD;
	}

	public void setPollosCondesaD(Double pollosCondesaD) {
		this.pollosCondesaD = pollosCondesaD;
	}

	public Double getPollosPanteonesD() {
		return pollosPanteonesD;
	}

	public void setPollosPanteonesD(Double pollosPanteonesD) {
		this.pollosPanteonesD = pollosPanteonesD;
	}

	public Double getPapasTresCrucesD() {
		return papasTresCrucesD;
	}

	public void setPapasTresCrucesD(Double papasTresCrucesD) {
		this.papasTresCrucesD = papasTresCrucesD;
	}

	public Double getPapasSaucedaD() {
		return papasSaucedaD;
	}

	public void setPapasSaucedaD(Double papasSaucedaD) {
		this.papasSaucedaD = papasSaucedaD;
	}

	public Double getPapasCondesaD() {
		return papasCondesaD;
	}

	public void setPapasCondesaD(Double papasCondesaD) {
		this.papasCondesaD = papasCondesaD;
	}

	public Double getPapasPanteonesD() {
		return papasPanteonesD;
	}

	public void setPapasPanteonesD(Double papasPanteonesD) {
		this.papasPanteonesD = papasPanteonesD;
	}

	public Double getPollosMovTresCrucesD() {
		return pollosMovTresCrucesD;
	}

	public void setPollosMovTresCrucesD(Double pollosMovTresCrucesD) {
		this.pollosMovTresCrucesD = pollosMovTresCrucesD;
	}

	public Double getPollosMovSaucedaD() {
		return pollosMovSaucedaD;
	}

	public void setPollosMovSaucedaD(Double pollosMovSaucedaD) {
		this.pollosMovSaucedaD = pollosMovSaucedaD;
	}

	public Double getPollosMovCondesaD() {
		return pollosMovCondesaD;
	}

	public void setPollosMovCondesaD(Double pollosMovCondesaD) {
		this.pollosMovCondesaD = pollosMovCondesaD;
	}

	public Double getPollosMovPanteonesD() {
		return pollosMovPanteonesD;
	}

	public void setPollosMovPanteonesD(Double pollosMovPanteonesD) {
		this.pollosMovPanteonesD = pollosMovPanteonesD;
	}

	public Double getPapasMovTresCrucesD() {
		return papasMovTresCrucesD;
	}

	public void setPapasMovTresCrucesD(Double papasMovTresCrucesD) {
		this.papasMovTresCrucesD = papasMovTresCrucesD;
	}

	public Double getPapasMovSaucedaD() {
		return papasMovSaucedaD;
	}

	public void setPapasMovSaucedaD(Double papasMovSaucedaD) {
		this.papasMovSaucedaD = papasMovSaucedaD;
	}

	public Double getPapasMovCondesaD() {
		return papasMovCondesaD;
	}

	public void setPapasMovCondesaD(Double papasMovCondesaD) {
		this.papasMovCondesaD = papasMovCondesaD;
	}

	public Double getPapasMovPanteonesD() {
		return papasMovPanteonesD;
	}

	public void setPapasMovPanteonesD(Double papasMovPanteonesD) {
		this.papasMovPanteonesD = papasMovPanteonesD;
	}

	public Double getVentaPollosTresCruces() {
		return ventaPollosTresCruces;
	}

	public void setVentaPollosTresCruces(Double ventaPollosTresCruces) {
		this.ventaPollosTresCruces = ventaPollosTresCruces;
	}

	public Double getVentaPollosSauceda() {
		return ventaPollosSauceda;
	}

	public void setVentaPollosSauceda(Double ventaPollosSauceda) {
		this.ventaPollosSauceda = ventaPollosSauceda;
	}

	public Double getVentaPollosCondesa() {
		return ventaPollosCondesa;
	}

	public void setVentaPollosCondesa(Double ventaPollosCondesa) {
		this.ventaPollosCondesa = ventaPollosCondesa;
	}

	public Double getVentaPollosPanteones() {
		return ventaPollosPanteones;
	}

	public void setVentaPollosPanteones(Double ventaPollosPanteones) {
		this.ventaPollosPanteones = ventaPollosPanteones;
	}

	public Double getVentaPollosTresCrucesD() {
		return ventaPollosTresCrucesD;
	}

	public void setVentaPollosTresCrucesD(Double ventaPollosTresCrucesD) {
		this.ventaPollosTresCrucesD = ventaPollosTresCrucesD;
	}

	public Double getVentaPollosSaucedaD() {
		return ventaPollosSaucedaD;
	}

	public void setVentaPollosSaucedaD(Double ventaPollosSaucedaD) {
		this.ventaPollosSaucedaD = ventaPollosSaucedaD;
	}

	public Double getVentaPollosCondesaD() {
		return ventaPollosCondesaD;
	}

	public void setVentaPollosCondesaD(Double ventaPollosCondesaD) {
		this.ventaPollosCondesaD = ventaPollosCondesaD;
	}

	public Double getVentaPollosPanteonesD() {
		return ventaPollosPanteonesD;
	}

	public void setVentaPollosPanteonesD(Double ventaPollosPanteonesD) {
		this.ventaPollosPanteonesD = ventaPollosPanteonesD;
	}

	public Double getVentaPapasTresCruces() {
		return ventaPapasTresCruces;
	}

	public void setVentaPapasTresCruces(Double ventaPapasTresCruces) {
		this.ventaPapasTresCruces = ventaPapasTresCruces;
	}

	public Double getVentaPapasSauceda() {
		return ventaPapasSauceda;
	}

	public void setVentaPapasSauceda(Double ventaPapasSauceda) {
		this.ventaPapasSauceda = ventaPapasSauceda;
	}

	public Double getVentaPapasCondesa() {
		return ventaPapasCondesa;
	}

	public void setVentaPapasCondesa(Double ventaPapasCondesa) {
		this.ventaPapasCondesa = ventaPapasCondesa;
	}

	public Double getVentaPapasPanteones() {
		return ventaPapasPanteones;
	}

	public void setVentaPapasPanteones(Double ventaPapasPanteones) {
		this.ventaPapasPanteones = ventaPapasPanteones;
	}

	public Double getVentaPapasTresCrucesD() {
		return ventaPapasTresCrucesD;
	}

	public void setVentaPapasTresCrucesD(Double ventaPapasTresCrucesD) {
		this.ventaPapasTresCrucesD = ventaPapasTresCrucesD;
	}

	public Double getVentaPapasSaucedaD() {
		return ventaPapasSaucedaD;
	}

	public void setVentaPapasSaucedaD(Double ventaPapasSaucedaD) {
		this.ventaPapasSaucedaD = ventaPapasSaucedaD;
	}

	public Double getVentaPapasCondesaD() {
		return ventaPapasCondesaD;
	}

	public void setVentaPapasCondesaD(Double ventaPapasCondesaD) {
		this.ventaPapasCondesaD = ventaPapasCondesaD;
	}

	public Double getVentaPapasPanteonesD() {
		return ventaPapasPanteonesD;
	}

	public void setVentaPapasPanteonesD(Double ventaPapasPanteonesD) {
		this.ventaPapasPanteonesD = ventaPapasPanteonesD;
	}

	public Double getVentaTresCruces() {
		return ventaTresCruces;
	}

	public void setVentaTresCruces(Double ventaTresCruces) {
		this.ventaTresCruces = ventaTresCruces;
	}

	public Double getVentaSauceda() {
		return ventaSauceda;
	}

	public void setVentaSauceda(Double ventaSauceda) {
		this.ventaSauceda = ventaSauceda;
	}

	public Double getVentaCondesa() {
		return ventaCondesa;
	}

	public void setVentaCondesa(Double ventaCondesa) {
		this.ventaCondesa = ventaCondesa;
	}

	public Double getVentaPanteones() {
		return ventaPanteones;
	}

	public void setVentaPanteones(Double ventaPanteones) {
		this.ventaPanteones = ventaPanteones;
	}

	public Double getVentaTresCrucesD() {
		return ventaTresCrucesD;
	}

	public void setVentaTresCrucesD(Double ventaTresCrucesD) {
		this.ventaTresCrucesD = ventaTresCrucesD;
	}

	public Double getVentaSaucedaD() {
		return ventaSaucedaD;
	}

	public void setVentaSaucedaD(Double ventaSaucedaD) {
		this.ventaSaucedaD = ventaSaucedaD;
	}

	public Double getVentaCondesaD() {
		return ventaCondesaD;
	}

	public void setVentaCondesaD(Double ventaCondesaD) {
		this.ventaCondesaD = ventaCondesaD;
	}

	public Double getVentaPanteonesD() {
		return ventaPanteonesD;
	}

	public void setVentaPanteonesD(Double ventaPanteonesD) {
		this.ventaPanteonesD = ventaPanteonesD;
	}

	public Double getMaletinTresCruces() {
		return maletinTresCruces;
	}

	public void setMaletinTresCruces(Double maletinTresCruces) {
		this.maletinTresCruces = maletinTresCruces;
	}

	public Double getMaletinSauceda() {
		return maletinSauceda;
	}

	public void setMaletinSauceda(Double maletinSauceda) {
		this.maletinSauceda = maletinSauceda;
	}

	public Double getMaletinCondesa() {
		return maletinCondesa;
	}

	public void setMaletinCondesa(Double maletinCondesa) {
		this.maletinCondesa = maletinCondesa;
	}

	public Double getMaletinPanteones() {
		return maletinPanteones;
	}

	public void setMaletinPanteones(Double maletinPanteones) {
		this.maletinPanteones = maletinPanteones;
	}

	public Double getMaletinTresCrucesD() {
		return maletinTresCrucesD;
	}

	public void setMaletinTresCrucesD(Double maletinTresCrucesD) {
		this.maletinTresCrucesD = maletinTresCrucesD;
	}

	public Double getMaletinSaucedaD() {
		return maletinSaucedaD;
	}

	public void setMaletinSaucedaD(Double maletinSaucedaD) {
		this.maletinSaucedaD = maletinSaucedaD;
	}

	public Double getMaletinCondesaD() {
		return maletinCondesaD;
	}

	public void setMaletinCondesaD(Double maletinCondesaD) {
		this.maletinCondesaD = maletinCondesaD;
	}

	public Double getMaletinPanteonesD() {
		return maletinPanteonesD;
	}

	public void setMaletinPanteonesD(Double maletinPanteonesD) {
		this.maletinPanteonesD = maletinPanteonesD;
	}

	public Double getComidaTresCruces() {
		return comidaTresCruces;
	}

	public void setComidaTresCruces(Double comidaTresCruces) {
		this.comidaTresCruces = comidaTresCruces;
	}

	public Double getComidaPanteones() {
		return comidaPanteones;
	}

	public void setComidaPanteones(Double comidaPanteones) {
		this.comidaPanteones = comidaPanteones;
	}

	public Double getComidaCondesa() {
		return comidaCondesa;
	}

	public void setComidaCondesa(Double comidaCondesa) {
		this.comidaCondesa = comidaCondesa;
	}

	public Double getComidaSauceda() {
		return comidaSauceda;
	}

	public void setComidaSauceda(Double comidaSauceda) {
		this.comidaSauceda = comidaSauceda;
	}

	public Double getComidaTresCrucesD() {
		return comidaTresCrucesD;
	}

	public void setComidaTresCrucesD(Double comidaTresCrucesD) {
		this.comidaTresCrucesD = comidaTresCrucesD;
	}

	public Double getComidaPanteonesD() {
		return comidaPanteonesD;
	}

	public void setComidaPanteonesD(Double comidaPanteonesD) {
		this.comidaPanteonesD = comidaPanteonesD;
	}

	public Double getComidaCondesaD() {
		return comidaCondesaD;
	}

	public void setComidaCondesaD(Double comidaCondesaD) {
		this.comidaCondesaD = comidaCondesaD;
	}

	public Double getComidaSaucedaD() {
		return comidaSaucedaD;
	}

	public void setComidaSaucedaD(Double comidaSaucedaD) {
		this.comidaSaucedaD = comidaSaucedaD;
	}

	public Double getRefrescoTresCruces() {
		return refrescoTresCruces;
	}

	public void setRefrescoTresCruces(Double refrescoTresCruces) {
		this.refrescoTresCruces = refrescoTresCruces;
	}

	public Double getRefrescoPanteones() {
		return refrescoPanteones;
	}

	public void setRefrescoPanteones(Double refrescoPanteones) {
		this.refrescoPanteones = refrescoPanteones;
	}

	public Double getRefrescoCondesa() {
		return refrescoCondesa;
	}

	public void setRefrescoCondesa(Double refrescoCondesa) {
		this.refrescoCondesa = refrescoCondesa;
	}

	public Double getRefrescoSauceda() {
		return refrescoSauceda;
	}

	public void setRefrescoSauceda(Double refrescoSauceda) {
		this.refrescoSauceda = refrescoSauceda;
	}

	public Double getRefrescoTresCrucesD() {
		return refrescoTresCrucesD;
	}

	public void setRefrescoTresCrucesD(Double refrescoTresCrucesD) {
		this.refrescoTresCrucesD = refrescoTresCrucesD;
	}

	public Double getRefrescoPanteonesD() {
		return refrescoPanteonesD;
	}

	public void setRefrescoPanteonesD(Double refrescoPanteonesD) {
		this.refrescoPanteonesD = refrescoPanteonesD;
	}

	public Double getRefrescoCondesaD() {
		return refrescoCondesaD;
	}

	public void setRefrescoCondesaD(Double refrescoCondesaD) {
		this.refrescoCondesaD = refrescoCondesaD;
	}

	public Double getRefrescoSaucedaD() {
		return refrescoSaucedaD;
	}

	public void setRefrescoSaucedaD(Double refrescoSaucedaD) {
		this.refrescoSaucedaD = refrescoSaucedaD;
	}

	public Double getPollosPiezasTresCruces() {
		return pollosPiezasTresCruces;
	}

	public void setPollosPiezasTresCruces(Double pollosPiezasTresCruces) {
		this.pollosPiezasTresCruces = pollosPiezasTresCruces;
	}

	public Double getPollosPiezasPanteones() {
		return pollosPiezasPanteones;
	}

	public void setPollosPiezasPanteones(Double pollosPiezasPanteones) {
		this.pollosPiezasPanteones = pollosPiezasPanteones;
	}

	public Double getPollosPiezasCondesa() {
		return pollosPiezasCondesa;
	}

	public void setPollosPiezasCondesa(Double pollosPiezasCondesa) {
		this.pollosPiezasCondesa = pollosPiezasCondesa;
	}

	public Double getPollosPiezasSauceda() {
		return pollosPiezasSauceda;
	}

	public void setPollosPiezasSauceda(Double pollosPiezasSauceda) {
		this.pollosPiezasSauceda = pollosPiezasSauceda;
	}

	public Double getPollosPiezasTresCrucesD() {
		return pollosPiezasTresCrucesD;
	}

	public void setPollosPiezasTresCrucesD(Double pollosPiezasTresCrucesD) {
		this.pollosPiezasTresCrucesD = pollosPiezasTresCrucesD;
	}

	public Double getPollosPiezasPanteonesD() {
		return pollosPiezasPanteonesD;
	}

	public void setPollosPiezasPanteonesD(Double pollosPiezasPanteonesD) {
		this.pollosPiezasPanteonesD = pollosPiezasPanteonesD;
	}

	public Double getPollosPiezasCondesaD() {
		return pollosPiezasCondesaD;
	}

	public void setPollosPiezasCondesaD(Double pollosPiezasCondesaD) {
		this.pollosPiezasCondesaD = pollosPiezasCondesaD;
	}

	public Double getPollosPiezasSaucedaD() {
		return pollosPiezasSaucedaD;
	}

	public void setPollosPiezasSaucedaD(Double pollosPiezasSaucedaD) {
		this.pollosPiezasSaucedaD = pollosPiezasSaucedaD;
	}

	public Double getDescuentosTresCruces() {
		return descuentosTresCruces;
	}

	public void setDescuentosTresCruces(Double descuentosTresCruces) {
		this.descuentosTresCruces = descuentosTresCruces;
	}

	public Double getDescuentosPanteones() {
		return descuentosPanteones;
	}

	public void setDescuentosPanteones(Double descuentosPanteones) {
		this.descuentosPanteones = descuentosPanteones;
	}

	public Double getDescuentosSauceda() {
		return descuentosSauceda;
	}

	public void setDescuentosSauceda(Double descuentosSauceda) {
		this.descuentosSauceda = descuentosSauceda;
	}

	public Double getDescuentosCondesa() {
		return descuentosCondesa;
	}

	public void setDescuentosCondesa(Double descuentosCondesa) {
		this.descuentosCondesa = descuentosCondesa;
	}

	public Double getDescuentosTresCrucesD() {
		return descuentosTresCrucesD;
	}

	public void setDescuentosTresCrucesD(Double descuentosTresCrucesD) {
		this.descuentosTresCrucesD = descuentosTresCrucesD;
	}

	public Double getDescuentosPanteonesD() {
		return descuentosPanteonesD;
	}

	public void setDescuentosPanteonesD(Double descuentosPanteonesD) {
		this.descuentosPanteonesD = descuentosPanteonesD;
	}

	public Double getDescuentosSaucedaD() {
		return descuentosSaucedaD;
	}

	public void setDescuentosSaucedaD(Double descuentosSaucedaD) {
		this.descuentosSaucedaD = descuentosSaucedaD;
	}

	public Double getDescuentosCondesaD() {
		return descuentosCondesaD;
	}

	public void setDescuentosCondesaD(Double descuentosCondesaD) {
		this.descuentosCondesaD = descuentosCondesaD;
	}

	public Double getPollosQuedaronTresCruces() {
		return pollosQuedaronTresCruces;
	}

	public void setPollosQuedaronTresCruces(Double pollosQuedaronTresCruces) {
		this.pollosQuedaronTresCruces = pollosQuedaronTresCruces;
	}

	public Double getPollosQuedaronCondesa() {
		return pollosQuedaronCondesa;
	}

	public void setPollosQuedaronCondesa(Double pollosQuedaronCondesa) {
		this.pollosQuedaronCondesa = pollosQuedaronCondesa;
	}

	public Double getPollosQuedaronSauceda() {
		return pollosQuedaronSauceda;
	}

	public void setPollosQuedaronSauceda(Double pollosQuedaronSauceda) {
		this.pollosQuedaronSauceda = pollosQuedaronSauceda;
	}

	public Double getPollosQuedaronPanteones() {
		return pollosQuedaronPanteones;
	}

	public void setPollosQuedaronPanteones(Double pollosQuedaronPanteones) {
		this.pollosQuedaronPanteones = pollosQuedaronPanteones;
	}

	public Double getPollosQuedaronTresCrucesD() {
		return pollosQuedaronTresCrucesD;
	}

	public void setPollosQuedaronTresCrucesD(Double pollosQuedaronTresCrucesD) {
		this.pollosQuedaronTresCrucesD = pollosQuedaronTresCrucesD;
	}

	public Double getPollosQuedaronCondesaD() {
		return pollosQuedaronCondesaD;
	}

	public void setPollosQuedaronCondesaD(Double pollosQuedaronCondesaD) {
		this.pollosQuedaronCondesaD = pollosQuedaronCondesaD;
	}

	public Double getPollosQuedaronSaucedaD() {
		return pollosQuedaronSaucedaD;
	}

	public void setPollosQuedaronSaucedaD(Double pollosQuedaronSaucedaD) {
		this.pollosQuedaronSaucedaD = pollosQuedaronSaucedaD;
	}

	public Double getPollosQuedaronPanteonesD() {
		return pollosQuedaronPanteonesD;
	}

	public void setPollosQuedaronPanteonesD(Double pollosQuedaronPanteonesD) {
		this.pollosQuedaronPanteonesD = pollosQuedaronPanteonesD;
	}

	public Double getPollosQuedaronDineroTresCruces() {
		return pollosQuedaronDineroTresCruces;
	}

	public void setPollosQuedaronDineroTresCruces(
			Double pollosQuedaronDineroTresCruces) {
		this.pollosQuedaronDineroTresCruces = pollosQuedaronDineroTresCruces;
	}

	public Double getPollosQuedaronDineroSauceda() {
		return pollosQuedaronDineroSauceda;
	}

	public void setPollosQuedaronDineroSauceda(Double pollosQuedaronDineroSauceda) {
		this.pollosQuedaronDineroSauceda = pollosQuedaronDineroSauceda;
	}

	public Double getPollosQuedaronDineroPanteones() {
		return pollosQuedaronDineroPanteones;
	}

	public void setPollosQuedaronDineroPanteones(
			Double pollosQuedaronDineroPanteones) {
		this.pollosQuedaronDineroPanteones = pollosQuedaronDineroPanteones;
	}

	public Double getPollosQuedaronDineroCondesa() {
		return pollosQuedaronDineroCondesa;
	}

	public void setPollosQuedaronDineroCondesa(Double pollosQuedaronDineroCondesa) {
		this.pollosQuedaronDineroCondesa = pollosQuedaronDineroCondesa;
	}

	public Double getPollosQuedaronDineroTresCrucesD() {
		return pollosQuedaronDineroTresCrucesD;
	}

	public void setPollosQuedaronDineroTresCrucesD(
			Double pollosQuedaronDineroTresCrucesD) {
		this.pollosQuedaronDineroTresCrucesD = pollosQuedaronDineroTresCrucesD;
	}

	public Double getPollosQuedaronDineroSaucedaD() {
		return pollosQuedaronDineroSaucedaD;
	}

	public void setPollosQuedaronDineroSaucedaD(Double pollosQuedaronDineroSaucedaD) {
		this.pollosQuedaronDineroSaucedaD = pollosQuedaronDineroSaucedaD;
	}

	public Double getPollosQuedaronDineroPanteonesD() {
		return pollosQuedaronDineroPanteonesD;
	}

	public void setPollosQuedaronDineroPanteonesD(
			Double pollosQuedaronDineroPanteonesD) {
		this.pollosQuedaronDineroPanteonesD = pollosQuedaronDineroPanteonesD;
	}

	public Double getPollosQuedaronDineroCondesaD() {
		return pollosQuedaronDineroCondesaD;
	}

	public void setPollosQuedaronDineroCondesaD(Double pollosQuedaronDineroCondesaD) {
		this.pollosQuedaronDineroCondesaD = pollosQuedaronDineroCondesaD;
	}

	public Double getOtrosGastosTresCruces() {
		return otrosGastosTresCruces;
	}

	public void setOtrosGastosTresCruces(Double otrosGastosTresCruces) {
		this.otrosGastosTresCruces = otrosGastosTresCruces;
	}

	public Double getOtrosGastosCondesa() {
		return otrosGastosCondesa;
	}

	public void setOtrosGastosCondesa(Double otrosGastosCondesa) {
		this.otrosGastosCondesa = otrosGastosCondesa;
	}

	public Double getOtrosGastosSauceda() {
		return otrosGastosSauceda;
	}

	public void setOtrosGastosSauceda(Double otrosGastosSauceda) {
		this.otrosGastosSauceda = otrosGastosSauceda;
	}

	public Double getOtrosGastosPanteones() {
		return otrosGastosPanteones;
	}

	public void setOtrosGastosPanteones(Double otrosGastosPanteones) {
		this.otrosGastosPanteones = otrosGastosPanteones;
	}

	public Double getOtrosGastosTresCrucesD() {
		return otrosGastosTresCrucesD;
	}

	public void setOtrosGastosTresCrucesD(Double otrosGastosTresCrucesD) {
		this.otrosGastosTresCrucesD = otrosGastosTresCrucesD;
	}

	public Double getOtrosGastosCondesaD() {
		return otrosGastosCondesaD;
	}

	public void setOtrosGastosCondesaD(Double otrosGastosCondesaD) {
		this.otrosGastosCondesaD = otrosGastosCondesaD;
	}

	public Double getOtrosGastosSaucedaD() {
		return otrosGastosSaucedaD;
	}

	public void setOtrosGastosSaucedaD(Double otrosGastosSaucedaD) {
		this.otrosGastosSaucedaD = otrosGastosSaucedaD;
	}

	public Double getOtrosGastosPanteonesD() {
		return otrosGastosPanteonesD;
	}

	public void setOtrosGastosPanteonesD(Double otrosGastosPanteonesD) {
		this.otrosGastosPanteonesD = otrosGastosPanteonesD;
	}

	public Double getDineroTresCruces() {
		return dineroTresCruces;
	}

	public void setDineroTresCruces(Double dineroTresCruces) {
		this.dineroTresCruces = dineroTresCruces;
	}

	public Double getDineroCondesa() {
		return dineroCondesa;
	}

	public void setDineroCondesa(Double dineroCondesa) {
		this.dineroCondesa = dineroCondesa;
	}

	public Double getDineroSauceda() {
		return dineroSauceda;
	}

	public void setDineroSauceda(Double dineroSauceda) {
		this.dineroSauceda = dineroSauceda;
	}

	public Double getDineroPanteones() {
		return dineroPanteones;
	}

	public void setDineroPanteones(Double dineroPanteones) {
		this.dineroPanteones = dineroPanteones;
	}

	public Double getDineroTresCrucesD() {
		return dineroTresCrucesD;
	}

	public void setDineroTresCrucesD(Double dineroTresCrucesD) {
		this.dineroTresCrucesD = dineroTresCrucesD;
	}

	public Double getDineroCondesaD() {
		return dineroCondesaD;
	}

	public void setDineroCondesaD(Double dineroCondesaD) {
		this.dineroCondesaD = dineroCondesaD;
	}

	public Double getDineroSaucedaD() {
		return dineroSaucedaD;
	}

	public void setDineroSaucedaD(Double dineroSaucedaD) {
		this.dineroSaucedaD = dineroSaucedaD;
	}

	public Double getDineroPanteonesD() {
		return dineroPanteonesD;
	}

	public void setDineroPanteonesD(Double dineroPanteonesD) {
		this.dineroPanteonesD = dineroPanteonesD;
	}

	public Double getBilletesTresCruces() {
		return billetesTresCruces;
	}

	public void setBilletesTresCruces(Double billetesTresCruces) {
		this.billetesTresCruces = billetesTresCruces;
	}

	public Double getBilletesPanteones() {
		return billetesPanteones;
	}

	public void setBilletesPanteones(Double billetesPanteones) {
		this.billetesPanteones = billetesPanteones;
	}

	public Double getBilletesSauceda() {
		return billetesSauceda;
	}

	public void setBilletesSauceda(Double billetesSauceda) {
		this.billetesSauceda = billetesSauceda;
	}

	public Double getBilletesCondesa() {
		return billetesCondesa;
	}

	public void setBilletesCondesa(Double billetesCondesa) {
		this.billetesCondesa = billetesCondesa;
	}

	public Double getBilletesTresCrucesD() {
		return billetesTresCrucesD;
	}

	public void setBilletesTresCrucesD(Double billetesTresCrucesD) {
		this.billetesTresCrucesD = billetesTresCrucesD;
	}

	public Double getBilletesPanteonesD() {
		return billetesPanteonesD;
	}

	public void setBilletesPanteonesD(Double billetesPanteonesD) {
		this.billetesPanteonesD = billetesPanteonesD;
	}

	public Double getBilletesSaucedaD() {
		return billetesSaucedaD;
	}

	public void setBilletesSaucedaD(Double billetesSaucedaD) {
		this.billetesSaucedaD = billetesSaucedaD;
	}

	public Double getBilletesCondesaD() {
		return billetesCondesaD;
	}

	public void setBilletesCondesaD(Double billetesCondesaD) {
		this.billetesCondesaD = billetesCondesaD;
	}

	public Double getMonedasTresCruces() {
		return monedasTresCruces;
	}

	public void setMonedasTresCruces(Double monedasTresCruces) {
		this.monedasTresCruces = monedasTresCruces;
	}

	public Double getMonedasPanteones() {
		return monedasPanteones;
	}

	public void setMonedasPanteones(Double monedasPanteones) {
		this.monedasPanteones = monedasPanteones;
	}

	public Double getMonedasCondesa() {
		return monedasCondesa;
	}

	public void setMonedasCondesa(Double monedasCondesa) {
		this.monedasCondesa = monedasCondesa;
	}

	public Double getMonedasSauceda() {
		return monedasSauceda;
	}

	public void setMonedasSauceda(Double monedasSauceda) {
		this.monedasSauceda = monedasSauceda;
	}

	public Double getMonedasTresCrucesD() {
		return monedasTresCrucesD;
	}

	public void setMonedasTresCrucesD(Double monedasTresCrucesD) {
		this.monedasTresCrucesD = monedasTresCrucesD;
	}

	public Double getMonedasPanteonesD() {
		return monedasPanteonesD;
	}

	public void setMonedasPanteonesD(Double monedasPanteonesD) {
		this.monedasPanteonesD = monedasPanteonesD;
	}

	public Double getMonedasCondesaD() {
		return monedasCondesaD;
	}

	public void setMonedasCondesaD(Double monedasCondesaD) {
		this.monedasCondesaD = monedasCondesaD;
	}

	public Double getMonedasSaucedaD() {
		return monedasSaucedaD;
	}

	public void setMonedasSaucedaD(Double monedasSaucedaD) {
		this.monedasSaucedaD = monedasSaucedaD;
	}

	public Double getTotalTresCruces() {
		return totalTresCruces;
	}

	public void setTotalTresCruces(Double totalTresCruces) {
		this.totalTresCruces = totalTresCruces;
	}

	public Double getTotalCondesa() {
		return totalCondesa;
	}

	public void setTotalCondesa(Double totalCondesa) {
		this.totalCondesa = totalCondesa;
	}

	public Double getTotalSauceda() {
		return totalSauceda;
	}

	public void setTotalSauceda(Double totalSauceda) {
		this.totalSauceda = totalSauceda;
	}

	public Double getTotalPanteones() {
		return totalPanteones;
	}

	public void setTotalPanteones(Double totalPanteones) {
		this.totalPanteones = totalPanteones;
	}

	public Double getTotalTresCrucesD() {
		return totalTresCrucesD;
	}

	public void setTotalTresCrucesD(Double totalTresCrucesD) {
		this.totalTresCrucesD = totalTresCrucesD;
	}

	public Double getTotalCondesaD() {
		return totalCondesaD;
	}

	public void setTotalCondesaD(Double totalCondesaD) {
		this.totalCondesaD = totalCondesaD;
	}

	public Double getTotalSaucedaD() {
		return totalSaucedaD;
	}

	public void setTotalSaucedaD(Double totalSaucedaD) {
		this.totalSaucedaD = totalSaucedaD;
	}

	public Double getTotalPanteonesD() {
		return totalPanteonesD;
	}

	public void setTotalPanteonesD(Double totalPanteonesD) {
		this.totalPanteonesD = totalPanteonesD;
	}

	public Double getDiferenciaTresCruces() {
		return diferenciaTresCruces;
	}

	public void setDiferenciaTresCruces(Double diferenciaTresCruces) {
		this.diferenciaTresCruces = diferenciaTresCruces;
	}

	public Double getDiferenciaPanteones() {
		return diferenciaPanteones;
	}

	public void setDiferenciaPanteones(Double diferenciaPanteones) {
		this.diferenciaPanteones = diferenciaPanteones;
	}

	public Double getDiferenciaCondesa() {
		return diferenciaCondesa;
	}

	public void setDiferenciaCondesa(Double diferenciaCondesa) {
		this.diferenciaCondesa = diferenciaCondesa;
	}

	public Double getDiferenciaSauceda() {
		return diferenciaSauceda;
	}

	public void setDiferenciaSauceda(Double diferenciaSauceda) {
		this.diferenciaSauceda = diferenciaSauceda;
	}

	public Double getDiferenciaTresCrucesD() {
		return diferenciaTresCrucesD;
	}

	public void setDiferenciaTresCrucesD(Double diferenciaTresCrucesD) {
		this.diferenciaTresCrucesD = diferenciaTresCrucesD;
	}

	public Double getDiferenciaPanteonesD() {
		return diferenciaPanteonesD;
	}

	public void setDiferenciaPanteonesD(Double diferenciaPanteonesD) {
		this.diferenciaPanteonesD = diferenciaPanteonesD;
	}

	public Double getDiferenciaCondesaD() {
		return diferenciaCondesaD;
	}

	public void setDiferenciaCondesaD(Double diferenciaCondesaD) {
		this.diferenciaCondesaD = diferenciaCondesaD;
	}

	public Double getDiferenciaSaucedaD() {
		return diferenciaSaucedaD;
	}

	public void setDiferenciaSaucedaD(Double diferenciaSaucedaD) {
		this.diferenciaSaucedaD = diferenciaSaucedaD;
	}

	public Double getPolloQuedaronTresCruces() {
		return polloQuedaronTresCruces;
	}

	public void setPolloQuedaronTresCruces(Double polloQuedaronTresCruces) {
		this.polloQuedaronTresCruces = polloQuedaronTresCruces;
	}

	public Double getPolloQuedaronPanteones() {
		return polloQuedaronPanteones;
	}

	public void setPolloQuedaronPanteones(Double polloQuedaronPanteones) {
		this.polloQuedaronPanteones = polloQuedaronPanteones;
	}

	public Double getPolloQuedaronCondesa() {
		return polloQuedaronCondesa;
	}

	public void setPolloQuedaronCondesa(Double polloQuedaronCondesa) {
		this.polloQuedaronCondesa = polloQuedaronCondesa;
	}

	public Double getPolloQuedaronSauceda() {
		return polloQuedaronSauceda;
	}

	public void setPolloQuedaronSauceda(Double polloQuedaronSauceda) {
		this.polloQuedaronSauceda = polloQuedaronSauceda;
	}

	public Double getPolloQuedaronTresCrucesD() {
		return polloQuedaronTresCrucesD;
	}

	public void setPolloQuedaronTresCrucesD(Double polloQuedaronTresCrucesD) {
		this.polloQuedaronTresCrucesD = polloQuedaronTresCrucesD;
	}

	public Double getPolloQuedaronPanteonesD() {
		return polloQuedaronPanteonesD;
	}

	public void setPolloQuedaronPanteonesD(Double polloQuedaronPanteonesD) {
		this.polloQuedaronPanteonesD = polloQuedaronPanteonesD;
	}

	public Double getPolloQuedaronCondesaD() {
		return polloQuedaronCondesaD;
	}

	public void setPolloQuedaronCondesaD(Double polloQuedaronCondesaD) {
		this.polloQuedaronCondesaD = polloQuedaronCondesaD;
	}

	public Double getPolloQuedaronSaucedaD() {
		return polloQuedaronSaucedaD;
	}

	public void setPolloQuedaronSaucedaD(Double polloQuedaronSaucedaD) {
		this.polloQuedaronSaucedaD = polloQuedaronSaucedaD;
	}

	public Double getPapaQuedaronTresCruces() {
		return papaQuedaronTresCruces;
	}

	public void setPapaQuedaronTresCruces(Double papaQuedaronTresCruces) {
		this.papaQuedaronTresCruces = papaQuedaronTresCruces;
	}

	public Double getPapaQuedaronPanteones() {
		return papaQuedaronPanteones;
	}

	public void setPapaQuedaronPanteones(Double papaQuedaronPanteones) {
		this.papaQuedaronPanteones = papaQuedaronPanteones;
	}

	public Double getPapaQuedaronCondesa() {
		return papaQuedaronCondesa;
	}

	public void setPapaQuedaronCondesa(Double papaQuedaronCondesa) {
		this.papaQuedaronCondesa = papaQuedaronCondesa;
	}

	public Double getPapaQuedaronSauceda() {
		return papaQuedaronSauceda;
	}

	public void setPapaQuedaronSauceda(Double papaQuedaronSauceda) {
		this.papaQuedaronSauceda = papaQuedaronSauceda;
	}

	public Double getPapaQuedaronTresCrucesD() {
		return papaQuedaronTresCrucesD;
	}

	public void setPapaQuedaronTresCrucesD(Double papaQuedaronTresCrucesD) {
		this.papaQuedaronTresCrucesD = papaQuedaronTresCrucesD;
	}

	public Double getPapaQuedaronPanteonesD() {
		return papaQuedaronPanteonesD;
	}

	public void setPapaQuedaronPanteonesD(Double papaQuedaronPanteonesD) {
		this.papaQuedaronPanteonesD = papaQuedaronPanteonesD;
	}

	public Double getPapaQuedaronCondesaD() {
		return papaQuedaronCondesaD;
	}

	public void setPapaQuedaronCondesaD(Double papaQuedaronCondesaD) {
		this.papaQuedaronCondesaD = papaQuedaronCondesaD;
	}

	public Double getPapaQuedaronSaucedaD() {
		return papaQuedaronSaucedaD;
	}

	public void setPapaQuedaronSaucedaD(Double papaQuedaronSaucedaD) {
		this.papaQuedaronSaucedaD = papaQuedaronSaucedaD;
	}

	public Double getGananciaFin() {
		return gananciaFin;
	}

	public void setGananciaFin(Double gananciaFin) {
		this.gananciaFin = gananciaFin;
	}

	public void setEmpleadoService(EmpleadoService empleadoService) {
		this.empleadoService = empleadoService;
	}

	public void setGananciaService(GananciaService gananciaService) {
		this.gananciaService = gananciaService;
	}

	public void setGastosService(GastosService gastosService) {
		this.gastosService = gastosService;
	}

	public void setIngresoService(IngresoService ingresoService) {
		this.ingresoService = ingresoService;
	}

	public void setSemanaService(SemanaService semanaService) {
		this.semanaService = semanaService;
	}

	public void setVentaService(VentaService ventaService) {
		this.ventaService = ventaService;
	}

	/*public void setSelectedDate(Date selectedDate) {
		this.selectedDate = selectedDate;
	}

	public Date getSelectedDate() {
		return selectedDate;
	}*/
	
}