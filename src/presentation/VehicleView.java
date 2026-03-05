package presentation;

import data.VehicleDataRepository;
import domain.model.Vehicle;
import domain.usecases.DeleteVehicleUseCase;
import domain.usecases.GetAllVehiclesUseCase;
import domain.usecases.SaveVehicleUseCase;

import java.util.ArrayList;

public class VehicleView {
    public void addAndCheck(Vehicle vehicle){
        ArrayList<Vehicle> vehicles;
        GetAllVehiclesUseCase getAllVehiclesUseCase = new GetAllVehiclesUseCase(VehicleDataRepository.getInstance());
        SaveVehicleUseCase saveVehicleUseCase = new SaveVehicleUseCase(VehicleDataRepository.getInstance());

        vehicles = getAllVehiclesUseCase.execute();

        for (Vehicle v : vehicles){
            System.out.println(v.getId());
            System.out.println(v.getModel());
            System.out.println(v.getHp());
            System.out.println(v.getDoorsNumber());
            System.out.println(v.getColor());
        }

        saveVehicleUseCase.execute(vehicle);

        vehicles = getAllVehiclesUseCase.execute();

        for (Vehicle v : vehicles){
            System.out.println(v.getId());
            System.out.println(v.getModel());
            System.out.println(v.getHp());
            System.out.println(v.getDoorsNumber());
            System.out.println(v.getColor());
        }

    }
    public void visualization(){
        ArrayList<Vehicle> vehicles;
        GetAllVehiclesUseCase getAllVehiclesUseCase = new GetAllVehiclesUseCase(VehicleDataRepository.getInstance());

        vehicles = getAllVehiclesUseCase.execute();

        for (Vehicle v : vehicles){
            System.out.println(v.getId());
            System.out.println(v.getModel());
            System.out.println(v.getHp());
            System.out.println(v.getDoorsNumber());
            System.out.println(v.getColor());
        }
    }

    public void deleteAndCheck(String vehicleId){
        ArrayList<Vehicle> vehicles;
        GetAllVehiclesUseCase getAllVehiclesUseCase = new GetAllVehiclesUseCase(VehicleDataRepository.getInstance());
        DeleteVehicleUseCase deleteVehicleUseCase = new DeleteVehicleUseCase(VehicleDataRepository.getInstance());

        vehicles = getAllVehiclesUseCase.execute();

        for (Vehicle v : vehicles){
            System.out.println(v.getId());
            System.out.println(v.getModel());
            System.out.println(v.getHp());
            System.out.println(v.getDoorsNumber());
            System.out.println(v.getColor());
        }

        deleteVehicleUseCase.execute(vehicleId);

        vehicles = getAllVehiclesUseCase.execute();

        for (Vehicle v : vehicles){
            System.out.println(v.getId());
            System.out.println(v.getModel());
            System.out.println(v.getHp());
            System.out.println(v.getDoorsNumber());
            System.out.println(v.getColor());
        }

    }
}
