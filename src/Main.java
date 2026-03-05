import data.VehicleDataRepository;
import domain.model.Vehicle;
import domain.usecases.DeleteVehicleUseCase;
import domain.usecases.GetAllVehiclesUseCase;

public class Main {
    public static void main(String[] args) {
        GetAllVehiclesUseCase getVehicleUseCase = new GetAllVehiclesUseCase(VehicleDataRepository.getInstance());
        DeleteVehicleUseCase deleteVehicleUseCase = new DeleteVehicleUseCase(VehicleDataRepository.getInstance());

        getVehicleUseCase.execute();

        deleteVehicleUseCase.execute("1");

        getVehicleUseCase.execute();
        System.out.println();


    }
}