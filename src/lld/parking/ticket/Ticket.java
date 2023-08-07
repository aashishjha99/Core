package lld.parking.ticket;

import lld.parking.manager.ParkingSpotManager;
import lld.parking.spot.ParkingSpot;
import lld.parking.vehicle.Vehicle_;

import java.util.Date;
import java.util.Objects;

public class Ticket {

  private ParkingSpotManager parkingSpotManager = new ParkingSpotManager();

  private Vehicle_ vehicle;

  private ParkingSpot parkingSpot;

  public Date getParkingTime() {
    return parkingTime;
  }

  public void setParkingTime(Date parkingTime) {
    this.parkingTime = parkingTime;
  }

  public Date getUnParkingTime() {
    return unParkingTime;
  }

  public void setUnParkingTime(Date unParkingTime) {
    this.unParkingTime = unParkingTime;
  }

  private Date parkingTime;

  private Date unParkingTime;

  public ParkingSpotManager getParkingSpotManager() {
    return parkingSpotManager;
  }

  public Vehicle_ getVehicle() {
    return vehicle;
  }

  public void parkVehicle(Vehicle_ vehicle) {
    this.vehicle = vehicle;
    this.parkingSpot = parkingSpotManager.addVehicle(vehicle);
  }

  public void unParkVehicle(Vehicle_ vehicle) {
    this.vehicle = vehicle;
    this.parkingSpot = parkingSpotManager.removeVehicle(vehicle);
  }

  @Override
  public String toString() {

    StringBuilder sb = new StringBuilder();
    sb.append("Ticket for Vehicle Number :  " + this.vehicle.getVehicleNumber() + " Parking Time :  "
        + this.getParkingTime() + " Slot Number : " + parkingSpot.getParkingSpotNumber());
    if (!Objects.isNull(this.unParkingTime)) {
      sb.append(" UnParking Time : " + this.getUnParkingTime());
    }
    return sb.toString();
  }
}
