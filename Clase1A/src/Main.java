public class Main {
    public static void main(String[] args) {
        Integer numeroA=10;
        Integer numeroB=2;

        if (numeroA % numeroB == 0){
            System.out.println( "Si es divisible");
        }
        else{
            System.out.println( " No es divisible");
        };

        String mascota= "Manchita";
        int edad = 2;
        double peso=1.4;
        String sonido = "GuauGuau";

        System.out.println("la primer mascota," + mascota + " tiene " + edad + " anios. Pesa " + peso + " kilos " + " y hace " + sonido);
    }
}