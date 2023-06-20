package animals;

public class HorseAnimal implements InterfaceAnimal {
    int legs = 4;
    int arms = 0;
    String speech = "No";
    int speed = 0;
    int increment = 12;
    
    @Override
    public int setLegs(int legs) {
        this.legs = legs;
        return this.legs;
    }

    @Override
    public int setArms(int arms) {
        this.arms = arms;
        return this.arms;
    }

    @Override
    public String setEnableSpeech(String speech) {
        this.speech = speech;
        return this.speech;
    }

    @Override
    public int speedUp(int speed) {
        this.speed = this.speed + increment;
        return this.speed;
    }

    @Override
    public int speedDown(int speed) {
        this.speed = this.speed - increment;
        return this.speed;
    }
}
