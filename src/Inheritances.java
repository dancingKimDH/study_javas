import inheritances.ObjectInheritances;
import vehicles.bicycle;
public class Inheritances {
    public static void main(String[] args) {
        try {
            // ObjectInheritances objectInheritances = new ObjectInheritances();
            bicycle Bicycle = new bicycle(5500, "blue");
            System.out.println(Bicycle.toString());
            System.out.println();

        } catch (Exception e) {
            System.out.println(e.getMessage());
            // TODO: handle exception
        }
    }
}
