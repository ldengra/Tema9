package Ejercicio09;

public class Main {
    public static void main(String[] args) {
        String s = null;
        int[] n = new int[5];
        try{
            romperAritmetica();
        }catch (MiExcepcionAritmetica mea){
            System.out.println(mea.getMessage());
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
    public static void romperAritmetica ()throws MiExcepcionAritmetica{
        try{
            int resultado = 5 / 0;
        }catch (ArithmeticException ae){
            throw new MiExcepcionAritmetica("No puedes dividir entre 0");
        }
    }
}
