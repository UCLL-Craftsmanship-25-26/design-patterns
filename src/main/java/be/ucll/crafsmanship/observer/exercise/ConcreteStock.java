package be.ucll.crafsmanship.observer.exercise;

import java.util.ArrayList;
import java.util.List;

public class ConcreteStock implements Stock {
    private String stockSymbol;
    private double price;
    private List<Investor> investors;

    public ConcreteStock(String stockSymbol, double initialPrice) {
        this.stockSymbol = stockSymbol;
        this.price = initialPrice;
        this.investors = new ArrayList<>();
    }

    @Override
    public void addInvestor(Investor investor) {
        // TODO: Implement this method
    }

    @Override
    public void removeInvestor(Investor investor) {
        // TODO: Implement this method
    }

    @Override
    public void notifyInvestors() {
        // TODO: Implement this method
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
        notifyInvestors();
    }

    public double getPrice() {
        return price;
    }

    public String getStockSymbol() {
        return stockSymbol;
    }
}