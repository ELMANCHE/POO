package ultima_practica;


public class Bicicleta {
    protected int velocidadActual;    // km/h
    protected int platoActual;        // número de plato
    protected int pinonActual;        // número de piñón

    public Bicicleta(int velocidadInicial, int platoInicial, int pinonInicial) {
        this.velocidadActual = velocidadInicial;
        this.platoActual     = platoInicial;
        this.pinonActual     = pinonInicial;
    }

    public void acelerar() {
        velocidadActual++;
    }

    public void frenar() {
        if (velocidadActual > 0) velocidadActual--;
    }

    public void cambiarPlato(int plato) {
        this.platoActual = plato;
    }

    public void cambiarPinon(int pinon) {
        this.pinonActual = pinon;
    }

    
    //Esta parte calcula velocidad la subida: velocidadActual - (inclinación/5), mínimo 1 km/h
    public int calcularVelocidadSubida(int inclinacion) {
        int vs = velocidadActual - inclinacion / 5;
        return Math.max(vs, 1);
    }
}



