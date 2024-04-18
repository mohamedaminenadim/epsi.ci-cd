package cicd.learn.tp1;

public class Calculator {
    private int first;
    private int second;

    public Calculator(int first, int second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return String.format("The sum of '%d' and '%d' is %d\nTheir product is '%d'", first, second, sum(first, second), product(first, second));
    }

    private int sum(int first, int second) {
        return first + second;
    }

    private int product(int first, int second) {
        return first * second;
    }
}
