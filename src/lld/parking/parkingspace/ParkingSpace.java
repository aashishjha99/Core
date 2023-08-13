package lld.parking.parkingspace;

import lld.parking.vehicle.Vehicle_;

public abstract class ParkingSpace {

  Integer parkingSpotNumber;

  Integer floorId;

  Vehicle_ vehicle;

  boolean isEmpty;

  int price;

  public void removeVehicle(Vehicle_ vehicle) {
    this.vehicle = null;
    this.isEmpty = true;
  }

  public void setVehicle(Vehicle_ vehicle) {
    this.vehicle = vehicle;
    this.isEmpty = false;
  }

  public Vehicle_ getVehicle() {
    return vehicle;
  }
}
