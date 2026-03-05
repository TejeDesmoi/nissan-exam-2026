import data.VehicleDataRepository;
import domain.model.Vehicle;
import domain.usecases.SaveVehicleUseCase;

public class Main {
    public static void main(String[] args) {
        SaveVehicleUseCase saveVehicleUseCase = new SaveVehicleUseCase(VehicleDataRepository.getInstance());

        saveVehicleUseCase.execute(new Vehicle("1","Corolla","70","4","red"));
    }
}