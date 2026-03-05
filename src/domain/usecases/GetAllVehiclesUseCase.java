package domain.usecases;

import domain.Interface.IVehicleRepository;
import domain.model.Vehicle;

import java.util.ArrayList;

public class GetAllVehiclesUseCase {
    IVehicleRepository iVehicleRepository;

    public GetAllVehiclesUseCase(IVehicleRepository iVehicleRepository) {
        this.iVehicleRepository = iVehicleRepository;
    }

    public ArrayList<Vehicle> execute(){
        return iVehicleRepository.findAll();
    }
}
