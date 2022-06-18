package Entorno;

import java.util.HashMap;
import java.util.Locale;

public class Entorno {
    public HashMap<String, Simbolo> TablaSimbolo;
    public Entorno padre;
    public Entorno siguiente;
    public int ultPosicion;

    // var1    0            ->          var1        0
    // var2    1                        var2        1
    // var3    2
    // var4    3
    // var5    4

    public Entorno(Entorno padre) {
        this.padre = padre;
        TablaSimbolo = new HashMap<String, Simbolo>();
        this.ultPosicion = 0;
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

    public Simbolo Buscar(String nombre)
    {
        for (Entorno ent = this; ent != null; ent = ent.padre)
        {
            if (ent.TablaSimbolo.containsKey(nombre.toUpperCase()))
                return ent.TablaSimbolo.get(nombre.toUpperCase());
        }
        return null;
    }

    public int getPrevSizes()
    {
        int size = 0;
        for (Entorno ent = this.padre; ent != null; ent = ent.padre)
            size += ent.TablaSimbolo.size();

        return size;
    }
}
