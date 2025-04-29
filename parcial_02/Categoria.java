package parcial_02;

import java.util.ArrayList;
import java.util.List;

public class Categoria {
    private String nombre;
    private String modelo;
    private String tipo_Vehiculo;
    private List<Vehiculo> vehiculos;

    // Constructor
    public Categoria(String nombre, String modelo, String tipo_Vehiculo) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.tipo_Vehiculo = tipo_Vehiculo;
        this.vehiculos = new ArrayList<>();
    }

    // Métodos
    public String agregarVehiculo(Vehiculo vehiculo) {
        if (vehiculo != null) {
            this.vehiculos.add(vehiculo);
            return "Vehículo '" + vehiculo.getModelo() + "' agregado a la categoría '" + this.nombre + "'.";
        } else {
            return "No se puede agregar un vehículo nulo.";
        }
    }

    public String mostrarVehiculo() {
        if (!this.vehiculos.isEmpty()) {
            StringBuilder info = new StringBuilder();
            info.append("Categoría: ").append(this.nombre).append(", Tipo de Vehículo: ").append(this.tipo_Vehiculo).append("\nVehículos en esta categoría:");
            for (Vehiculo vehiculo : this.vehiculos) {
                info.append("\n- ").append(vehiculo.mostrarInformacion());
            }
            return info.toString();
        } else {
            return "La categoría '" + this.nombre + "' no tiene vehículos asignados.";
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public String getTipo_Vehiculo() {
        return tipo_Vehiculo;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }
}
