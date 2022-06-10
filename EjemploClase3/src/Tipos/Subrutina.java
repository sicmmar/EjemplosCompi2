package Tipos;

import Entorno.*;

import java.util.ArrayList;

public class Subrutina {
    public String nombre;
    public ArrayList<Simbolo> lparametros;
    public Object linstrucciones;

    public Subrutina(String nombre, ArrayList<Simbolo> lparametros, Object linstrucciones) {
        this.nombre = nombre;
        this.lparametros = lparametros;
        this.linstrucciones = linstrucciones;
    }
}
