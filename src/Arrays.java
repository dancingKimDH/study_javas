public class Arrays {
    public static void main(String[] args) {
        // String[] cars = { "Volvo", "BMW", "Ford", "Mazda", "Kia"};
        // System.out.println(cars.length);
        // for (int first = 0; first <= cars.length; first = first + 1) {
        // System.out.print(cars[first] + " ,");
        // }
        String[][] numbers = { { "10", "20", "30", "40" },
                { "50", "60", "70" } };
        for (int second = 0; second < numbers.length; second = second + 1) {
            for (int third = 0; third < numbers[second].length; third = third + 1) {
                System.out.print(numbers[second][third]);
                System.out.println();
            }
        }

        System.out.println();

        // for (int i = 0; i <= 3; i = i + 1) {
        // System.out.println(cars[i]);
        // }

        // return 0;
    }

}
