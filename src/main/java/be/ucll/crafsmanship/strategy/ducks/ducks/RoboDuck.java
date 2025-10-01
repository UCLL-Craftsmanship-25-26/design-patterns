package be.ucll.crafsmanship.strategy.ducks.ducks;

import be.ucll.crafsmanship.strategy.ducks.strategies.fly.FlyWithRocketEngine;
import be.ucll.crafsmanship.strategy.ducks.strategies.quack.Beep;

public class RoboDuck extends Duck {
    public RoboDuck() {
        super(new FlyWithRocketEngine(), new Beep());
    }

    @Override
    public void display() {
        System.out.println("I'm a Robo Duck");
    }
}
