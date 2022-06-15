package Entorno;

public class ErrorCompilador {
    public int fila;
    public int columna;
    public String descripcion;
    public ErrorTipo tipo;

    public enum ErrorTipo {
        Lexico,
        Sintactico,
        Semantico
    }

    public ErrorCompilador(int fila, int columna, String descripcion, ErrorTipo tipo) {
        this.fila = fila;
        this.columna = columna;
        this.descripcion = descripcion;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "<TR><TD>" + (fila < 0 ? "FILA" : fila) + "</TD>" +
                "<TD>" + (columna < 0 ? "COLUMNA" : columna) + "</TD>" +
                "<TD>" + descripcion + "</TD>" +
                "<TD>" + (tipo == null ? "TIPO DE ERROR" : tipo) + "</TD></TR>";
    }
}
