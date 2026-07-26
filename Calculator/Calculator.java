public class Calculator {

    private double num1;
    private double num2;
    private double result;

    public Calculator() {
        num1 = 0;
        num2 = 0;
        result = 0;
    }

    public void setNumbers(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void display() {
        System.out.println("===== Calculator =====");
        System.out.println("First Number  : " + num1);
        System.out.println("Second Number : " + num2);
        System.out.println("======================");
    }

    public void add() {
        result = num1 + num2;
        System.out.println("Addition = " + result);
    }

    public void subtract() {
        result = num1 - num2;
        System.out.println("Subtraction = " + result);
    }

    public void multiply() {
        result = num1 * num2;
        System.out.println("Multiplication = " + result);
    }

    public void divide() {
        if (num2 != 0) {
            result = num1 / num2;
            System.out.println("Division = " + result);
        } else {
            System.out.println("Cannot divide by zero.");
        }
    }
}
