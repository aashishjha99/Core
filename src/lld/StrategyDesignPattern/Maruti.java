package lld.StrategyDesignPattern;

import lld.StrategyDesignPattern.strategy.NormalDrive;

public class Maruti extends Vehicle {
    Maruti() {
        super(new NormalDrive());
    }
}
