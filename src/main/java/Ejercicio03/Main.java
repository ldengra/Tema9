package Ejercicio03;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
static boolean salir = false;
    public static void main(String[] args) {

        int contador = 0;
        int[] numeros = new int [500];

        do{
            numeros[contador] = leerNumeros();
            contador++;
        }while(salir);
        Arrays.sort(numeros);

        System.out.println(numeros[contador-1]);
    }


    /**
     * metodo para leer los numeros introducidos por el usuario y con un do while, metemos el try para hacer la comprobacion
     * y el catch para atrapar los errores y sacarme un mensaje con el error.. No entiendo porque no sale del bucle
     * @return
     */
    public static int leerNumeros(){
        Scanner input = new Scanner(System.in);
        boolean validado;
        int numero = 0;
        do{
            try {
                System.out.println("Inserta un numero, si insertas una letra, se acaba.");
                numero = Integer.parseInt(input.nextLine());
                validado = true;
            }catch (NumberFormatException NFE){
                validado = false;
                System.err.println("Has introducido algo que no es un numero, introduce un numero!!.");
                salir = true;
            }
        }while (!validado);

        return numero;
    }
}
