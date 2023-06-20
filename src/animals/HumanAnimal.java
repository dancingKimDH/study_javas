package animals;

public class HumanAnimal implements InterfaceAnimal {
    int legs = 2;
    int arms = 2;
    int speed = 0;
    int increment = 3;
    String speech = "Yes";

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
