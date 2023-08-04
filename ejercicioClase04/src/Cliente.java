public class Cliente {
    private Integer numeroCliente;
    private String nombre;
    private Double deuda;

    public Cliente( Integer numeroCliente, String nombre){
       this.numeroCliente=numeroCliente; //this va a indicar de que clase se esta hablando
       this.nombre=nombre;
       this.deuda = 0.0;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;

    }

    public void incrementarDeuda(Double valor){
        System.out.println("tu deuda anterior era:" + deuda);
        deuda+=valor;
        System.out.println("tu deuda actual es " + deuda);

    }

    public void pagarDeuda(){
        deuda=0.0;
    }


}
