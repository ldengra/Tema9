package Ejercicio02;

public class Objeto {
    private static final int INITIAL_SIZE = 10;
    private float[] datos;
    private int contador; //numero elementos

    public Objeto(){
        this(INITIAL_SIZE);
    }

    public Objeto(int size){
        datos = new float[size];
        contador = 0;
    }

    public float[] getDatos() {
        return datos;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
}
