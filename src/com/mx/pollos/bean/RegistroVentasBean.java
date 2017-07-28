package com.mx.pollos.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.model.SelectItem;

import com.mx.pollos.model.Semana;
import com.mx.pollos.model.VentaSemana;
import com.mx.pollos.service.EmpleadoService;

/**
 * @author Jorge Ortiz
 * @version 1.0
 * @created 21-abril-2017 12:33:45 p.m.
 */
public class RegistroVentasBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<VentaSemana> ventasSemana;
	private Semana semana;
	private ArrayList<SelectItem> semanasItem;
	private String dia;
	private EmpleadoService empleadoService;
	private List<Semana> semanas;
	
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
	
	private Double polloQuedaronTresCruces;
	private Double polloQuedaronPanteones;
	private Double polloQuedaronCondesa;
	private Double polloQuedaronSauceda;
	private Double papaQuedaronTresCruces;
	private Double papaQuedaronPanteones;
	private Double papaQuedaronCondesa;
	private Double papaQuedaronSauceda;
	
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
	private Double ventaPollosTresCruces;
	private Double ventaPollosSauceda;
	private Double ventaPollosCondesa;
	private Double ventaPollosPanteones;
	private Double ventaPapasTresCruces;
	private Double ventaPapasSauceda;
	private Double ventaPapasCondesa;
	private Double ventaPapasPanteones;
	private Double ventaTresCruces;
	private Double ventaSauceda;
	private Double ventaCondesa;
	private Double ventaPanteones;
	private Double maletinTresCruces;
	private Double maletinSauceda;
	private Double maletinCondesa;
	private Double maletinPanteones;
	private Double comidaTresCruces;
	private Double comidaPanteones;
	private Double comidaCondesa;
	private Double comidaSauceda;
	private Double refrescoTresCruces;
	private Double refrescoPanteones;
	private Double refrescoCondesa;
	private Double refrescoSauceda;
	private Double pollosPiezasTresCruces;
	private Double pollosPiezasPanteones;
	private Double pollosPiezasCondesa;
	private Double pollosPiezasSauceda;
	private Double descuentosTresCruces;
	private Double descuentosPanteones;
	private Double descuentosSauceda;
	private Double descuentosCondesa;
	private Double pollosQuedaronTresCruces;
	private Double pollosQuedaronCondesa;
	private Double pollosQuedaronSauceda;
	private Double pollosQuedaronPanteones;
	private Double pollosQuedaronDineroTresCruces;
	private Double pollosQuedaronDineroSauceda;
	private Double pollosQuedaronDineroPanteones;
	private Double pollosQuedaronDineroCondesa;
	private Double otrosGastosTresCruces;
	private Double otrosGastosCondesa;
	private Double otrosGastosSauceda;
	private Double otrosGastosPanteones;
	private Double dineroTresCruces;
	private Double dineroCondesa;
	private Double dineroSauceda;
	private Double dineroPanteones;
	private Double billetesTresCruces;
	private Double billetesPanteones;
	private Double billetesSauceda;
	private Double billetesCondesa;
	private Double monedasTresCruces;
	private Double monedasPanteones;
	private Double monedasCondesa;
	private Double monedasSauceda;
	private Double totalTresCruces;
	private Double totalCondesa;
	private Double totalSauceda;
	private Double totalPanteones;
	private Double diferenciaTresCruces;
	private Double diferenciaPanteones;
	private Double diferenciaCondesa;
	private Double diferenciaSauceda;
	
	
	
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

	public Double getPollosQuedaronDineroTresCruces() {
		return pollosQuedaronDineroTresCruces;
	}

	public void setPollosQuedaronDineroTresCruces(Double pollosQuedaronDineroTresCruces) {
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

	public void setPollosQuedaronDineroPanteones(Double pollosQuedaronDineroPanteones) {
		this.pollosQuedaronDineroPanteones = pollosQuedaronDineroPanteones;
	}

	public Double getPollosQuedaronDineroCondesa() {
		return pollosQuedaronDineroCondesa;
	}

	public void setPollosQuedaronDineroCondesa(Double pollosQuedaronDineroCondesa) {
		this.pollosQuedaronDineroCondesa = pollosQuedaronDineroCondesa;
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

	public List<Semana> getSemanas() {
		return semanas;
	}

	public void setSemanas(List<Semana> semanas) {
		this.semanas = semanas;
	}

	public void setEmpleadoService(EmpleadoService empleadoService) {
		this.empleadoService = empleadoService;
	}

	public Semana getSemana() {
		return semana;
	}

	public void setSemana(Semana semana) {
		this.semana = semana;
	}

	public ArrayList<SelectItem> getSemanasItem() {
		return semanasItem;
	}

	public void setSemanasItem(ArrayList<SelectItem> semanasItem) {
		this.semanasItem = semanasItem;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public List<VentaSemana> getVentasSemana() {
		return ventasSemana;
	}

	public void setVentasSemana(List<VentaSemana> ventasSemana) {
		this.ventasSemana = ventasSemana;
	}

	public RegistroVentasBean(){
	}

	public void finalize() throws Throwable {

	}

	public String agregar(){
		try{
			
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
			ventasSemana = new ArrayList<VentaSemana>();
		}
		catch(Exception exception){
			exception.printStackTrace();
		}
		return "registroventas";
	}
	
	public String inicioAgregar(){
		SelectItem option;
		semanas = empleadoService.buscarSemana(new Semana());
		semanasItem = new ArrayList<SelectItem>();
		for (Semana semana:semanas){
			option = new SelectItem(semana.getIdSemana(), semana.getFechaInicio() + " / " + semana.getFechaFin());
			semanasItem.add(option);
		}
		return "agregar";
	}

}