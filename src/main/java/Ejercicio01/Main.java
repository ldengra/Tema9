package Ejercicio01;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        boolean negativo;
        int contador = 0;
        int[] numeros = new int [500];

        do{
            numeros[contador] = leerNumeros();
            negativo = isNegativo(numeros[contador]);
            contador++;
        }while(!negativo);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);

        }
    }

    /**
     * metodo para comprobar si el numero que hemos introducido es positivo o negativo.
     * @param numero numero que introduce el usuario y lo pasamos como parametro
     * @return devuelve una boolean segun si se cumple o no la condicion de que el numero pasado, sea negativo
     */
    public static boolean isNegativo(int numero){
        return numero < 0;

    }

    /**
     * metodo para leer los numeros introducidos por el usuario y con un do while, metemos el try para hacer la comprobacion
     * y el catch para atrapar los errores y sacarme un mensaje con el error.
     * @return
     */
    public static int leerNumeros(){
        Scanner input = new Scanner(System.in);
        boolean validado;
        int numero = 0;
        do{
            try {
                System.out.println("OlA KmPñer0, mTe NmRs sta Mtr 1 Ngtib");
                numero = Integer.parseInt(input.nextLine());
                validado = true;
            }catch (NumberFormatException NFE){
                validado = false;
                System.err.println("Has introducido algo que no es un numero, introduce un numero!!.");
            }
        }while (!validado);




        return numero;
    }
}
