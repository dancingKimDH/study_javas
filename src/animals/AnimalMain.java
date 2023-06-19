package animals;

public class AnimalMain {
    public static void main(String[] args) {
        
        try {
            
            HumanAnimal humananimal = new HumanAnimal();
            humananimal.setArms(2);
            humananimal.setLegs(2);
            humananimal.setEnableSpeech("Yes");
            System.out.println(humananimal.toString());

            HorseAnimal horseanimal = new HorseAnimal();
            horseanimal.setArms(0);
            horseanimal.setLegs(4);
            horseanimal.setEnableSpeech("No");
            System.out.println(horseanimal.toString());

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
