public class Main {
    public static void main(String[] args) {
        UsuarioJuego usuario1 = new UsuarioJuego("jesus", "Jesus123");

        usuario1.aumentarPuntaje();
        System.out.println("tu puntuaje es de :"+usuario1.getPuntaje());

        usuario1.subirNivel();
        System.out.println(" tu nivel es de :"+ usuario1.getNivel());

        usuario1.bonus(3);
    }
}