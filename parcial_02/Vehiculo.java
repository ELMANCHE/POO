package parcial_02;

import java.util.Random;

public class Vehiculo {
    private String modelo;
    private double precioPorDiaBase; // Precio base estipulado
    private double precioPorDiaActual; // Precio que puede variar
    private boolean disponible;
    private boolean accidentado; 
    private boolean esFavorito; 
    private double penalidadPorDiaDemora; 

    private static final double INCREMENTO_MAXIMO = 0.30; // 30%
    private static final double PROBABILIDAD_ACCIDENTE = 0.15; // 15% de probabilidad de estar accidentado
    private static final double PENALIDAD_MINIMA = 10.0; // Penalidad mínima en Soles
    private static final double PENALIDAD_MAXIMA = 50.0; // Penalidad máxima en Soles

    // Constructor
    public Vehiculo(String modelo, double precioPorDiaBase) {
        this.modelo = modelo;
        this.precioPorDiaBase = precioPorDiaBase;
        this.disponible = true; 
        this.esFavorito = false; 
        this.penalidadPorDiaDemora = generarPenalidadRandom(); // Genera penalidad al crear

        // Lógica para determinar si está accidentado de forma random
        Random random = new Random();
        this.accidentado = random.nextDouble() < PROBABILIDAD_ACCIDENTE;

        // Inicializar precio actual con posible variación
        actualizarPrecioRandom();
    }

    // Métodos

    // Método para actualizar el precio con variación random
    public void actualizarPrecioRandom() {
        Random random = new Random();
        // Aseguramos que no baje de precioBase
        double factorCambio = -0.10 + (0.40 * random.nextDouble()); // Rango total de 0.40 (desde -0.10 hasta +0.30)
        this.precioPorDiaActual = this.precioPorDiaBase * (1 + factorCambio);

        // Asegurarse que el precio actual no sea menor al base
        if (this.precioPorDiaActual < this.precioPorDiaBase) {
            this.precioPorDiaActual = this.precioPorDiaBase;
        }
        // Asegurarse que el precio actual no supere el 30% del base
        if (this.precioPorDiaActual > this.precioPorDiaBase * (1 + INCREMENTO_MAXIMO)) {
             this.precioPorDiaActual = this.precioPorDiaBase * (1 + INCREMENTO_MAXIMO);
        }
    }


    // Método para generar una penalidad random por día de demora
    private double generarPenalidadRandom() {
        Random random = new Random();
        return PENALIDAD_MINIMA + (PENALIDAD_MAXIMA - PENALIDAD_MINIMA) * random.nextDouble();
    }

    public String alquilar() {
        if (this.disponible && !this.accidentado) {
            this.disponible = false;
            return "El vehículo " + this.modelo + " ha sido alquilado.";
        } else if (this.accidentado) {
            return "El vehículo " + this.modelo + " no se puede alquilar porque está accidentado.";
        }
        else {
            return "El vehículo " + this.modelo + " no está disponible para alquilar.";
        }
    }

    public String devolver() {
        if (!this.disponible) {
            this.disponible = true;
            return "El vehículo " + this.modelo + " ha sido devuelto.";
        } else {
            return "El vehículo " + this.modelo + " ya estaba disponible.";
        }
    }

    public String mostrarInformacion() {
        String disponibilidad = this.disponible ? "Disponible" : "No disponible";
        String estadoAccidente = this.accidentado ? ", Estado: Accidentado" : ", Estado: OK";
        String favoritoInfo = this.esFavorito ? " (FAVORITO)" : "";
        return "Modelo: " + this.modelo + favoritoInfo + ", Precio por Día: S/." + String.format("%.2f", this.precioPorDiaActual) + ", Disponibilidad: " + disponibilidad + estadoAccidente;
    }

     // Método adicional 
    // Calcula el costo total estimado del alquiler por un número de días,
    // y agrega una posible penalidad random por demora (simulado)
    public String calcularCostoTotalEstimado(int numeroDias, int diasDemora) {
        double costoAlquiler = this.precioPorDiaActual * numeroDias;
        double costoPenalidad = this.penalidadPorDiaDemora * diasDemora;
        double costoTotal = costoAlquiler + costoPenalidad;

        String infoCosto = "Costo estimado de alquiler (" + numeroDias + " días): S/." + String.format("%.2f", costoAlquiler);
        if (diasDemora > 0) {
             infoCosto += " + Penalidad por demora (" + diasDemora + " días @ S/." + String.format("%.2f", this.penalidadPorDiaDemora) + "/día): S/." + String.format("%.2f", costoPenalidad);
             infoCosto += " = Costo Total Estimado: S/." + String.format("%.2f", costoTotal);
        } else {
             infoCosto += " (Sin penalidad por demora)";
             infoCosto += " = Costo Total Estimado: S/." + String.format("%.2f", costoTotal);
        }
        return infoCosto;
    }
    // esta parte es para que el metodo principal imprima porque no son privados
    public void setEsFavorito(boolean esFavorito) {
        this.esFavorito = esFavorito;
    }

    
    public String getModelo() {
        return modelo;
    }

    public double getPrecioPorDiaBase() {
        return precioPorDiaBase;
    }

    public double getPrecioPorDiaActual() {
        return precioPorDiaActual;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public boolean isAccidentado() {
        return accidentado;
    }

     public double getPenalidadPorDiaDemora() {
        return penalidadPorDiaDemora;
    }
}