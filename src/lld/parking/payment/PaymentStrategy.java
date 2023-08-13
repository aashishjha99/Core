package lld.parking.payment;

import java.util.Date;

public interface PaymentStrategy {

  double calculate(Date entryTime, Date exitTime);

  default double calculation() {
    return 50.00;
  }
}
