package domain.usecases;

import domain.Interface.IVehicleRepository;

public class DeleteVehicleUseCase {
    IVehicleRepository iVehicleRepository;

    public DeleteVehicleUseCase(IVehicleRepository iVehicleRepository) {
        this.iVehicleRepository = iVehicleRepository;
    }

    public void execute(String vehicleId){
        iVehicleRepository.delete(vehicleId);
    }
}
