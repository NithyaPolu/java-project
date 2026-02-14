class Car {
    String color;
    void start() {
        System.out.println("Car started");
    }
}

public class object {
    public static void main(String[] args) {
        Car myCar = new Car();     // 👈 this is an OBJECT
        myCar.color = "Red";       // setting object property
        myCar.start();             // calling object method
    }
}
