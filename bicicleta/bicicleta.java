package bicicleta;

public class bicicleta {

        // Atributos de la bicicleta
        private int velocidadActual;
        private int platoActual;
        private int piñonActual;
    
        // Constructor que inicializa los atributos
        public bicicleta(int velocidadActual, int platoActual, int piñonActual) {
            this.velocidadActual = velocidadActual;
            this.platoActual = platoActual;
            this.piñonActual = piñonActual;
        }
    
        // Metodo para acelerar (dobla la velocidad actual)
        public void acelerar() {
            velocidadActual *= 2;
            System.out.println("Acelerando! la nueva velocidad es " + velocidadActual + " km/h.");
        }
    
        // Metodo para frenar (reduce la velocidad a la mitad)
        public void frenar() {
            if (velocidadActual > 0) {
                velocidadActual /= 2;
            } else {
                System.out.println("La bicicleta ya está detenida.");
            }
            System.out.println("Nueva velocidad: " + velocidadActual + " km/h.");
        }
        
    
        // Metodo para cambiar el plato
        public void cambiarPlato(int plato) {
            if (plato > 0) {
                this.platoActual = plato;
                System.out.println("Cambio de plato: Ahora estás en el plato " + platoActual + ".");
            } else {
                System.out.println("Plato inválido. Debe ser mayor que 0.");
            }
        }
    
        // Metodo para cambiar el piñón
        public void cambiarPiñon(int piñon) {
            if (piñon > 0) {
                this.piñonActual = piñon;
                System.out.println("Cambio de piñón: Ahora estás en el piñón " + piñonActual + ".");
            } else {
                System.out.println("Piñón inválido. Debe ser mayor que 0.");
            }
        }
    
        // Metodo toString para visualizar el estado de la bicicleta
        @Override
        public String toString() {
            return "@-/--/-@ Bicicleta{" +
                    "Velocidad=" + velocidadActual + " km/h" +
                    ", Plato=" + platoActual +
                    ", Piñón=" + piñonActual +
                    '}';
        }
    
}
