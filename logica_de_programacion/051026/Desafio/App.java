import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ///DEFINICIONES 
        final int PIN_SECRETO = 73742;
        ///PROCESOS,,
        System.out.println("Hola, bienvenido a nuestro servicio de autenticación de usuarios CESDE");
        System.out.println("Por favor ingrese su PIN");
        Scanner leer = new Scanner(System.in);
        int PIN = leer.nextInt();
        if (PIN == PIN_SECRETO) {
            System.out.println("Su PIN es correcto");
        } else {
            System.out.println("Su PIN es incorrecto");
        }
        leer.close();
    }
