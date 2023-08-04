public class Main {
    public static void main(String[] args) {
        //Clases
        //String: datos de tipo texto
        String nombre; // si no le asignamos valor este sera de valor null;

        //Metodos mas usados:
        String nombre2= "juan";
        int cantidad;
        char inicial;

        cantidad = nombre2.length(); // Para calcular la longitud de la cadena

        nombre2= nombre2.toUpperCase(); // Convierte en mayuscula el nombre

        if (nombre2.equals(("JUAN"))){
            System.out.println( "se paso a mayuscula" );
        } // para comparar si se paso a mayuscula correctamente.

        inicial = nombre2.charAt(0); // Muestra el primer caracter de la cadena

        //Integer:
        Integer valor1=10;
        Integer valor2=30;
        int comparar;
        //Metodos + usados:
       if(valor1.equals(valor2)){
           System.out.println("Son iguales");
       }else{  comparar= valor1.compareTo(valor2);
       if(comparar>0)
           System.out.println("valor1 es mayor que valor2");
       else
           System.out.println("valor2 es mayor que valor1");
        };
}
}
