package seminars.second.hw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    @Test
    public void testCarIsInstanceOfVehicle() {
        Car car = new Car("Toster", "Roadster", 2070);
        assertInstanceOf(Vehicle.class, car);
    }

    @Test
    public void testCarHasFourWheels() {
        Car car = new Car("Toster", "Roadster", 3000);
        assertEquals(4, car.getNumWheels());
    }

    @Test
    public void testMotorcycleHasTwoWheels() {
        Motorcycle motorcycle = new Motorcycle("Toster", "Butter", 3000);
        assertEquals(2, motorcycle.getNumWheels());
    }

    @Test
    public void testCarDriveSpeed() {
        Car car = new Car("Toster", "Roadster", 3000);
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    @Test
    public void testMotorcycleDriveSpeed() {
        Motorcycle motorcycle = new Motorcycle("Toster", "Butter", 3000);
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }

    @Test
    public void testCarParkingSpeed() {
        Car car = new Car("Toster", "Roadster", 3000);
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }

    @Test
    public void testMotorcycleParkingSpeed() {
        Motorcycle motorcycle = new Motorcycle("Toster", "Butter", 3000);
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }
}