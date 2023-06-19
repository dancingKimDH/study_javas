// import inheritances.ObjectInheritances;
// import vehicles.MountainBike;
// import vehicles.bicycle;
// import vehicles.RoadCycle;
import vehicles.Car;


public class Inheritances {
    public static void main(String[] args) {
        try {
            // OBJECT 확인용
            // ObjectInheritances objectInheritances = new ObjectInheritances();
            
            // this. 확인용
            // bicycle Bicycle = new bicycle(5500, "blue");
            // System.out.println(Bicycle.toString());
            
            // 상속 확인용
            // MountainBike mountainBike = new MountainBike();
            
            // super.
            // MountainBike mountainBike = new MountainBike(6200, "yellow", 20);
            
            // 상속 연습
            // RoadCycle roadcycle = new RoadCycle(200000, "Blue", "Super-Fast Bike");
            // System.out.println(roadcycle.toString());

            // 구현 호출
            Car car = new Car();
            car.speedUp(1);
            car.speedDown(2);
            System.out.println();

            System.out.println();

        } catch (Exception e) {
            System.out.println(e.getMessage());
            // TODO: handle exception
        }
    }
}
