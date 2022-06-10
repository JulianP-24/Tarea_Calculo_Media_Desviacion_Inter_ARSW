package edu.escuelaing.arsw.calculator;

import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.io.BufferedReader;

public class Reader {
    
    Double media;
    Double desviacion;

    public void readFile(FileReader file) throws IOException {
        List ln = new LinkedList<>();
        String listaNumeros = null;
        BufferedReader bf = new BufferedReader(file);
        while ((listaNumeros = bf.readLine()) != null) {
            Double element = Double.parseDouble(listaNumeros);
            ln.add(element);

        }
        System.out.println(ln);

        Calculos calculos = new Calculos();
        media = calculos.calcularMedia(ln);
        desviacion = calculos.calcularDesviacion(ln);

    }
    
    public Double getMedia() {
        return media;
    }
    
    public Double getDesviacionEstandar() {
        return desviacion;
    }
    
}
