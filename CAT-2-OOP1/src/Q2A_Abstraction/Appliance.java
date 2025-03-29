package Q2A_Abstraction;

abstract class Appliance {
    abstract void turnOn();
}

class Fan extends Appliance {
    @Override
    void turnOn() {
        System.out.println("Fan is turning on...");
    }
}
class TV extends Appliance {
    @Override
    void turnOn() {
        System.out.println("TV is turning on...");
    }
}