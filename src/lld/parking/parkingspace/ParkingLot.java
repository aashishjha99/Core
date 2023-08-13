package lld.parking.parkingspace;

import lld.parking.gate.EntryGate;
import lld.parking.vehicle.Vehicle_;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ParkingLot {


  List<Floor> floorList;
  ParkingSpaceFactory parkingSpaceFactory;

  public List<Floor> getFloorList() {
    return floorList;
  }

  public ParkingSpaceFactory getParkingSpaceFactory() {
    return parkingSpaceFactory;
  }

   public ParkingLot() {
    this.floorList = new ArrayList<>();
    this.parkingSpaceFactory = new ParkingSpaceFactory();
  }

  public void addFloor(Floor floor, List<ParkingSpace> parkingSpaces) {
    floor.parkingSpace = parkingSpaces;
    floorList.add(floor);
  }

  public void removeFloor(Floor floor) {
    floorList.remove(floor);
  }

  public ParkingSpace findParkingSpace(EntryGate entryGate, Vehicle_ vehicle) {
    for (Floor floor : floorList) {
      for (ParkingSpace parkingSpace : floor.parkingSpace) {
        if (parkingSpace.isEmpty && Objects.isNull(parkingSpace.vehicle)) {
          return parkingSpace;
        }
      }
    }
    return null;
  }
}
