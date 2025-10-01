package be.ucll.crafsmanship.strategy.ducks.strategies.quack;

public class Beep implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Beep Boop!");
    }
}
