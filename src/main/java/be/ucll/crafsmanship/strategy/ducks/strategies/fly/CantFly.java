package be.ucll.crafsmanship.strategy.ducks.strategies.fly;

public class CantFly implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I can't fly.");
    }
}
