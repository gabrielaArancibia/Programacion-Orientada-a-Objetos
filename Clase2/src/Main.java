import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //tipos de datos y variables:
        int numeroA = 1; //uso primitivo para solo almacenar datos sencillos. Se usan mas en iteraciones y ciclos, operaciones concretas.
        Integer numeroB = 21; // Se recomiendan en variables de clase, da mas opciones de utilizacion, mas herramientas.
        Integer numeroC= 23;


        String nombre;
        Integer edad;


        //Clase SCANNER
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hola, ingresa tu nombre: ");
        nombre = scanner.nextLine(); // lo que coloque el usuario lo voy a guardar en esta variable.

        System.out.println("Ahora ingresa tu edad: ");
        edad = scanner.nextInt();

        System.out.println("Tu nombre es: " + nombre + " y tu edad es: " + edad + " y te amo mucho ");



        if (esDivisible(numeroA, numeroB)) {
            System.out.println("EL numero es divisible");
        } else{
            System.out.println("El numero no es divisible");
        }
    }

    //Creamos un nuevo metodo:
    public static Boolean esDivisible( Integer numeroA, Integer numeroB ){
         if ( numeroA % numeroB == 0){
             return true;
         } else {
             return false;
         }
    }

}