package bicicleta;

public class ejemplo2poo {

    public static void main(String[] args) {
        // Creare dos bicicletas con valores diferentes
        bicicleta miBicicleta = new bicicleta(15, 5, 3);
        bicicleta tuBicicleta = new bicicleta(20, 6, 5);

        // Mostrar características iniciales
        System.out.println("Estado inicial de las bicicletas:");
        System.out.println(miBicicleta);
        System.out.println(tuBicicleta);
        System.out.println("------------------------------");

        // Acciones con las bicicletas
        miBicicleta.acelerar();
        tuBicicleta.frenar();
        miBicicleta.cambiarPlato(7);
        tuBicicleta.cambiarPiñon(2);
        System.out.println("------------------------------");

        // Mostrar estado final después de los cambios
        System.out.println("Estado final de las bicicletas:");
        System.out.println(miBicicleta);
        System.out.println(tuBicicleta);
    }
    
}
