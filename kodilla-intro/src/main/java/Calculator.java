public class Calculator {
    static final double PI = 3.1415927;
    static int counter = 0;

    public Calculator() {
        counter++;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    public double circleArea(double r) {
        String name = UserDialogs.getUserName();
        System.out.println("Hi " + name + "! Thanks for using our software.");
        return PI * r * r;
    }

    public double circlePerimeter(double r) {
        String name = UserDialogs.getUserName();
        System.out.println("Hi " + name + "! Thanks for using our software.");
        return 2 * PI * r;
    }
}
