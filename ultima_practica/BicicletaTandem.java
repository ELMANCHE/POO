package ultima_practica;


public class BicicletaTandem extends Bicicleta {
    private int numAsientos;

    public BicicletaTandem(int velocidadInicial, int platoInicial, int pinonInicial, int numAsientos) {
        super(velocidadInicial, platoInicial, pinonInicial);
        this.numAsientos = numAsientos;
    }

    public void setNumAsientos(int numAsientos) {
        this.numAsientos = numAsientos;
    }

    @Override
    public int calcularVelocidadSubida(int inclinacion) {
        int base = super.calcularVelocidadSubida(inclinacion);
        int ajuste = numAsientos / 2;
        return Math.max(base - ajuste, 1);
    }
}


