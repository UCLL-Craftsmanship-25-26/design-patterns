package be.ucll.crafsmanship.strategy.ducks.ducks;

import be.ucll.crafsmanship.strategy.ducks.strategies.fly.FlyWithWings;
import be.ucll.crafsmanship.strategy.ducks.strategies.quack.Quack;

public class GarnegyDuck extends Duck {
    public GarnegyDuck() {
        super(new FlyWithWings(), new Quack());
    }

    @Override
    public void display() {
        System.out.println("I'm a Garnegy Duck");
    }
}
