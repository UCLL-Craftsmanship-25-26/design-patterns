package be.ucll.crafsmanship.state.gumballmachine.statepattern;

public interface GumballState {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
}
