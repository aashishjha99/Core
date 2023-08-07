package lld.parking;

import lld.parking.ticket.Ticket;
import lld.parking.vehicle.VehicleType;
import lld.parking.vehicle.Vehicle_;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {


        Ticket ticket = new Ticket();
        ticket.setParkingTime(new Date());
        ticket.parkVehicle(new Vehicle_("KA-01-21333", VehicleType.Two));
        System.out.println(ticket.toString());

        TimeUnit.MINUTES.sleep(1);
        ticket.setUnParkingTime(new Date());
        ticket.unParkVehicle(ticket.getVehicle());
        System.out.println(ticket.toString());

    }
}
