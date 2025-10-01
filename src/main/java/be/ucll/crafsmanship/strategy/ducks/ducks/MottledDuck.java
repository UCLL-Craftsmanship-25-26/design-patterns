package be.ucll.crafsmanship.strategy.ducks.ducks;

import be.ucll.crafsmanship.strategy.ducks.strategies.fly.FlyWithWings;
import be.ucll.crafsmanship.strategy.ducks.strategies.quack.Quack;

public class MottledDuck extends Duck {
    public MottledDuck() {
        super(new FlyWithWings(), new Quack());
    }

    @Override
    public void display() {
        System.out.println("I'm a mottled duck");
    }
}
