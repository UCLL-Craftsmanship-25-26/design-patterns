package be.ucll.crafsmanship.state.gumballmachine.statepattern;

public class Gumball {
    private final GumballState noQuarterState;
    private final GumballState hasQuarterState;
    private final GumballState soldState;
    private final GumballState soldOutState;

    private GumballState currentState;
    private int count;

    public Gumball(int numberGumballs) {
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        soldOutState = new SoldOutState(this);

        this.count = numberGumballs;
        if (numberGumballs > 0) {
            currentState = noQuarterState;
        } else {
            currentState = soldOutState;
        }
    }

    public void insertQuarter() {
        currentState.insertQuarter();
    }

    public void ejectQuarter() {
        currentState.ejectQuarter();
    }

    public void turnCrank() {
        currentState.turnCrank();
        currentState.dispense();
    }

    void releaseBall() {
        if (count > 0) {
            System.out.println("A gumball comes rolling out the slot...");
            count--;
        }
    }

    int getCount() {
        return count;
    }

    void setState(GumballState state) {
        this.currentState = state;
    }

    GumballState getNoQuarterState() {
        return noQuarterState;
    }

    GumballState getHasQuarterState() {
        return hasQuarterState;
    }

    GumballState getSoldState() {
        return soldState;
    }

    GumballState getSoldOutState() {
        return soldOutState;
    }
}
