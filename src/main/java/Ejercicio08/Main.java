package Ejercicio08;

public class Main {
    public static void main(String[] args) {
        String s = null;
        int[] n = new int[5];
        try{
            int resultado = 5 / 0;
        }catch (ArithmeticException ae){
            System.out.println("No se puede dividir entre 0");
        }
        try{
            System.out.println(s.charAt(0));
        }catch (NullPointerException npe){
            System.out.println("No se puede imprimir un valor nulo");
        }
        try{
            System.out.println(n[500]);
        }catch (ArrayIndexOutOfBoundsException aiob){
            System.out.println("Esa posicion del array no existe");
        }
    }
}
