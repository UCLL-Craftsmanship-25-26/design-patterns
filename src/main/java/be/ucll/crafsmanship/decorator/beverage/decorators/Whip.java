package be.ucll.crafsmanship.decorator.beverage.decorators;

import be.ucll.crafsmanship.decorator.beverage.Beverage;

public class Whip extends CondimentDecorator {
    private final Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.70;
    }
}
