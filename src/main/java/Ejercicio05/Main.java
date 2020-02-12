package Ejercicio05;
import java.util.Scanner;
public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {


    }

    public static String rellenarNombre(){

        String nombre = "";
        boolean nombreValido;
        do{
            try{
                System.out.println("Inserta el nombre del alumno: ");
                nombre = input.nextLine();
            }catch ()
        }while (!nombreValido);

        return nombre;
    }
}
