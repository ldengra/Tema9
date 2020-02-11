package Ejercicio02;

import java.util.Arrays;
import java.util.Scanner;
public class Main {
    static int contador = 0;
    static Objeto o1 = new Objeto();
    public static void main(String[] args) {
        float[] numeros = new float[10];
        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {
            numeros[contador] = leerNumeros();
            contador++;
        }

        Arrays.sort(numeros);
        for (int i = 9; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
        System.out.println("Has introducido " +contador+ " datos incorrectos");
    }

    /**
     * Metodo para leer numeros y validarlos, si hay alguna excepcion, saltara un mensaje pidiendo que introduzcas un numero.
     * He creado el Objeto o1 porque no sabia de que manera devolver las veces que se ha introducido un dato erroneo
     * @return
     */
    public static float leerNumeros(){
        Scanner input = new Scanner(System.in);
        boolean validado;
        float numero = 0;
        int nFallos= 0;

        do{
            try {
                System.out.println("OlA KmPñer0, mTe klker nUm");
                numero = Float.parseFloat(input.nextLine());
                validado = true;
            }catch (NumberFormatException NFE){
                //nFallos++;
                //o1.setContador(nFallos);
                contador++;
                validado = false;
                System.err.println("Has introducido algo que no es un numero, introduce un numero!!.");
            }
        }while (!validado);

        return numero;
    }
}
