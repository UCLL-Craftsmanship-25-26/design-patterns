package be.ucll.crafsmanship.observer.exercise;

public interface Stock {
    void addInvestor(Investor investor);
    void removeInvestor(Investor investor);
    void notifyInvestors();
}
