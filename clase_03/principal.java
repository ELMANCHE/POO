package clase_03;

public class principal {
    public static void main(String[] args) {
        Coche miCoche = new Coche("verde", 80, 3.2f);
        Coche tuCoche = new Coche("rojo", 120, 4.1f);
        
        // Movimientos que provocan colisión
        miCoche.avanzar(5); // Posición (5,0)
        tuCoche.girarDerecha(); // Dirección: Sur
        tuCoche.avanzar(5); // Intenta ir a (0,-5)
        tuCoche.girarIzquierda(); // Dirección: Este
        tuCoche.avanzar(5); // ¡Colisión en (5,0)!
    }
}