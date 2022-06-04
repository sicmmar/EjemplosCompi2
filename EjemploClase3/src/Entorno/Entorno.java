package Entorno;

import java.util.HashMap;
import java.util.Locale;

public class Entorno {
    public HashMap<String, Simbolo> TablaSimbolo;
    public Entorno padre;

    public Entorno(Entorno padre) {
        this.padre = padre;
        TablaSimbolo = new HashMap<String, Simbolo>();
    }

    public void nuevoSimbolo(String nombre, Simbolo nuevo)
    {
        if (TablaSimbolo.containsKey(nombre.toUpperCase()))
        {
            // agregar a la lista de error
            System.out.println("La variable " + nombre + " ya existe.");
        }
        else TablaSimbolo.put(nombre.toUpperCase(), nuevo);
    }
}
