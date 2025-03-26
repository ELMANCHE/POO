package clase_02;

class Rueda {
    private double diametro;
    private String fabricante;

    public Rueda(double diametro, String fabricante) {
        this.diametro = diametro;
        this.fabricante = fabricante;
    }

    public void girar(int numero) { 
        System.out.println("La rueda " + numero + " de " + fabricante + " está girando.");
    }
}
