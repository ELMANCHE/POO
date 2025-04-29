package parcial_02;


import java.util.Scanner; 

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Bienvenido Potaxie Rent a Car ---");
        System.out.print("Ingresa el nombre mor para que se pueda alquilar: ");
        String nombreAlquilador = scanner.nextLine(); // Read the name input

        System.out.println("\nBienvenido/a, " + nombreAlquilador + "!");


        // 1. Crear objetos de la clase Vehículo (Más modelos, incluyendo Pickups)
        Vehiculo sedan1 = new Vehiculo("Toyota Corolla", 50.0);
        Vehiculo sedan2 = new Vehiculo("Honda Civic", 55.0);
        Vehiculo sedan3 = new Vehiculo("Nissan Sentra", 48.0);
        Vehiculo sedan4 = new Vehiculo("Mazda 3 Sedan", 52.0);
        Vehiculo sedan5 = new Vehiculo("Kia Cerato", 45.0);
        

        Vehiculo deportivo1 = new Vehiculo("Ford Mustang", 100.0);
        Vehiculo deportivo2 = new Vehiculo("Chevrolet Camaro", 110.0);
        Vehiculo deportivo3 = new Vehiculo("Audi Q5", 150.0); // El favorito
        Vehiculo deportivo4 = new Vehiculo("BMW Serie 4 Coupé", 140.0);
        Vehiculo deportivo5 = new Vehiculo("Porsche 911", 250.0);

        Vehiculo pickup1 = new Vehiculo("Ford F-150", 80.0);
        Vehiculo pickup2 = new Vehiculo("Toyota Hilux", 75.0);
        Vehiculo pickup3 = new Vehiculo("Chevrolet Silverado", 85.0);
        Vehiculo pickup4 = new Vehiculo("Nissan Frontier", 70.0);
        Vehiculo pickup5 = new Vehiculo("Volkswagen Amarok", 78.0);

        // Marcar el vehículo favorito
        deportivo3.setEsFavorito(true);


        // Crear objetos de la clase Categoría (Incluyendo Pickups)
        Categoria categoriaSedan = new Categoria("Sedán", "Variado", "Sedán");
        Categoria categoriaDeportivo = new Categoria("Deportivo", "Alto Rendimiento", "Deportivo");
        Categoria categoriaPickup = new Categoria("Pickup", "Carga", "Pickup");

        // Agregar los vehículos a sus respectivas categorías
        System.out.println("\n--- Agregando vehículos a categorías ---");
        System.out.println(categoriaSedan.agregarVehiculo(sedan1));
        System.out.println(categoriaSedan.agregarVehiculo(sedan2));
        System.out.println(categoriaSedan.agregarVehiculo(sedan3));
        System.out.println(categoriaSedan.agregarVehiculo(sedan4));
        System.out.println(categoriaSedan.agregarVehiculo(sedan5));

        System.out.println(categoriaDeportivo.agregarVehiculo(deportivo1));
        System.out.println(categoriaDeportivo.agregarVehiculo(deportivo2));
        System.out.println(categoriaDeportivo.agregarVehiculo(deportivo3));
        System.out.println(categoriaDeportivo.agregarVehiculo(deportivo4));
        System.out.println(categoriaDeportivo.agregarVehiculo(deportivo5));

        System.out.println(categoriaPickup.agregarVehiculo(pickup1));
        System.out.println(categoriaPickup.agregarVehiculo(pickup2));
        System.out.println(categoriaPickup.agregarVehiculo(pickup3));
        System.out.println(categoriaPickup.agregarVehiculo(pickup4));
        System.out.println(categoriaPickup.agregarVehiculo(pickup5));

        // Mostrar los detalles de los vehículos por categoría (incluyendo precios variables y estado de accidente)
        System.out.println("\n--- Información inicial de los vehículos por categoría (con precios variables y estado) ---");
        System.out.println(categoriaSedan.mostrarVehiculo());
        System.out.println(categoriaDeportivo.mostrarVehiculo());
        System.out.println(categoriaPickup.mostrarVehiculo());

        // Demostrar alquiler y devolución (considerando si está accidentado)
        System.out.println("\n--- Intentando alquilar y devolver vehículos para " + nombreAlquilador + " ---");
        System.out.println(sedan1.alquilar()); // Debería alquilar si no está accidentado
        System.out.println(deportivo3.alquilar()); // Intentar alquilar el favorito
        System.out.println(pickup2.alquilar());  // Intentar alquilar una pickup

        System.out.println("\n--- Información después de intentar alquilar ---");
        System.out.println(categoriaSedan.mostrarVehiculo());
        System.out.println(categoriaDeportivo.mostrarVehiculo());
        System.out.println(categoriaPickup.mostrarVehiculo());

        System.out.println("\n--- Devolviendo vehículos ---");
        System.out.println(sedan1.devolver());
        System.out.println(deportivo3.devolver()); // Devolver el favorito si se alquiló
        System.out.println(pickup2.devolver());  // Devolver la pickup si se alquiló

        System.out.println("\n--- Información después de devolver ---");
        System.out.println(categoriaSedan.mostrarVehiculo());
        System.out.println(categoriaDeportivo.mostrarVehiculo());
        System.out.println(categoriaPickup.mostrarVehiculo());

        // Demostración del método adicional (calculando costo total estimado con posible penalidad)
        System.out.println("\n--- Demostración del cálculo de costo total estimado (incluyendo posible penalidad por demora) para " + nombreAlquilador + " ---");
        // Simular alquiler de sedan1 por 7 días con 2 días de demora
        System.out.println(sedan1.calcularCostoTotalEstimado(7, 2));
        // Simular alquiler de deportivo1 por 3 días sin demora
        System.out.println(deportivo1.calcularCostoTotalEstimado(3, 0));
         // Simular alquiler de pickup3 por 10 días con 5 días de demora
        System.out.println(pickup3.calcularCostoTotalEstimado(10, 5));


        // 7. Información de contacto (Fijo en lugar de random)
        System.out.println("\n--- Número de Asistencia/Contacto en Perú ---");
        System.out.println("Para asistencia, contacte al número: (01) 123 4567"); // Número fijo de ejemplo


        // Close the scanner
        scanner.close();
    }

}