package lld.parking.vehicle;

import lld.parking.spot.ParkingSpot;

import java.util.List;

public class Vehicle_ {

  public String getVehicleNumber() {
    return vehicleNumber;
  }

  public void setVehicleNumber(String vehicleNumber) {
    this.vehicleNumber = vehicleNumber;
  }

  public VehicleType getVehicleType() {
    return vehicleType;
  }

  public void setVehicleType(VehicleType vehicleType) {
    this.vehicleType = vehicleType;
  }

  public Vehicle_(String vehicleNumber, VehicleType vehicleType) {
    this.vehicleNumber = vehicleNumber;
    this.vehicleType = vehicleType;
  }

  public String vehicleNumber;

  public VehicleType vehicleType;

}
