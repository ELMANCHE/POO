package clase_03;

import java.util.ArrayList;
import java.util.List;

public class Coche {
    private String color;
    private int velocidad;
    private float tamaño;
    private int x;
    private int y;
    private Direccion direccion;
    private static List<Coche> coches = new ArrayList<>();

    private enum Direccion {
        NORTE, SUR, ESTE, OESTE
    }

    public Coche(String color, int velocidad, float tamaño) {
        this.color = color;
        this.velocidad = velocidad;
        this.tamaño = tamaño;
        this.x = 0;
        this.y = 0;
        this.direccion = Direccion.ESTE;
        coches.add(this);
    }

    // Método para girar a la izquierda (JAVA 8 compatible)
    public void girarIzquierda() {
        switch (direccion) {
            case NORTE:
                direccion = Direccion.OESTE;
                break;
            case SUR:
                direccion = Direccion.ESTE;
                break;
            case ESTE:
                direccion = Direccion.NORTE;
                break;
            case OESTE:
                direccion = Direccion.SUR;
                break;
        }
        System.out.println("Girando izquierda. Dirección: " + direccion);
    }

    // Método para girar a la derecha (JAVA 8 compatible)
    public void girarDerecha() {
        switch (direccion) {
            case NORTE:
                direccion = Direccion.ESTE;
                break;
            case SUR:
                direccion = Direccion.OESTE;
                break;
            case ESTE:
                direccion = Direccion.SUR;
                break;
            case OESTE:
                direccion = Direccion.NORTE;
                break;
        }
        System.out.println("Girando derecha. Dirección: " + direccion);
    }

    // Método para avanzar (JAVA 8 compatible)
    public void avanzar(int metros) {
        int nuevaX = x;
        int nuevaY = y;

        // Calcular nueva posición (JAVA 8 compatible)
        switch (direccion) {
            case NORTE:
                nuevaY += metros;
                break;
            case SUR:
                nuevaY -= metros;
                break;
            case ESTE:
                nuevaX += metros;
                break;
            case OESTE:
                nuevaX -= metros;
                break;
        }

        // Verificar colisiones
        for (Coche otro : coches) {
            if (otro != this && nuevaX == otro.x && nuevaY == otro.y) {
                System.out.println("⚠️ ¡Colisión detectada con " + otro.color + "!");
                parar();
                return;
            }
        }

        // Actualizar posición
        x = nuevaX;
        y = nuevaY;
        System.out.println("Avanzando a (" + x + "," + y + ")");
    }

    // Sobrecargas
    public void avanzar() { avanzar(1); }
    public void avanzar(int metros, int velocidad) {
        this.velocidad = velocidad;
        avanzar(metros);
    }

    // Parar
    public void parar() {
        velocidad = 0;
        System.out.println("🛑 " + color + " se detuvo en (" + x + "," + y + ")");
    }
}



// hola como estas 