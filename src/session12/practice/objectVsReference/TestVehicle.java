package session12.practice.objectVsReference;

public class TestVehicle {

    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle truck = new Truck();

        System.out.println(car.fuelType());
        System.out.println(truck.fuelType());

        Car anotherCar = (Car) car;
        System.out.println(anotherCar.fuelType());
    }
}
