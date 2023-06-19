import inheritances.ObjectInheritances;
import vehicles.MountainBike;
import vehicles.bicycle;
public class Inheritances {
    public static void main(String[] args) {
        try {
            //OBJECT 확인용
            // ObjectInheritances objectInheritances = new ObjectInheritances();
            
            //this. 확인용
            // bicycle Bicycle = new bicycle(5500, "blue");
            // System.out.println(Bicycle.toString());
            
            //상속 확인용
            // MountainBike mountainBike = new MountainBike();
            
            //super.
            MountainBike mountainBike = new MountainBike(6200, "yellow", 20);

            System.out.println();

        } catch (Exception e) {
            System.out.println(e.getMessage());
            // TODO: handle exception
        }
    }
}
