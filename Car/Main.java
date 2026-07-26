public class Main {

    public static void main(String[] args) {

        Car myCar = new Car();

        myCar.setColor("Black");

        myCar.displayInfo();

        myCar.startEngine();

        myCar.accelerate();
        myCar.accelerate();

        myCar.leftIndicator();

        myCar.displayInfo();

        myCar.brake();

        myCar.indicatorsOff();

        myCar.stopEngine();

        myCar.displayInfo();
    }
}
