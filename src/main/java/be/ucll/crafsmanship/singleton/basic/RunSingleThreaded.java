package be.ucll.crafsmanship.singleton.basic;

public class RunSingleThreaded {
    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");
        BasicSingleton singleton = BasicSingleton.getInstance("FOO");
        BasicSingleton anotherSingleton = BasicSingleton.getInstance("BAR");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}