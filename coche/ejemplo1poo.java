package coche;

public  class ejemplo1poo{
    public static void main (String[]args){
        coche miCoche = new coche (" verde ", 90, 3.2f);
        coche tuCoche = new coche (" rojo ", 120, 4.1f);
        coche suCoche = new coche (" amarillo ", 100, 3.4f);

        System.out.println(" las caracteristica de mi coche son:"+miCoche);
        System.out.println(" las caracteristica de tu coche son:"+tuCoche);
        System.out.println(" las caracteristica de su coche son:"+suCoche);


        System.out.println("a continuacion se imprimen las características de los coches:");
        System.out.println(miCoche);
        System.out.println(tuCoche);
        System.out.println(suCoche);
        System.out.println("------------------------------");

        // Acciones con los coches
        miCoche.avanzar(10);
        tuCoche.girarIzquierda();
        suCoche.girarDerecha();
        suCoche.parar();
        System.out.println("------------------------------");

        miCoche.avanzar01(10);
        tuCoche.girarIzquierda01();
        suCoche.girarDerecha01();
        suCoche.parar01();

    }

}