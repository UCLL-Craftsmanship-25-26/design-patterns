package be.ucll.crafsmanship.strategy.ducks.ducks;

import be.ucll.crafsmanship.strategy.ducks.strategies.fly.CantFly;
import be.ucll.crafsmanship.strategy.ducks.strategies.quack.Squeak;

public class RubberDuck extends Duck {
    public RubberDuck() {
        super(new CantFly(), new Squeak());
    }

    @Override
    public void display() {
        System.out.println("I'm a Rubber Duck");
    }
}
