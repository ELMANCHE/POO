package ultima_practica;

public class BicicletaMontana extends Bicicleta {
    private int suspension;  

    public BicicletaMontana(int velocidadInicial, int platoInicial, int pinonInicial, int suspensionInicial) {
        super(velocidadInicial, platoInicial, pinonInicial);
        this.suspension = suspensionInicial;
    }

    public void cambiarSuspension(int nuevaSuspension) {
        this.suspension = nuevaSuspension;
    }

    @Override
    public int calcularVelocidadSubida(int inclinacion) {
        int base = super.calcularVelocidadSubida(inclinacion);
        int ajuste = suspension / 200;
        return Math.max(base + ajuste, 1);
    }
}



