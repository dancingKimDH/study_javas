package animals;

public class HumanAnimalExtend extends HumanAnimal {
    public String toString() {
        String str = "legs: " + this.legs + ", arms: " + this.arms + ", speech: " + this.speech;
        return str;

    }
}
