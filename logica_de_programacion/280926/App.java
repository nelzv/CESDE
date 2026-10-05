

public class App {
    public static void main(String[] args) {
        //Definición
        //Entrada
        double PRECIOUNITARIO = 1000;
        double PESOKILOGRAMOS = 15;
        int UNIDADESPRODUCTO = 60;
        double SALDODISPONIBLE = 100000;
        boolean esPedidoViable;
        //Proceso
        esPedidoViable = (UNIDADESPRODUCTO > 50) && ((PRECIOUNITARIO * UNIDADESPRODUCTO) <= SALDODISPONIBLE) && (PESOKILOGRAMOS * UNIDADESPRODUCTO <= 750);

        System.out.println("EL pedido es viable: " + esPedidoViable);
      /*  System.out.println("Hola, quiuvo");
        //Definir
 
        String nombre = "Santiago";
         boolean puedeEntrar;
       int edad = 17;
        puedeEntrar = edad >= 18;

        System.out.println(nombre +"Puede entrar" + puedeEntrar);

*/

    }

}