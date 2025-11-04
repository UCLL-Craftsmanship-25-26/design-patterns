package be.ucll.crafsmanship.observer.exercise;

public class InstitutionalInvestor implements Investor {
    private String institutionName;

    public InstitutionalInvestor(String institutionName) {
        this.institutionName = institutionName;
    }

    @Override
    public void update(String stockSymbol, double price) {
        System.out.printf("%s: %s price updated to $%.2f%n", institutionName, stockSymbol, price);
    }
}
