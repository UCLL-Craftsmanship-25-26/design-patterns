package be.ucll.crafsmanship.builder.builders;

import be.ucll.crafsmanship.builder.cars.CarType;
import be.ucll.crafsmanship.builder.components.Engine;
import be.ucll.crafsmanship.builder.components.GPSNavigator;
import be.ucll.crafsmanship.builder.components.Transmission;
import be.ucll.crafsmanship.builder.components.TripComputer;

/**
 * EN: Builder interface defines all possible ways to configure a product.
 */
public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
