package StrategyDesignPattern;

public class Strategy {

    public static void main(String[] args) {


        Vehicle ferrari = new Ferrari();
        ferrari.drive();

        Vehicle maruti = new Maruti();
        maruti.drive();


    }
}
