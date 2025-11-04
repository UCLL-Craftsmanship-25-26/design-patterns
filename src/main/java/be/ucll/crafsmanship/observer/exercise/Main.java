package be.ucll.crafsmanship.observer.exercise;

public class Main {
    public static void main(String[] args) {
        ConcreteStock appleStock = new ConcreteStock("AAPL", 150.00);
        Investor john = new IndividualInvestor("John Doe");
        Investor blackRock = new InstitutionalInvestor("BlackRock");

        appleStock.addInvestor(john);
        appleStock.addInvestor(blackRock);

        appleStock.setPrice(150.25);
        appleStock.setPrice(150.50);
    }
}
