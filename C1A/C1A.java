//CLASES
import java.util.Date;
import java.util.Scanner;
public static void main(String[] args) {
// STRING: datos de tipo texto. Las Strings nos permiten usar funciones ya programadas a las que llamamos METODOS.
// Metodos mas usados: .lenght(), .toUpperCase(), .equals(), .toChar().

    //EJ STRINGS
    String nombre= "Juan";
    int cantidad;           //Declaramos 3 variables de dif tipo de datos
    char inicial;
    
    cantidad= nombre.lenght(); //Calculamos la longitud del string
    nombre=nombre.toUpperCase();//Combierte en mayuscula todos los caracteres contenidos en nombre.

    if (nombre.equals("JUAN")){
        System.out.println ("Se paso a mayuscula"); // Para comprobar si el nombre paso a mayuscula.
    }

    inicial= nombre.charAt(); // obtenemos el primer caracter de la cadena en la variable inicial de tipo char.
    


//INTERGER: Para comenzar a usar interger tenermos dos posiblidades:
    //Los metodos mas usados son .equal(), .compareTo().
    Interger valor = 0; // Lo creamos y le damos valor inicial de cero.

    Interger num= new Interger (1); // la parte izquierda sera la definicion y la parte derecha la creacion con un valor inicial de 1.
    // Cuando solo definimos algo de tipo Interger, su valor inicial sera null, hay que darle valor inicial.

    //EJ INTERGER:
    Interger valor1= 10;
    Interger valor2= 30; // Definimos variables a utilizar
    int comparar;

    if (valor1.equals(valor2)){ // comprobamos si son iguales
        System.out.println("Son iguales");
    }
    else{
        comparar=valor1.compareTo(valor2);//Compara relacion entre dos valores, si valor! es mayor dara 1, si valor2 es mayor dara -1.
        if (comparar>0)
        System.out.println("valor1 es mayor que valor2");
        else                                    //muestra el valor obtenido en comparar.
        System.out.println("valor2 es mayor que valor1");
    };



//FLOAT: Tenemos dos posibilidades para usar Float:
    Float coeficiente = 2.5f; //Lo creamos, definimos y damos un valor inicial.
    // la f quiere decir que es Float, si no lo ponemos asume que es de tipo Double.
    Float num= new Float(0.5); // Parte izq definicion, parte der creacion con valor inicial 0.5.
    //AL igual que Interger, si no tiene valor incial, e¿sera null.Es necesario drle valor inicial.



//DATE: Esta clase permite trabajar con fechas. Si definimos un objeto de tipo Date, no lo podemos hacer vacio.
    Date fecha= new Date();
    System.out.println(fecha.toString()); // Muestra la fecha actual.
    //Para usar Date es necesario agregar import java.util.Date;

    //Para crear un Date con otro valor:
    Date fecha2= new Date (120,11,5);
    System.out.println (fecha.toString); // va a mostrar 5/12/2020.
    // se escribe AAAA/MM/DD. AL valor que colocamos en año le suma 1900, 1900+120=2020;
    // Los meses los enumera desde cero, osea el mes 11 seria diciembre.


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//INGRESO DE DATOS SCANNER: Scanner es una clase propia de java, que permite ingresar valores. Tiene metodos, funciones ya programadas, que nos permiten ingresar distintos tipos de datos.
//Como los creamos?:Definicos nuestro elemenos scanner. Debemos agregar el import java.util.Scanner;
//Finalizamos la definicion dandole un nombre como lo hariamos con cualquier variable.
// Por ultimo creamos el objeto scanner.

    Scanner lector; // Definicion del objeto lector.
    lector = new Scanner(System.in);// creacion o instanciacion del objeto. El system.in significa que todo ingreso de datos sera intercepado por el scanner.

    //QUE METODOS TIENE?:
    .NextByte()//Para leer un dato de tipo byte.
    .nextShort()//Para leer un dato de tipo short.
    .nextInt()//Para leer un dato de tipo int.
    .nextLong()//Para leer un dato de tipo long.
    .nextFloat()//""   "" de tipo float.
    .nextDouble()//""   "" de tipo Double
    .nextBoolean()// para dato de tipo boolean.
    .nextLine()// Para leer un string hasta encontrar un salto de linea.
    .next()//Pra leer un string hasta el primer delimitador, como un espacio en blanco o salto de linea.

    //Ejemplo con Scanner:Primero definimos el Sacnner y lueo ingresamos los valores en las variables definidas:
    Scanner scanner;
    Scanner = new Scanner (System.in);

    int num1;
    int num2;
    float coeficiente;
    String nombre;
    char inicial;

    System.out.println("Ingrese primer valor");
    num1= scanner.nextInt();
    System.out.println("Ingrese segundo valor");
    num2= scanner.nextInt();

    System.out.println("Ingrese el coeficiente");
    coeficiente= scanner.nextFloat();

    System.out.println("Ingrese su nombre");
    nombre= scanner.nextLine();
    incial= scanner.charAt(0); // Se obtiene el primer valor, la primer letra.





}