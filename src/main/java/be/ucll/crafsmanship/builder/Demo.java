package be.ucll.crafsmanship.builder;


import be.ucll.crafsmanship.builder.builders.CarBuilder;
import be.ucll.crafsmanship.builder.builders.CarManualBuilder;
import be.ucll.crafsmanship.builder.cars.Car;
import be.ucll.crafsmanship.builder.director.Director;
import be.ucll.crafsmanship.builder.cars.Manual;

/**
 * EN: Demo class. Everything comes together here.
 */
public class Demo {

    public static void main(String[] args) {
        Director director = new Director();

        // Director gets the concrete builder object from the client
        // (application code). That's because application knows better which
        // builder to use to get a specific product.

        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        // The final product is often retrieved from a builder object, since
        // Director is not aware and not dependent on concrete builders and
        // products.
        Car car = builder.build();
        System.out.println("Car built:\n" + car.getCarType());


        CarManualBuilder manualBuilder = new CarManualBuilder();

        // the Director can know several building recipes.
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.build();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }

}
