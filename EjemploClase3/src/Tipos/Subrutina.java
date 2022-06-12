package Tipos;

import Entorno.*;
import Gramatica.GramaticaParser;

import java.util.ArrayList;

public class Subrutina {
    public String nombre;
    public ArrayList<Simbolo> lparametros;
    public Object linstrucciones;
    public GramaticaParser.LdeclPContext ldeclaracionParam;

    public Subrutina(String nombre, ArrayList<Simbolo> lparametros, Object linstrucciones, GramaticaParser.LdeclPContext ldeclaracionParam) {
        this.nombre = nombre;
        this.lparametros = lparametros;
        this.linstrucciones = linstrucciones;
        this.ldeclaracionParam = ldeclaracionParam;
    }
}
