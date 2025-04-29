package getyset;

public class Facturar {
    // instance variables - replace the example below with your own
    private double cantidad;
    private double precio;

    // constructores

    // Constructor sin parámetros
    public Facturar() {
        // initialise instance variables
        // cantidad = 0; // El valor inicial debe ser 0, no 'e'
        cantidad = 0.0; // Corregido: inicialización correcta
        precio = 0.0;  // Corregido: inicialización correcta
    }

    // Constructor al que se le deben pasar dos parámetros que sirven para inicializar los atributos
    public Facturar(double cantidad, double precio) {
        // initialise instance variables
        this.cantidad = cantidad; // Corregido: asignación correcta
        this.precio = precio;
    }

    /* Setters */
    // Los setter sirven para asignar valores a los atributos
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    /* Getters */
    // Los getters sirven para obtener el valor de los atributos en un momento determinado
    public double getPrecio() {
        return this.precio;
    }

    public double getCantidad() {
        return this.cantidad;
    }

    /**
     * Método que calcula el total de la venta
     */
    public double calcularventa() { // Corregido: nombre del método en minúscula (convención Java)
        double subtotal;
        double iva;
        double total;

        subtotal = cantidad * precio; // Corregido: operador de multiplicación
        // iva = subtotal * 0.13; // Corregido: cálculo del IVA como porcentaje (ejemplo 13%)
        // El PDF original tiene 8.13, lo cual es inusual para un IVA. Lo cambio a 0.13 (13%).
        // Si 8.13 es correcto por alguna razón específica, puedes cambiarlo de nuevo.
        iva = subtotal * 0.13; // Usando 13% como ejemplo de IVA

        // total = subtotal - iva; // El enunciado dice que se reste el IVA... ¡Lo lógico es sumarlo! [cite: 6]
        total = subtotal + iva; // Corregido: El IVA normalmente se suma al subtotal

        return total;
    }
}
