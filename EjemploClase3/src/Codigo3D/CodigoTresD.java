package Codigo3D;
import Entorno.*;

import java.util.*;

public class CodigoTresD {
    public ArrayList<String> codigo3d;
    private int temporal;
    private int label;

    public CodigoTresD() {
        this.codigo3d = new ArrayList<>();
        this.temporal = -1;
        this.label = -1;
    }

    public String generateTemporal()
    {
        this.temporal++;
        return String.valueOf("t" + this.temporal);
    }

    public String lastTemporal()
    {
        return String.valueOf("t" + this.temporal);
    }

    public String getHeader()
    {
        // para obtener solo listado de temporales: t1, t2, t3, ... , tn;
        String temporales = "";
        for (int i = 0; i <= this.temporal; i++)
            temporales += "t" + String.valueOf(i) + (i < this.temporal ? "," : ";\n");

        return "#include <stdio.h>\n" +
                "double STACK[30101999];\n" +
                "double HEAP[30101999];\n" +
                "double P;\n" +
                "double H;\n" +
                "double " + temporales;
    }
}
