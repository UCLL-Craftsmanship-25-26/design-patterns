package be.ucll.crafsmanship.strategy.ducks.ducks;

import be.ucll.crafsmanship.strategy.ducks.strategies.fly.FlyWithWings;
import be.ucll.crafsmanship.strategy.ducks.strategies.quack.Quack;

public class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        super(new FlyWithWings(), new Quack());
    }

    @Override
    public void display() {
        System.out.println("I'm a Red Head Duck");
    }
}
