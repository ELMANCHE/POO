package clase_02;

public class Main {
    public static void main(String[] args) {
        Rueda[] ruedas = {
            new Rueda(20, "Dunlop"),
            new Rueda(23, "Dunlop"),
            new Rueda(22, "Dunlop"),
            new Rueda(24, "Dunlop")
        };

        Motor motor = new Motor("Diesel", 100, 50.0f); //litros de combustible
        Coche miCoche = new Coche("Verde", 80, 3.2f, ruedas, motor);

        miCoche.avanzar(20); // Avanza 20 km
        miCoche.avanzar(30); // Avanza 30 km
        miCoche.avanzar(40); // Avanza 40 km

    }
}