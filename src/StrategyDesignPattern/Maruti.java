package StrategyDesignPattern;

import StrategyDesignPattern.strategy.DriveStrategy;
import StrategyDesignPattern.strategy.NormalDrive;

public class Maruti extends Vehicle {
    Maruti() {
        super(new NormalDrive());
    }
}
