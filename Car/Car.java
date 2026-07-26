public class Car {

    // Attributes
    private String color;
    private int speed;
    private boolean engineStatus;
    private boolean leftSignal;
    private boolean rightSignal;

    // Constructor
    public Car() {
        color = "White";
        speed = 0;
        engineStatus = false;
        leftSignal = false;
        rightSignal = false;
    }

    // Set Color
    public void setColor(String color) {
        this.color = color;
    }

    // Start Engine
    public void startEngine() {
        engineStatus = true;
        System.out.println("Engine Started.");
    }

    // Stop Engine
    public void stopEngine() {
        engineStatus = false;
        speed = 0;
        System.out.println("Engine Stopped.");
    }

    // Accelerate
    public void accelerate() {
        if (engineStatus) {
            speed += 10;
            System.out.println("Car Accelerated.");
        } else {
            System.out.println("Start the engine first.");
        }
    }

    // Brake
    public void brake() {
        if (speed > 0) {
            speed -= 10;
        }

        if (speed < 0) {
            speed = 0;
        }

        System.out.println("Brake Applied.");
    }

    // Left Indicator
    public void leftIndicator() {
        leftSignal = true;
        rightSignal = false;
        System.out.println("Left Indicator ON.");
    }

    // Right Indicator
    public void rightIndicator() {
        rightSignal = true;
        leftSignal = false;
        System.out.println("Right Indicator ON.");
    }

    // Turn Indicators OFF
    public void indicatorsOff() {
        leftSignal = false;
        rightSignal = false;
        System.out.println("Indicators OFF.");
    }

    // Display Information
    public void displayInfo() {
        System.out.println("\n----- Car Information -----");
        System.out.println("Color            : " + color);
        System.out.println("Speed            : " + speed + " km/h");
        System.out.println("Engine           : " + (engineStatus ? "ON" : "OFF"));
        System.out.println("Left Indicator   : " + (leftSignal ? "ON" : "OFF"));
        System.out.println("Right Indicator  : " + (rightSignal ? "ON" : "OFF"));
    }
              }
