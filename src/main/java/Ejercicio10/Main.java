package Ejercicio10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in); //declaramos la variable del scanner
        int opcion = 0; //esta variable es para guardarla opcion que selecciona el usuario
        double operando1, operando2, resultado; //hago estas variables como floats para operar con decimales.
        boolean incorrecta = false; //si la opcion es incorrecta
        do{ //uso este DO para hacer minimo una vez la ejecucion del codigo, y el while de abajo le digo que si se cumple,
            //que se cierre la aplicacion y si no se cumple, que siga ejecutando el codigo hasta que se introduzca una opcion
            //valida.

            System.out.println("");
            System.out.println("");
            System.out.println("**********CALCULADORA**********"); //creamos las opciones con sysout.
            System.out.println("");
            System.out.println("");
            System.out.println("Elige una opción:");
            System.out.println(""); //este sysout es para crear un espacio entre frase y frase.
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Resto División");
            System.out.println("-------------------");
            System.out.println("0. Salir");

            do {
                try {
                    opcion = Integer.parseInt(lector.nextLine());
                    incorrecta = true;
                }
                catch (NumberFormatException NFE) {
                    incorrecta = false;
                    System.err.println("Has insertado una opcion invalida. Inserta una opcion valida entre [0-5].");
                }
            }while (!incorrecta);
            //opcion = lector.nextInt(); //recogemos el dato introducido por el usuario y lo guardamos en la variable opcion.
            //lector.nextLine(); //consumimos el retorno de carro.

            System.out.println("Introduce el primer operando");
            operando1 = leerNumeros();
            System.out.println("Introduce el segundo operando");
            operando2 = leerNumeros();

            incorrecta = false;
            switch (opcion) { //utilizamos un switch ya que como es un menú multiopción, es mas
                //viable usar un switch case que varios IF anidados.

                case 1: //recogemos los 2 operandos y hacemos la operación para sacarla por pantalla.
                    resultado = operando1 + operando2;
                    System.out.println("El resultado de la suma es: "+resultado+".");
                    break;

                case 2:
                    resultado = operando1 - operando2;
                    System.out.println("El resultado de la resta es: "+resultado+".");
                    break;

                case 3:
                    resultado = operando1 * operando2;
                    System.out.println("El resultado de la multiplicación es: "+resultado+".");
                    break;

                case 4:
                    resultado = operando1 / operando2;
                    System.out.println("El resultado de la división es: "+resultado+".");
                    break;

                case 5:
                    resultado = operando1 % operando2;
                    System.out.println("El resultado del resto de la division es: "+resultado+".");
                    break;

                case 0:
                    incorrecta=true; //si pulsamos 0 decimos que la boolean "incorrecta" ahora vale True y nos saca del bucle DO
                    break;

                default: //si pulsamos otro boton a la hora de elegir la opción, el programa volvera a pedir
                    //que se introduzca la opcion de nuevo.
                    System.out.println("Opción Incorrecta, prueba de nuevo con una opción valida!!");
                    break;
                }
                //System.out.println("Pulsa ENTER para continuar."); //pulsamos INTRO para consumir un retorno de linea
                //lector.nextLine();

                delaySegundo(3000);
            }while(!incorrecta); //si el valor del boolean no cambia, seguimos haciendo el bucle, pero cuando
        //el valor cambie, como por ejemplo en el 0, haremos que salga del bucle y se termineel programa.
        lector.close(); //cerramos el lector porque no tenemos que usarlo mas.
    }

    public static int leerNumeros(){
        Scanner input = new Scanner(System.in);
        boolean validado;
        int numero = 0;
        do{
            try {
                numero = Integer.parseInt(input.nextLine());
                validado = true;
            }catch (NumberFormatException NFE){
                validado = false;
                System.err.println("Has introducido algo que no es un numero, introduce un numero!!.");
            }
        }while (!validado);

        return numero;
    }

    private static void delaySegundo(int ms) {
        try
        {
            Thread.sleep(ms);
        }catch(InterruptedException e){}
    }
}
