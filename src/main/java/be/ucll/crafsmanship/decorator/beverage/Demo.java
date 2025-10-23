package be.ucll.crafsmanship.decorator.beverage;

import be.ucll.crafsmanship.decorator.beverage.decorators.Mocha;
import be.ucll.crafsmanship.decorator.beverage.decorators.SoyMilk;
import be.ucll.crafsmanship.decorator.beverage.decorators.Whip;

public class Demo {
    public static void main(String[] args) {
//        Beverage beverage = new Espresso();
//        System.out.println(beverage.getDescription() + " $" + beverage.cost());

//        Beverage beverage2 = new DarkRoast();
//        beverage2 = new Mocha(beverage2);
//        beverage2 = new Mocha(beverage2);
//        beverage2 = new Whip(beverage2);
//        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

//        var beverage3 = new Mocha(new Whip(new HouseBlend()));
//        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());

        var soyMilkMochaEspresso = new Mocha(new SoyMilk(new Espresso()));
        System.out.println(soyMilkMochaEspresso.getDescription() + " $" + soyMilkMochaEspresso.cost());

        var withAddedWhip = new Whip(soyMilkMochaEspresso);
        System.out.println(withAddedWhip.getDescription() + " $" + withAddedWhip.cost());
    }
}
