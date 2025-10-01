package be.ucll.crafsmanship.strategy.ducks.ducks;

import be.ucll.crafsmanship.strategy.ducks.strategies.fly.CantFly;
import be.ucll.crafsmanship.strategy.ducks.strategies.quack.Silent;

public class WoodenDecoyDuck extends Duck {
    public WoodenDecoyDuck() {
        super(new CantFly(), new Silent());
    }

    @Override
    public void display() {
        System.out.println("I'm a wooden decoy duck");
    }
}
