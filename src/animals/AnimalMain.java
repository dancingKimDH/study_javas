package animals;

public class AnimalMain {
    public static void main(String[] args) {

        try {

            HumanAnimal humananimal = new HumanAnimal();
            HumanAnimalExtend humananimalextend = new HumanAnimalExtend();
            System.out.println(humananimalextend.toString());

            HorseAnimal horseanimal = new HorseAnimal();
            HorseAnimalExtend horseanimalextend = new HorseAnimalExtend();
            System.out.println(horseanimalextend.toString());

            System.out.println(humananimal.speedUp(1));
            System.out.println(humananimal.speedDown(2));

            System.out.println(horseanimal.speedUp(1));
            System.out.println(horseanimal.speedDown(2));

        } catch (Exception e) {

            System.out.println(e.getMessage());

            // TODO: handle exception
        }

    }
}
