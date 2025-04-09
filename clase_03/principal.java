package clase_03;

// Principal.java
public class principal {
    public static void main(String[] args) {
        //  USO DE CONSTRUCTORES

        Coche cocheDefecto    = new Coche();                   // constructor por defecto
        Coche cocheColor      = new Coche("verde");            // constructor con 1 parámetro
        Coche cocheColorVel   = new Coche("rojo", 120);        // constructor con 2 parámetros
        Coche cocheCompleto   = new Coche("amarillo", 100, 3.2f); // constructor con 3 parámetros

        //  DEMOSTRACIÓN DE SOBRECARGA DE MÉTODOS

        System.out.println("=== Coche por defecto ===");
        cocheDefecto.avanzar();             // método avanzar()
        cocheDefecto.setVelocidad(50);
        cocheDefecto.avanzar(200);          // método avanzar(int metros)
        cocheDefecto.parar();

        System.out.println("\n=== Coche solo color ===");
        cocheColor.avanzar();
        cocheColor.setVelocidad(80);
        cocheColor.avanzar(150, 90);        // método avanzar(int metros, int nuevaVelocidad)
        cocheColor.girarIzquierda();
        cocheColor.parar();

        System.out.println("\n=== Coche color + velocidad ===");
        cocheColorVel.avanzar();
        cocheColorVel.avanzar(300);
        cocheColorVel.girarDerecha();
        cocheColorVel.parar();

        System.out.println("\n=== Coche completo ===");
        cocheCompleto.avanzar();
        cocheCompleto.avanzar(500, 110);
        cocheCompleto.girarIzquierda();
        cocheCompleto.girarDerecha();
        cocheCompleto.parar();
    }
}
