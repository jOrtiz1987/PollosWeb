package com.mx.pollos.utilerias;
import jxl.*; 
import java.io.*; 
import java.util.ArrayList;

public class ReadExcel { 
	
    public ArrayList<String> leerArchivoExcel(String archivoDestino) { 
    	ArrayList<String> excelConverted = new ArrayList<String>();
        try { 
            Workbook archivoExcel = Workbook.getWorkbook(new File(archivoDestino)); 
            excelConverted.add("Número de Hojas\t" + archivoExcel.getNumberOfSheets());
            for (int sheetNo = 0; sheetNo < archivoExcel.getNumberOfSheets(); sheetNo++) // Recorre cada hoja                                                                                                                                                       
                { 
                Sheet hoja = archivoExcel.getSheet(sheetNo); 
                int numColumnas = hoja.getColumns(); 
                int numFilas = hoja.getRows(); 
                String data; 
                excelConverted.add("Nombre de la Hoja\t" + archivoExcel.getSheet(sheetNo).getName()); 
                for (int fila = 0; fila < numFilas; fila++) { // Recorre cada 
                    // fila de la hoja 
                    for (int columna = 0; columna < numColumnas; columna++) { // Recorre                                                                                
                        // cada columna de la fila 
                        data = hoja.getCell(columna, fila).getContents(); 
                        data = data.replace(',', '.');
                        excelConverted.add(data + " "); 

                    } 
                } 
            } 
        } catch (Exception ioe) { 
            ioe.printStackTrace(); 
        } 
        return excelConverted;
    } 

    public static void main(String arg[]) { 
        ReadExcel excel = new ReadExcel(); 
        ArrayList<String> strings = excel.leerArchivoExcel("Cuentas Pollos.xls"); 
        for(int i = 0; i< strings.size(); i++){
        	System.out.println(strings.get(i));
        }
    } 
}
