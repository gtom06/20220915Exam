package controller;

public class NumberController {
    private NumberController() {
        throw new IllegalStateException("Utility class");
    }
    public static boolean isDivisibleBy2(double number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
