package lld.parking.parkingspace;

import lld.parking.vehicle.VehicleType;
import lld.parking.vehicle.Vehicle_;

public class ParkingSpaceFactory {

  ParkingSpace parkingSpot;

  public ParkingSpace getParkingSpace(Vehicle_ vehicle) {

    if (vehicle.vehicleType == VehicleType.Two) {
      parkingSpot = new TwoWheelerParkingSpot();
    } else if (vehicle.vehicleType == VehicleType.four) {
      parkingSpot = new FourWheelParkingSpot();
    }

    return parkingSpot;
  }
}
