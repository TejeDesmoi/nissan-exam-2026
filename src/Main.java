import data.VehicleDataRepository;
import domain.model.Vehicle;
import domain.usecases.GetAllVehiclesUseCase;

public class Main {
    public static void main(String[] args) {
        GetAllVehiclesUseCase getVehicleUseCase = new GetAllVehiclesUseCase(VehicleDataRepository.getInstance());

        getVehicleUseCase.execute();
        System.out.println();
    }
}