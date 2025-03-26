package clase_02;


class Coche {
    private String color;
    private int velocidad;
    private float tamano;
    private Rueda[] ruedas;
    private Motor motor;

    public Coche(String color, int velocidad, float tamano, Rueda[] ruedas, Motor motor) {
        this.color = color;
        this.velocidad = velocidad;
        this.tamano = tamano;
        this.ruedas = ruedas;
        this.motor = motor;
    }

    public void avanzar(int distancia) {
        if (motor.getCombustible() > 0) {
            System.out.println("El coche de color " + color + " avanza " + distancia + " km.");
            float combustibleInicial = motor.getCombustible();
    
            // Reducimos el combustible basado en la distancia recorrida
            motor.inyectarCarburante(distancia * 0.5f); // Consumo de 0.5L por km
    
            // Determinar la dirección de las ruedas delanteras (aleatoria o fija según necesidad)
            String direccionDelantera = Math.random() > 0.5 ? "derecha" : "izquierda";
            System.out.println("Las ruedas delanteras (1 y 2) giran juntas a la " + direccionDelantera + ".");
    
            // Ruedas traseras giran normalmente
            for (int i = 2; i < ruedas.length; i++) {
                System.out.println("La rueda " + (i + 1) + " (trasera) gira normalmente.");
            }
    
            float combustibleFinal = motor.getCombustible();
            System.out.println("Estado final: Combustible inicial: " + combustibleInicial + "L, restante: " + combustibleFinal + "L\n");
    
            if (combustibleFinal <= 0) {
                System.out.println("El coche se ha detenido por falta de combustible.");
            }
        } else {
            System.out.println("El coche no puede avanzar por falta de combustible.");
        }
    }
       
    
}













