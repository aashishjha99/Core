package lld.parking.gate;

import lld.parking.parkingspace.ParkingLot;
import lld.parking.parkingspace.ParkingSpace;
import lld.parking.ticket.Ticket;
import lld.parking.vehicle.Vehicle_;

import java.util.Date;
import java.util.Random;

public class EntryGate {

  private static EntryGate obj;

  private EntryGate() {
    parkingLot = new ParkingLot();
    random = new Random();
  }

  public static EntryGate getInstance() {
    if (obj == null) {
      obj = new EntryGate();
    }
    return obj;
  }

  int gateId;
  ParkingLot parkingLot;

  // used for generating number
  Random random;

  public ParkingSpace findSpace() {
    return parkingLot.findParkingSpace(this, null);
  }

  public void updateParkingSpace(Vehicle_ v) {
    ParkingSpace parkingSpace = parkingLot.findParkingSpace(this, v);
    parkingSpace.setVehicle(v);
  }

  public Ticket generateTicket(Vehicle_ vehicle) {
    Ticket ticket = new Ticket();
    ticket.id = random.nextInt(1000);
    ticket.vehicle = vehicle;
    ticket.entryTime = new Date();
    return ticket;
  }

}
