package be.ucll.crafsmanship.state.gumballmachine;

import be.ucll.crafsmanship.state.gumballmachine.statepattern.Gumball;

public class StateMachineDemo {

    public static void main(String[] args) {

        GumballNaive gumballNaive = new GumballNaive(5);
        gumballNaive.turnCrank();
        gumballNaive.insertQuarter();
        gumballNaive.ejectQuarter();
        gumballNaive.insertQuarter();
        gumballNaive.turnCrank();
        gumballNaive.dispense();
        gumballNaive.turnCrank();

        var gumballMachine = new Gumball(5);
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.turnCrank();

    }

}
