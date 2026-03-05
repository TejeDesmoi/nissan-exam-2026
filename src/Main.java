import data.VehicleDataRepository;
import domain.model.Vehicle;
import domain.usecases.DeleteVehicleUseCase;
import domain.usecases.GetAllVehiclesUseCase;
import presentation.VehicleView;

public class Main {
    public static void main(String[] args) {
        VehicleView vehicleView = new VehicleView();

        vehicleView.deleteAndCheck("3");


    }
}