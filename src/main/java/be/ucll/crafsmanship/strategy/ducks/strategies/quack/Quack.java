package be.ucll.crafsmanship.strategy.ducks.strategies.quack;

public class Quack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
