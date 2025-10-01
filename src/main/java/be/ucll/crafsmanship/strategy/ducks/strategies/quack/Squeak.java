package be.ucll.crafsmanship.strategy.ducks.strategies.quack;

public class Squeak implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
