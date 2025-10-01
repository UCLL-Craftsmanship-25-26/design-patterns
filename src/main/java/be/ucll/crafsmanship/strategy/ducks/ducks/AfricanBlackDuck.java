package be.ucll.crafsmanship.strategy.ducks.ducks;

import be.ucll.crafsmanship.strategy.ducks.strategies.fly.FlyWithWings;
import be.ucll.crafsmanship.strategy.ducks.strategies.quack.Quack;

public class AfricanBlackDuck extends Duck {
    public AfricanBlackDuck() {
        super(new FlyWithWings(), new Quack());
    }

    @Override
    public void display() {

        System.out.println("I'm a real African black duck");
    }
}
