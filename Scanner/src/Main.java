import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Metodo Scanner para el ingreso de datos por consola
        Scanner scanner = new Scanner(System.in);
        int numero1;
        int numero2;
        float coeficiente;
        String nombre;
        char inicial;

        //ingreso de numeros:
        System.out.println( " ingrese el primer valor");
        numero1= scanner.nextInt();

        System.out.println( " ingrese el segundo valor ");
        numero2= scanner.nextInt();

        //System.out.println( " ingrese el coeficiente ");
        //coeficiente= scanner.nextFloat();

        //ingreso de caracteres
        System.out.println( " ingrese su nombre ");
        nombre= scanner.nextLine();

        //ejemplo:
        String nombreUsuario;
        int edadUsuario;

        System.out.println( " Bienvenido, ingrese su nombre: ");
        nombreUsuario= scanner.nextLine();

        System.out.println( " Ahora ingrese su edad ");
        edadUsuario = scanner.nextInt();

        //Ejercicio:
        String MiNombre;
        String MiApellido;
        char inicial2;
        char inicial3;

        System.out.println( " mi nombre es ");
        MiNombre= scanner.nextLine();
        System.out.println( " y mi apellido es ");
        MiApellido= scanner.nextLine();

        inicial2=MiNombre.charAt(2);
        inicial3=MiApellido.charAt(2);

        System.out.println("La tercer letra de mi nombre es" + inicial2 + "y la tercer letra de mi apellido es " +inicial3);





    }
}