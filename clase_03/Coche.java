package clase_03;

public class Coche {
    // Atributos
    private String color;
    private int velocidad;
    private float tamaño;

    //  PARTE DE CONSTRUCTORES

    // Constructor por defecto
    public Coche() {
        this.color = "desconocido";
        this.velocidad = 0;
        this.tamaño = 0.0f;
    }

    // Constructor con 1 parámetro (sobrecarga de constructor)
    public Coche(String color) {
        this.color = color;
        this.velocidad = 0;
        this.tamaño = 0.0f;
    }

    // Constructor con 2 parámetros (sobrecarga de constructor)
    public Coche(String color, int velocidad) {
        this.color = color;
        this.velocidad = velocidad;
        this.tamaño = 0.0f;
    }

    // Constructor con 3 parámetros (sobrecarga de constructor)
    public Coche(String color, int velocidad, float tamaño) {
        this.color = color;
        this.velocidad = velocidad;
        this.tamaño = tamaño;
    }

    //  PARTE DE SOBRECARGA DE MÉTODOS

    // Método avanzar sin parámetros
    public void avanzar() {
        System.out.printf("El coche %s avanza a %d km/h.%n", color, velocidad);
    }

    // Sobrecarga de avanzar: acepta distancia en metros
    public void avanzar(int metros) {
        System.out.printf("El coche %s avanza %d metros a %d km/h.%n", color, metros, velocidad);
    }

    // Sobrecarga de avanzar: acepta distancia y nueva velocidad
    public void avanzar(int metros, int nuevaVelocidad) {
        System.out.printf("El coche %s avanza %d metros, cambiando la velocidad a %d km/h.%n",
                color, metros, nuevaVelocidad);
        this.velocidad = nuevaVelocidad;
    }

    public void parar() {
        System.out.printf("El coche %s se ha detenido.%n", color);
        this.velocidad = 0;
    }

    public void girarIzquierda() {
        System.out.printf("El coche %s gira a la izquierda.%n", color);
    }

    public void girarDerecha() {
        System.out.printf("El coche %s gira a la derecha.%n", color);
    }

    // Getters y setters (opcionales)
    public String getColor() {
        return color;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public float getTamaño() {
        return tamaño;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void setTamaño(float tamaño) {
        this.tamaño = tamaño;
    }
}
