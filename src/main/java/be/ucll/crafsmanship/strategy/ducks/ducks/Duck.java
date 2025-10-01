package be.ucll.crafsmanship.strategy.ducks.ducks;

import be.ucll.crafsmanship.strategy.ducks.strategies.fly.FlyBehaviour;
import be.ucll.crafsmanship.strategy.ducks.strategies.quack.QuackBehaviour;

public abstract class Duck {
    public FlyBehaviour flyBehaviour;
    public QuackBehaviour quackBehaviour;

    Duck(FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour) {
        this.flyBehaviour = flyBehaviour;
        this.quackBehaviour = quackBehaviour;
    }

    public void quack() {
        this.quackBehaviour.quack();
    }
    public void swim() {
        System.out.println("Swimming!");
    }
    public void fly() {
        flyBehaviour.fly();
    }

    abstract public void display();
}