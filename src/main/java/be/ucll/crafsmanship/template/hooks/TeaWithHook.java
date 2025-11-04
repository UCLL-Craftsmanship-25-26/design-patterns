package be.ucll.crafsmanship.template.hooks;

import java.io.*;

public class TeaWithHook extends CaffeineBeverageWithHook {

    public void brew() {
        System.out.println("Steeping the tea");
    }

    public void addCondiments() {
        System.out.println("Adding Lemon");
    }

    public boolean customerWantsCondiments() {
        System.out.println("All our teas come with lemon.");
        return true;
    }

}