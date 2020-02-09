package Ejercicio03;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        boolean negativo;
        int contador = 0;
        int[] numeros = new int [500];

        do{
            numeros[contador] = leerNumeros();
            negativo = isNumeric(numeros[contador]);
            contador++;
        }while(!negativo);

        for (int i = 0; i < contador-1; i++) {
            System.out.println(numeros[i]);

        }
    }

    /**
     * Lo que estoy intentando hacer aqui es convertir el dato introducido en string, para despues convertirlo en int y
     * si da fallo, que salga del bucle, pero no consigo hacerlo.
     * @param str
     * @return
     */
    public static boolean isNumeric(int str){
        try {
            String i = Integer.toString(str);
            int d = Integer.parseInt(i);
        } catch (Exception e) {
            return false;
        }
        return true;
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
