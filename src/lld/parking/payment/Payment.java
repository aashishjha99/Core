package lld.parking.payment;

import lld.parking.ticket.Ticket;

import java.util.Date;

public class Payment extends Ticket {

  public int transaction;

  public double amount;

  public Date timeOfPayment;

  public Ticket ticket;

  public PaymentType paymentType;

  public PaymentStrategy paymentStrategy;

  public Payment(Ticket ticket) {
    this.ticket = ticket;
  }
}
