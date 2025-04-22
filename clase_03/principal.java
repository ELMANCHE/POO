package clase_03;

class principal {
    public static void main(String[] args) {
        // CREACIÓN DE OBJETOS (USANDO DIFERENTES CONSTRUCTORES)
        Coche[] coches = {
            new Coche(),                // Constructor por defecto
            new Coche("verde"),         // Constructor con 1 parámetro
            new Coche("rojo", 120),     // Constructor con 2 parámetros
            new Coche("amarillo", 100, 3.2f) // Constructor con 3 parámetros
        };

        // SIMULACIÓN DE EVENTOS
        for(Coche coche : coches) {
            System.out.println("\n=== Simulación para coche " + coche.getColor() + " ===");
            
            // Uso de métodos con sobrecarga
            coche.avanzar();            // Llama al método sin parámetros
            coche.avanzar(200);         // Llama al método con 1 parámetro
            coche.avanzar(300, 90);     // Llama al método con 2 parámetros
            
            // Eventos aleatorios
            coche.verificarChoque();
            coche.pasarPeaje();
            coche.verificarMulta();
            coche.verificarAccidente();
            
            // Movimientos
            coche.girarIzquierda();
            coche.girarDerecha();
            coche.parar();
        }
    }
}