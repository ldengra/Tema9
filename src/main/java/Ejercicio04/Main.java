package Ejercicio04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[5];

        for(int i = 0; i < numeros.length; i++){
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
                validado = false;
            }catch (NumberFormatException NFE){
                validado = true;
                System.err.println("Has introducido algo que no es un numero, introduce un numero!!.");
            }catch (ArrayIndexOutOfBoundsException AIOOBE){
                System.out.println("El array se ha llenado");
                validado = true;

            }catch (NullPointerException NPE){
                System.out.println("No se ha creado el array");
                validado = true;
            }
        }while (!validado);

        return numero;
    }
}

