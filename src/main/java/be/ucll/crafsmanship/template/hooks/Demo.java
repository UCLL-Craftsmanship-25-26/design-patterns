package be.ucll.crafsmanship.template.hooks;

public class Demo {
    public static void main(String[] args) {
        var tea = new TeaWithHook();
        var coffee = new CoffeeWithHook();

        System.out.println("\nMaking tea...");
        tea.prepareRecipe();

        System.out.println("\nMaking coffee...");
        coffee.prepareRecipe();
    }
}
