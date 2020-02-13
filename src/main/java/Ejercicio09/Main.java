package Ejercicio09;
import Ejercicio11.Lib;

import java.util.Scanner;

public class Main {
    public static  Scanner lector = new Scanner(System.in);
    public static void main(String[] args) {
        int opcion;
        String[] cadena = {"Pizza", "Canelones", "Macarrones", null, "Sushi"};
        int[] array = new int[3];
        do {

            opcion=mostrarMenu();
            switch (opcion){
                case 0:
                    System.out.println("Hasta la próxima.");
                    break;
                case 1:
                    try {
                        generarExcepcionAE();
                    }catch (ExcepcionAE AE){
                        System.out.println("BRUT");
                    }
                    break;
                case 2:
                    try {
                        generarExcepcionNPE(cadena);
                    }catch (ExcepcionNPE NPE){
                        System.out.println("BRUT");
                    }
                    break;
                case 3:
                    try {
                        generarIOOBE(array);
                    }catch (ExcepcionIOOBE IOOBE){
                        System.out.println("BRUT");
                    }
                default:
                    break;
            }
        } while (opcion!=0);
    }

    /**
     * Método que muestra el menú principal por pantalla y devuelve la opción elegida.
     * @return La opción elegida.
     */
    public static int mostrarMenu(){
        int opcion = -1;
        boolean validado = true;
        do {
            try {
                System.out.println("********************************");
                System.out.println("** TRATAMIENTO DE EXCEPCIONES **");
                System.out.println("********************************");
                System.out.println("1. Probar ArithmeticException.");
                System.out.println("2. Probar NullPointerException.");
                System.out.println("3. Probar IndexOutOfBoundsException.");
                System.out.println("------------------------------------------------");
                System.out.println("0. Salir.");
                System.out.println("\nElige una opción:");
                opcion = Integer.parseInt(lector.nextLine());
                if(opcion < 0 || opcion > 3) {
                    System.out.println("Elija una opción del menú [0-3]");
                    Lib.pausa();
                }
            }catch (NumberFormatException nfe){
                System.out.println("Debes introducir un número entero [0-3].");
                Lib.pausa();
                opcion = -1;
                validado = false;
            }
        } while (validado = false || opcion < 0 || opcion > 3);
        return opcion;
    }

    /**
     * Método para generar una ArithmeticException.
     */
    public static void generarExcepcionAE(){
        int dividendo = 0, divisor = 0, resultado = 0;
        boolean noValidado = false;
        do {
            try {
                System.out.println("Introduce el dividendo:");
                dividendo=Integer.parseInt(lector.nextLine());
                System.out.println("Introduce el divisor:");
                divisor=Integer.parseInt(lector.nextLine());
                resultado = dividendo/divisor;
                if (divisor!=0){
                    System.out.println(dividendo + "/" + divisor + "=" + resultado);
                    System.out.println("Si no divides entre 0, no vas a generar la excepción, máquina.");
                    noValidado=true;
                    Lib.pausa();
                }
            }catch (NumberFormatException nfe){
                System.out.println("Introduce números enteros, no es tan difícil.");
                noValidado = true;
            }catch (ArithmeticException ae){
                throw new ExcepcionAE("No puedes dividir entre 0, campeón."); //En el caso de que el usuario intente dividir entre 0, se lanza la excepción con el siguiente mensaje.
            }
        }while (noValidado=true);
    }

    /**
     * Método para generar NullPointerException.
     * @param array El array a recorrer.
     */
    public static void generarExcepcionNPE(String[] array){
        for (int i = 0; i < array.length; i++) {
            try {
                System.out.println(array[i].charAt(0));
            }catch (NullPointerException npe){
                throw new ExcepcionNPE("NullPointerException generada con exito."); //Cuando el usuario intenta recorrer un array con nulls, se lanza la excepción con el siguiente mensaje.
            }
        }
    }

    /**
     * Método para generar IndexOutOfBoundsException.
     * @param array El array a rellenar.
     * @return El array lleno.
     */
    public static int[] generarIOOBE(int[] array){
        int numero = 0;
        int contador = 0;
        boolean salir = false; //Variable para salir del bucle.
        do {
            try {
                System.out.println("Introduce un número entero para el array de 3:");
                numero=Integer.parseInt(lector.nextLine());
                array[contador]=numero; //Guardo el número que ha introducido el usuario en el array.
                contador++;
            } catch (NumberFormatException nfe){ //Atrapo la excepción que se lanza cuando el usuario pone una letra.
                System.out.println("Debes introducir un número entero."); //Indico al usuario que no debe introducir letras.
                salir=true;
            }catch (IndexOutOfBoundsException ioobe){
                throw new ExcepcionIOOBE("El array ya está lleno, IndexOutOfBoundsException generada."); //Cuando el usuario intente añadir más de 3 numeros al array, se lanza la excepción con el siguiente mensaje.
            }
        } while (salir=true);
        return array; //Devuelvo el array.
    }
}
