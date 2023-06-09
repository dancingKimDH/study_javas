import java.util.ArrayList;
import java.util.HashMap;

public class LoopForEaches {
    public static void main(String[] args) {
        try {

            // for (type variableName : arrayName) {
            // // code block to be executed
            // }
            ArrayList<String> cars = new ArrayList<String>();
            cars.add("Volvo");
            cars.add("BMW");
            cars.add("Ford");
            cars.add("Mazda");
            // for (String car : cars) {
            //     System.out.println(car);
            // }
            // Automobile Company & Vehicle Name

            HashMap VehicleName = new HashMap();
            ArrayList<HashMap> carList = new ArrayList<HashMap>();
            HashMap<String, String> carSpec = new HashMap<String, String>();

            carSpec.put("CarCompany", "Ford");
            carSpec.put("CarName", "Mustang");
            carSpec.put("Year", "2022");
            carList.add(carSpec);

            carSpec = new HashMap<String, String>();
            carSpec.put("CarCompany", "Toyota");
            carSpec.put("CarName", "Camry");
            carSpec.put("Year", "2022");
            carList.add(carSpec);

            carSpec = new HashMap<String, String>();
            carSpec.put("CarCompany", "Chevrolet");
            carSpec.put("CarName", "Silverado");
            carSpec.put("Year", "2023");
            carList.add(carSpec);

            for (HashMap<String, String> car : carList) {
            System.out.println(car.get("CarCompany")
            + car.get("CarName") + car.get("Year")            );
            }

            System.out.println();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
