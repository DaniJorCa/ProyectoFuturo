package ProyectoFuturo;

import org.w3c.dom.ls.LSOutput;

public class ProyectoFuturo {

    private String valorHoras;
    private String numModulos;


    public ProyectoFuturo() {

    }

    public String getValorHoras() {
        return valorHoras;
    }

    public String getNumModulos() {
        return numModulos;
    }

    private static String veredicto(String numModulos, String valorHoras) {
        if (numModulos.equals(valorHoras)) {
            System.out.print("Bien, pero una hora de estudio para cada módulo puede ser insuficiente.");
        }else if (Integer.parseInt(numModulos) > Integer.parseInt(valorHoras)) {
            System.out.println("Poco tiempo de estudio. Debes dedicar mas tiempo"); ;
        }else
        System.out.print("Ideal. Trabajas los contenidos en casa.");
        return "";
    }
}