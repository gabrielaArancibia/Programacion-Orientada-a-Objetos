public class NuevaClase { //spungamos que la nueva clase se llama Articulo

    //definimos atributos de la nueva clase en private
    private String descripcion;
    private double precioVenta;
    private int stock;

    //Definimos constructores:
    public NuevaClase (String descripcion, int cantidad,double precio){ //El constructor se llama igual que la clase y recibe como parametro los valors que se desean asignar a los atributos.
        this.descripcion=descripcion; //hace referencia al objeto con que se esta trabajando
        precioVenta= precio;
        stock= cantidad;


    // definimos metodos:
    public boolean hayStock (){
        return stock>0;
        };

    public double consultarPrecio() {
        return precioVenta;
        };


    //metodos get y set
        public String getDescripcion(){
            return descripcion;
        }
        public double getPrecioVenta(){    // get permite acceder al valor del atributo para hacer una consulta
            return precioVenta;
        }
        public int getStock(){
            return stock;
        }

        public void setDescripcion(String descripcion){
            this.descripcion=descripcion;
        };
        public void setPrecioVentas( double precio){     //Permiten cambiar un valor
            precioVenta=precio;
        };
        public void setStock (int stock){
            this.stock=stock;
        };
    }



}
