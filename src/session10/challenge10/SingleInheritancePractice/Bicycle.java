package session10.challenge10.SingleInheritancePractice;

public class Bicycle {
    protected int speed;
    protected int gear;

    public void changeGear(int newGear) {
        gear = newGear;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }
}

class MountainBike extends Bicycle {
    private String tireType;
    private String suspension;

    public void setTireType(String type) {
        tireType = type;
    }

    public void setSuspension(String suspensionType) {
        suspension = suspensionType;
    }

    public void adjustSuspension(int level) {
        System.out.println("Adjusting suspension to level: " + level);
    }
}
