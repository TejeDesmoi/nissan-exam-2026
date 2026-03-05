package domain.usecases;

import domain.Interface.IVehicleRepository;
import domain.model.Vehicle;

public class SaveVehicleUseCase {
    IVehicleRepository iVehicleRepository;

    public SaveVehicleUseCase(IVehicleRepository iVehicleRepository) {
        this.iVehicleRepository = iVehicleRepository;
    }

    public void execute(Vehicle vehicle){
        iVehicleRepository.save(vehicle);
    }
}
