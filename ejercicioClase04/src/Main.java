public class Main {
    public static void main(String[] args) {
       Cliente cliente = new Cliente( 101, "David");

       cliente.getNombre();
        System.out.println(cliente.getNombre());
       cliente.setNombre("Enzo");
        System.out.println(cliente.getNombre());

        cliente.incrementarDeuda(500.0);
        cliente.incrementarDeuda(200.0);

        cliente.pagarDeuda();

    }
}