public static void main(String[] args) {
    //FUNCIONES: En una funcion vamos a definir: que devuelve la funcion, que nombre tiene y los parametros que necesitamos.
    // tipo devuelto nombre (Parametros).

    //El nombre: debe ser lo mas descriptivo posible.
    //Los parametros: puede ser cualquiera mientras se indiquebel tipo de cada uno.
    //ej parametros:
    (int num1, int num2);
    (double importe, String descripcion);
    (int cantidad, int posicion, String nombre);

    //Tipo devuelto: Hay que indicar que tipo tiene lo que devolvemos. ej:
    int suma (int num1, int num2);
    double calcularTotal (double importe, int cantidad);// Estas don funciones definidas con valores de retorno.
    
    //Hay otros tipos de funciones que no devuelven nada, en este caso donde indicamos el tipo devuelto colocaremos la palabra VOID.
    void mostrarMensaje (String mensaje);//Usamos void cuando queremos que nuestra funcion solo realice una serie d pasos o acciones pero no nos devuelva nada.


    //DESARROLLO DE LA FUNCION:
    //1)funcion con valor de retorno:
    public int suma (int num1, num2){
        return num1, num2;//Debemos incluir el return con el valor devuelto.
    };
    //2) funcion sin tipo de retorno:
    void mostrarMensaje(string mensaje){
        System.out.println(mensaje);
    };

//////////////////////////////////////////////////////////////////////////////////////////////////////////
    //ARRAY: En java el array es un objeto y como tal debe usarse el operador new para crear una instancia. Los arrays van a ser de longitud fija, la cual debe definirse en la creacion, siendo inmutable.
    String[] nombres = new String[5].// los primerom[] indcican que es un array, al instanciarlo se debe definir dentro del [], el tamaño de la estructura ([5]);
    //Establecemos valores a un array a traves de su indice, dado que es una estructura fija, no se pueden eleminar elementos.
    nombres[0]="Juan";
    nombres[1]="Mario";
    nombres[2]="Marcelo";
    //Podemos recorrer un array a traves de un ciclo for, while o for each, y tambien usar la propiedad lenght que nos indica el tamaño del array.
    for(int i=0; i<nombres.lenght; i++)
    System.out.println(nombres[i]);

}