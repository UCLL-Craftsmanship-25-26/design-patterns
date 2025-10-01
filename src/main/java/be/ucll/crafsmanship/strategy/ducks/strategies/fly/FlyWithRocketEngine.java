package be.ucll.crafsmanship.strategy.ducks.strategies.fly;

public class FlyWithRocketEngine implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket engine!");
    }
}
