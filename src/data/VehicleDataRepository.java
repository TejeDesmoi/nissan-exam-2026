package data;

import domain.Interface.IVehicleRepository;
import domain.model.Vehicle;

import java.util.ArrayList;

public class VehicleDataRepository implements IVehicleRepository {
    VehicleMemLocalDataSource vehicleMemLocalDataSource;
    private static VehicleDataRepository instance;

    private VehicleDataRepository(VehicleMemLocalDataSource vehicleMemLocalDataSource) {
        this.vehicleMemLocalDataSource = vehicleMemLocalDataSource;
    }

    @Override
    public ArrayList<Vehicle> findAll() {
        return vehicleMemLocalDataSource.findAll();
    }

    @Override
    public void save(Vehicle vehicle) {
        vehicleMemLocalDataSource.save(vehicle);
    }

    @Override
    public void delete(String vehicleId) {

    }

    public static VehicleDataRepository getInstance(){
        if (instance == null){
            instance = new VehicleDataRepository (new VehicleMemLocalDataSource());
        }

        return instance;
    }
}
