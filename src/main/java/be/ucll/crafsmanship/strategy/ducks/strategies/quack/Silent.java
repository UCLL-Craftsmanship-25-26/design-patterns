package be.ucll.crafsmanship.strategy.ducks.strategies.quack;

public class Silent implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
