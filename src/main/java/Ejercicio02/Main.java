package Ejercicio02;

import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        float[] numeros = new float[10];
        int contador = 0;
        int isFallos = 0;


        for (int i = 0; i < numeros.length; i++) {
            numeros[contador] = leerNumeros();
            contador++;
        }


        Arrays.sort(numeros);

        for (int i = 9; i >= 0; i--) {
            //isFallos = nFallos(numeros);
            System.out.println(numeros[i]);
        }
        isFallos = nFallos();
        System.out.println("Has introducido " +isFallos+ " datos incorrectos");
    }

    public static int nFallos(){
        int nFallos = 0;
        nFallos++;



        return nFallos;
    }

    public static float leerNumeros(){
        Scanner input = new Scanner(System.in);
        boolean validado;
        float numero = 0;
        int nFallos= 0;
        do{
            try {
                System.out.println("OlA KmPñer0, mTe NmRs sta Mtr 1 Ngtib");
                numero = Float.parseFloat(input.nextLine());
                validado = true;
            }catch (NumberFormatException NFE){
                nFallos = nFallos();
                validado = false;
                System.err.println("Has introducido algo que no es un numero, introduce un numero!!.");

            }
        }while (!validado);
        return numero;
    }
}
