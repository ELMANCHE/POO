package ultima_practica;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce grados de inclinación de la montaña: ");
        int grados = sc.nextInt();
        sc.close();

        Montana montana = new Montana(grados);
        BicicletaMontana mtb = new BicicletaMontana(10, 3, 2, 120);
        BicicletaTandem tandem = new BicicletaTandem(10, 3, 2, 2);

        
        mtb.cambiarPlato(2);
        mtb.cambiarPinon(4);
        mtb.cambiarSuspension(140);

        tandem.cambiarPlato(3);
        tandem.cambiarPinon(5);
        tandem.setNumAsientos(5);

        int velocidadMtb = mtb.calcularVelocidadSubida(montana.getInclinacionGrados());
        int velocidadTandem = tandem.calcularVelocidadSubida(montana.getInclinacionGrados());

        System.out.println("Velocidad de subida Bicicleta de Montaña: " + velocidadMtb + " km/h");
        System.out.println("Velocidad de subida Bicicleta Tándem: "         + velocidadTandem + " km/h");
    }
}




