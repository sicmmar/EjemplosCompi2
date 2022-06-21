package Entorno;

public class Simbolo {
    public String tipo;
    public Object valor;
    public String identificador;
    public int posicion;

    public TipoSimbolo tipoSimbolo;
    public enum TipoSimbolo
    {
        Variable,
        Funcion,
        Subrutina,
        Parametros,
        Nativo,
        C3D
    }

    public Simbolo(String id, String tipo, Object valor, TipoSimbolo tipoS, int posicion) {
        this.identificador = id;
        this.tipo = tipo;
        this.valor = valor;
        this.tipoSimbolo = tipoS;
        this.posicion = posicion;
    }

    public  Simbolo(TipoSimbolo tipoS, Object valor, String tipo)
    {
        this.identificador = "";
        this.tipo = tipo;
        this.valor = valor;
        this.tipoSimbolo = tipoS;
        this.posicion = -1;
    }
}
