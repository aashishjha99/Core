package lld.parking.spot;

import lld.parking.vehicle.Vehicle_;

import java.util.UUID;

public class ParkingSpot {

    private UUID parkingSpotNumber;

    private Vehicle_ vehicle;

    private boolean isEmpty;

    public void setPrice(int price) {
        this.price = price;
    }

    private int price;

    public UUID getParkingSpotNumber() {
        return parkingSpotNumber;
    }

    public void setParkingSpotNumber(UUID parkingSpotNumber) {
        this.parkingSpotNumber = parkingSpotNumber;
    }

    public Vehicle_ getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle_ vehicle) {
        this.vehicle = vehicle;
        this.isEmpty = false;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public int getPrice() {
        return price;
    }

    public void removeVehicle(Vehicle_ vehicle) {
        this.vehicle = null;
        this.isEmpty = true;
        this.price = 0;
    }
}
