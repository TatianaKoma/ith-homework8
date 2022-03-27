package ua.ithillel;

public class Cat extends Participant {

    public Cat(double maxLengthOfRunning, double maxHeightOfJumping) {
        super(maxLengthOfRunning, maxHeightOfJumping);
    }

    @Override
    public String toString() {
        return "Cat";
    }
}
