package domain.Interface;

import domain.model.Vehicle;

import java.util.ArrayList;

public interface IVehicleRepository {
    ArrayList<Vehicle> findAll();
    void save(Vehicle vehicle);
    void delete(String vehicleId);
}
