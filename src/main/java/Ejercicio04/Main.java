package Ejercicio04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[5];

        for(int i = 0; i < 6; i++){
        numeros[i] = leerNumeros();
        }
        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }
    }

    /**
     * no entiendo porque no salta el catch del arrayoutofbond....
     * @return
     */
    public static int leerNumeros(){
        Scanner input = new Scanner(System.in);
        boolean validado;
        int numero = 0;
        do{
            try {
                System.out.println("Inserta un numero");
                numero = Integer.parseInt(input.nextLine());
                validado = true;
            }catch (NumberFormatException NFE){
                validado = false;
                System.err.println("Has introducido algo que no es un numero, introduce un numero!!.");
            }catch (ArrayIndexOutOfBoundsException AIOOBE){
                System.out.println("El array se ha llenado");
                validado = false;

            }
        }while (!validado);

        return numero;
    }
}

