package session10.challenge10.MultilevelInheritance;

public class ElectricCar extends Car{

    private float batteryLevel;
    private int range;

    public void charge(float increment) {
        this.batteryLevel += increment;
    }
}
