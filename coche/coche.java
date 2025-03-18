package coche;

public class coche{

    // atributos o estados
    private String color;
    private int velocidad;
    private float tamano;
    private boolean enMovimiento;


    public coche ( String color, int velocidad, float tamano){
        this.color = color;
        this.velocidad = velocidad;
        this.tamano = tamano;
        this.enMovimiento = velocidad > 0; // Entonces si la velocidad es mayor que 0, el coche está en movimiento

    }

    // Método toString para mostrar las características del coche
    @Override
    public String toString() {
        return "Coche{" +
                "color='" + color + '\'' +
                ", velocidad=" + velocidad +
                ", tamano=" + tamano +
                '}';
    }


    // aca se hace todo para avanzar
    public void avanzar(int incremento) {
        velocidad += incremento;
        System.out.println("El Porsche de color " + color + " acelera a " + velocidad + " km/h.");
    }

    // aca para parar
    public void parar() {
        velocidad = 0;
        System.out.println("El Audi de color " + color + " ha parado completamente.");
    }

    // Método para girar a la izquierda
    public void girarIzquierda() {
        System.out.println("El BMW de color " + color + " gira a la izquierda. Cuidado con el carro al lado tuyo!");
    }

    // Método para girar a la derecha
    public void girarDerecha() {
        System.out.println("El VW de color " + color + " gira a la derecha. choque contra la vegatcionl!");
    }


    // version mas complicada:

       // avanzar
       public void avanzar01(int incremento) {
        if (!enMovimiento && incremento > 0) {
            System.out.println("El coche de color " + color + " arranca.");
        }
        velocidad += incremento;
        enMovimiento = true;
        System.out.println("El Porsche de color " + color + " acelera a " + velocidad + " km/h.");
    }

    // parar
    public void parar01() {
        if (enMovimiento) {
            velocidad = 0;
            enMovimiento = false;
            System.out.println("El Audi de color " + color + " ha parado completamente.");
        } else {
            System.out.println("El coche ya está detenido.");
        }
    }

    // girar a la izquierda
    public void girarIzquierda01() {
        if (enMovimiento) {
            velocidad -= 5; 
            if (velocidad < 0) velocidad = 0;
            System.out.println("El BMW de color " + color + " gira a la izquierda. Velocidad reducida a " + velocidad + " km/h.");
        } else {
            System.out.println("El coche está detenido. No puede girar a la izquierda.");
        }
    }

    // girar a la derecha
    public void girarDerecha01() {
        if (enMovimiento) {
            velocidad -= 5; 
            if (velocidad < 0) velocidad = 0;
            System.out.println("El VW de color " + color + " gira a la derecha. Velocidad reducida a " + velocidad + " km/h.");
        } else {
            System.out.println("El coche está detenido. No puede girar a la derecha.");
        }
    }

    //para obtener la velocidad actual
    public int getVelocidad() {
        return velocidad;
    }
}

