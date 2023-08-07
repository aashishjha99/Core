package lld.parking.manager;

import lld.parking.spot.FourWheelParkingSpot;
import lld.parking.spot.ParkingSpot;
import lld.parking.spot.TwoWheelerParkingSpot;
import lld.parking.vehicle.VehicleType;
import lld.parking.vehicle.Vehicle_;

import java.util.*;

public class ParkingSpotManager {

  private static List<ParkingSpot> parkingSpotList = new ArrayList<>();

  private int size = 20;

  public List<ParkingSpot> getParkingSpotList() {
    return parkingSpotList;
  }

  public void addParkingSpot() {
    if (parkingSpotList.size() <= size) {
      size++;
    }
  }

  public void removeParkingSpot() {
    ParkingSpot toBeRemoved = parkingSpotList.stream()
        .filter(park -> Objects.isNull(park.getVehicle()) && park.isEmpty()).findFirst().get();
    parkingSpotList.remove(toBeRemoved);
  }

  public ParkingSpot addVehicle(Vehicle_ vehicle) {
    if (parkingSpotList.size() > size) {
      System.out.println("Space Full");
    }

    ParkingSpot parkingSpot = null;
    if (vehicle.getVehicleType() == VehicleType.Two) {
      parkingSpot = new TwoWheelerParkingSpot();
      parkingSpot.setParkingSpotNumber(UUID.randomUUID());
      parkingSpot.setVehicle(vehicle);
      parkingSpot.setPrice(200);
    } else if (vehicle.getVehicleType() == VehicleType.four) {
      parkingSpot = new FourWheelParkingSpot();
      parkingSpot.setParkingSpotNumber(UUID.randomUUID());
      parkingSpot.setVehicle(vehicle);
      parkingSpot.setPrice(600);
    }
    parkingSpotList.add(parkingSpot);
    System.out.println("Succesfully Parked : " + vehicle.getVehicleNumber());
    return parkingSpot;
  }

  public ParkingSpot removeVehicle(Vehicle_ vehicle) {
    Optional<ParkingSpot> isAvailableInParking = parkingSpotList.stream()
        .filter(parking -> Objects.equals(parking.getVehicle(), vehicle)).findFirst();

    if (!isAvailableInParking.isPresent()) {
      System.out.println("vehicle not parked");
    }

    ParkingSpot parkingSpot = isAvailableInParking.get();
    parkingSpot.removeVehicle(vehicle);
    System.out.println("Succesfully UnParked " + vehicle.vehicleNumber);
    return parkingSpot;

  }

}
