package lld.parking.gate;

import lld.parking.payment.HourlyBasis;
import lld.parking.payment.Payment;
import lld.parking.payment.PaymentStrategy;
import lld.parking.payment.PaymentStrategyType;
import lld.parking.ticket.Ticket;

import java.util.Date;

public class ExitGate {

    int id;

    Ticket ticket;


    public int calculatePrice(PaymentStrategyType paymentStrategyType){
            return 0;
    }

}
