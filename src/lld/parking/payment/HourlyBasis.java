package lld.parking.payment;

import java.util.Date;

public class HourlyBasis implements PaymentStrategy {

  @Override
  public double calculate(Date entryTime, Date exitTime) {

    long diffInMillis = exitTime.getTime() - entryTime.getTime();
    double hours = diffInMillis / (60.0 * 60 * 1000); // Convert milliseconds to hours

    // Calculate the cost based on the hourly rate
    double cost = hours * 20;

    return cost;

  }
}
