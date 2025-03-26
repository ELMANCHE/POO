package clase_02;

class Motor {
    private String tipo;
    private float combustible;
    private int caballos;

    public Motor(String tipo, int caballos, float combustible) {
        this.tipo = tipo;
        this.caballos = caballos;
        this.combustible = combustible;
    }

    public float getCombustible() {
        return combustible;
    }

    public void inyectarCarburante(float cantidad) {
        if (combustible >= cantidad) {
            combustible -= cantidad;
            System.out.println("Se han consumido " + cantidad + "L de combustible. Restante: " + combustible + "L");
        } else {
            System.out.println("No hay suficiente combustible para continuar.");
            combustible = 0; // Evita que tenga valores negativos
        }
    }
}

