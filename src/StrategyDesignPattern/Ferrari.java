package StrategyDesignPattern;

import StrategyDesignPattern.strategy.DriveStrategy;
import StrategyDesignPattern.strategy.SpecialDrive;

public class Ferrari extends Vehicle {

    Ferrari() {
        super(new SpecialDrive());
    }

}
