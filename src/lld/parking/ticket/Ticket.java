package lld.parking.ticket;

import lld.parking.parkingspace.ParkingSpace;
import lld.parking.payment.Payment;
import lld.parking.vehicle.Vehicle_;

import java.util.Date;
import java.util.Objects;

public class Ticket {

  public int id;

  public Vehicle_ vehicle;
  public ParkingSpace parkingSpace;

  public Date entryTime;

  public Date exitTime;


  public Date getExitTime() {
    return exitTime;
  }

  public Date getEntryTime() {
    return entryTime;
  }



}
