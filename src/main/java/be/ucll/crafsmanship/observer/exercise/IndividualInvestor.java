package be.ucll.crafsmanship.observer.exercise;

public class IndividualInvestor implements Investor {
    private String name;

    public IndividualInvestor(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockSymbol, double price) {
        System.out.printf("%s: %s price updated to $%.2f%n", name, stockSymbol, price);
    }
}