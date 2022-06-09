package edu.escuelaing.arsw;

import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.io.BufferedReader;

public class Calculos {
    public void readFile(FileReader file) throws IOException {
        String listaNumeros = null;
        List<?> ln = new LinkedList<?>();
        BufferedReader bf = new BufferedReader(file);
        while ((listaNumeros = bf.readLine()) != null) {
            System.out.println(listaNumeros);
            Double media = calcularMedia(listaNumeros);
            Double desviacion = calcularDesviacion(listaNumeros);
        }
    }

    public Double calcularMedia(String listaNumeros){
        return 0.0;
    }

    public Double calcularDesviacion(String listaNumeros){
        return 0.0;
    }
}
