package ua.ithillel;

public class Human extends Participant {

    public Human(double maxLengthOfRunning, double maxHeightOfJumping) {
        super(maxLengthOfRunning, maxHeightOfJumping);
    }

    @Override
    public String toString() {
        return "Human";
    }
}
