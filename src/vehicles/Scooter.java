package vehicles;

public class Scooter extends AbstractVehicle {
    //유지보수를 위해서 override를 넣자
    @Override
    public int speedUp(int val) {
        this.speed = this.speed + this.increment;
        return this.speed;
    }
}
