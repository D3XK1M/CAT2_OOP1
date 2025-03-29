package Q2A_Abstraction;

public class Main {
    public static void main(String[] args) {
        Appliance fan = new Fan();
        Appliance tv = new TV();
        fan.turnOn();
        tv.turnOn();
    }
}