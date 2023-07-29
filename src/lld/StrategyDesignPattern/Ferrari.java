package lld.StrategyDesignPattern;

import lld.StrategyDesignPattern.strategy.SpecialDrive;

public class Ferrari extends Vehicle {

    Ferrari() {
        super(new SpecialDrive());
    }

}
