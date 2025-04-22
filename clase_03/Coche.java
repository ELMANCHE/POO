package clase_03;

import java.util.Random;

public class Coche {
    // ATRIBUTOS
    private String color;
    private int velocidad;
    private float tamaño;
    private Random random = new Random();

    // CONSTRUCTORES (SOBRECARGA DE CONSTRUCTORES)
    
    // Constructor por defecto (sin parámetros)
    public Coche() {
        this.color = "Potaxie";
        this.velocidad = 0;
        this.tamaño = 0.0f;
    }

    // Constructor con 1 parámetro (sobrecarga)
    public Coche(String color) {
        this.color = color;
        this.velocidad = 0;
        this.tamaño = 0.0f;
    }

    // Constructor con 2 parámetros (sobrecarga)
    public Coche(String color, int velocidad) {
        this.color = color;
        this.velocidad = velocidad;
        this.tamaño = 0.0f;
    }

    // Constructor con 3 parámetros (sobrecarga)
    public Coche(String color, int velocidad, float tamaño) {
        this.color = color;
        this.velocidad = velocidad;
        this.tamaño = tamaño;
    }

    // MÉTODOS DE CONDUCCIÓN (CON SOBRECARGA)
    
    // Método base sin parámetros
    public void avanzar() {
        System.out.printf("El coche %s avanza a %d km/h.%n", color, velocidad);
    }

    // Sobrecarga con distancia en metros
    public void avanzar(int metros) {
        System.out.printf("El coche %s avanza %d metros a %d km/h.%n", 
                        color, metros, velocidad);
    }

    // Sobrecarga con distancia y cambio de velocidad
    public void avanzar(int metros, int nuevaVelocidad) {
        System.out.printf("El coche %s avanza %d metros, cambiando velocidad a %d km/h.%n",
                        color, metros, nuevaVelocidad);
        this.velocidad = nuevaVelocidad;
    }

    // Método para detener
    public void parar() {
        System.out.printf("El coche %s se ha detenido.%n", color);
        this.velocidad = 0;
    }

    // Métodos para giros
    public void girarIzquierda() {
        System.out.printf("El coche %s gira a la izquierda.%n", color);
    }

    public void girarDerecha() {
        System.out.printf("El coche %s gira a la derecha.%n", color);
    }

    // EVENTOS ALEATORIOS     
    
    // Verificar choques (10% probabilidad)
    public void verificarChoque() {
        if(random.nextInt(100) < 10) {
            System.out.printf("¡El coche %s ha chocado! Requiere reparación.%n", color);
        } else {
            System.out.printf("El coche %s evitó un choque.%n", color);
        }
    }

    // Pagar peaje (costo aleatorio)
    public void pasarPeaje() {
        int costo = random.nextInt(50) + 10;
        System.out.printf("El coche %s pagó $%d en el peaje.%n", color, costo);
    }

    // Verificar multas (20% probabilidad)
    public void verificarMulta() {
        if(random.nextInt(100) < 20) {
            int multa = random.nextInt(200) + 50;
            System.out.printf("¡Multado! El coche %s debe pagar $%d.%n", color, multa);
        } else {
            System.out.printf("El coche %s no recibió multas.%n", color);
        }
    }

    // Verificar accidentes (5% probabilidad)
    public void verificarAccidente() {
        if(random.nextInt(100) < 5) {
            System.out.printf("¡Accidente! El coche %s necesita asistencia.%n", color);
        } else {
            System.out.printf("El coche %s circula con seguridad.%n", color);
        }
    }

    // GETTERS Y SETTERS
    public String getColor() { return color; }
    public int getVelocidad() { return velocidad; }
    public float getTamaño() { return tamaño; }
    public void setColor(String color) { this.color = color; }
    public void setVelocidad(int velocidad) { this.velocidad = velocidad; }
    public void setTamaño(float tamaño) { this.tamaño = tamaño; }
}

