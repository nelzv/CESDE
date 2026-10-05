import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ///DEFINICIONES 
        final int PIN_SECRETO = 73742;
        Scanner leer = new Scanner(System.in);
        ///PROCESOS,,
        System.out.println("Hola, bienvenido a nuestro servicio de autenticación de usuarios banco CESDE");
        System.out.println("Por favor ingrese su PIN");
        int pinInput = leer.nextInt();
        if (pinInput == PIN_SECRETO) {
            System.out.println("Bienvenido a su cuenta bancaria");
        } else {
            System.out.println("PIN incorrecto. Por seguridad el sistema se cerrará.");
        }
        leer.close();
        } 
    }
