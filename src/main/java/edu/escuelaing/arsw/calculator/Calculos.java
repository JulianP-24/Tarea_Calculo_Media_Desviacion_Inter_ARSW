package edu.escuelaing.arsw.calculator;


import java.util.List;

public class Calculos {

    public Double calcularMedia(List <Double> ln) {
        if (ln.size() <= 0) {
            return 0.0;
        }

        double suma = 0;
        for (int i = 0; i < ln.size(); i++) {
            suma +=  ln.get(i);
        }
        return suma/ln.size();
    }

    public Double calcularDesviacion(List <Double> ln) {
        if (ln.size() < 2) {
            return 0.0;
        }

        double value = 0.0;
        double media = calcularMedia(ln);

        for (int i = 0; i < ln.size(); i++) {
            value += Math.pow((ln.get(i) - media), 2);
        }
        double desviacionEstandar = Math.sqrt(value / (ln.size() - 1));
        return (double) Math.round(desviacionEstandar * 100) / 100;
    }
}
