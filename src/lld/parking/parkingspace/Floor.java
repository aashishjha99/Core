package lld.parking.parkingspace;

import java.util.List;

public class Floor {

  int id;
  int floor;
  boolean isEmpty;
  List<ParkingSpace> parkingSpace;

  public void removeParkingSpace(ParkingSpace parkingSpot) {
    parkingSpace.remove(parkingSpot);
  }

  public void addParkingSpace(ParkingSpace parkingSpot) {
    parkingSpace.add(parkingSpot);
  }
}
