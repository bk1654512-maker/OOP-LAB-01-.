public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        calc.setNumbers(25, 5);

        System.out.println("Addition = " + calc.add());
        System.out.println("Subtraction = " + calc.subtract());
        System.out.println("Multiplication = " + calc.multiply());
        System.out.println("Division = " + calc.divide());
    }
}
