package be.ucll.crafsmanship.strategy.ducks;

import be.ucll.crafsmanship.strategy.ducks.ducks.*;
import be.ucll.crafsmanship.strategy.ducks.strategies.fly.CantFly;

import java.util.ArrayList;

public class RunDucks {
    public static void main(String[] args) {

        var ducks = new ArrayList<Duck>();
        ducks.add(new Mallard());
        ducks.add(new MottledDuck());
        ducks.add(new GarnegyDuck());
        ducks.add(new AfricanBlackDuck());
        ducks.add(new RedHeadDuck());
        ducks.add(new RubberDuck());
        ducks.add(new WoodenDecoyDuck());
        ducks.add(new RoboDuck());

        for (Duck duck : ducks) {
            duck.display();
            duck.quack();
            duck.swim();
            duck.fly();
            System.out.println("-----");
        }

        Mallard mallard = new Mallard();
        System.out.println("We have a healthy mallard.");
        mallard.fly();
        System.out.println("Sadly the mallard has a broken wing. We can change its flying behaviour at runtime");
        mallard.flyBehaviour = new CantFly();
        mallard.fly();
    }
}

