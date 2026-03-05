package data;

import domain.model.Vehicle;

import java.util.ArrayList;
import java.util.Objects;

public class VehicleMemLocalDataSource {

    private ArrayList<Vehicle> storage = new ArrayList<>();

    public VehicleMemLocalDataSource() {
        initData();
    }

    private void initData(){
        var v1 = new Vehicle("1","Modelo 1","70","3","Rojo");
        storage.add(v1);
        var v2 = new Vehicle("2","Modelo 2","140","2","Azul");
        storage.add(v2);
        var v3 = new Vehicle("3","Modelo 3","20","5","Blanco");
        storage.add(v3);
    }

    public ArrayList<Vehicle> findAll() {
        return storage;
    }

    public void save(Vehicle vehicle) {
        storage.add(vehicle);
    }

    public void delete(String vehicleId) {
        storage.removeIf(vehicle -> Objects.equals(vehicle.getId(), vehicleId));
    }
}
