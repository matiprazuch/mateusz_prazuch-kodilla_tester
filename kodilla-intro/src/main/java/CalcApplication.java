public class CalcApplication {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double area = calculator.circleArea(10);
        double perimeter = calculator.circlePerimeter(12);
        System.out.println("Area of the circle with radius 10 equals: " + area);
        System.out.println("Perimeter of the circle with radius 12 equals: " + perimeter);

        double p = Calculator.PI;
        System.out.println("---------------------------");
        System.out.println("Value of pi constant equals: " + p);

        Calculator calculator2 = new Calculator();
        System.out.println(calculator2.counter);
    }
}
