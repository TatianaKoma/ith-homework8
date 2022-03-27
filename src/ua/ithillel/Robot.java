package ua.ithillel;

public class Robot extends Participant {

    public Robot(double maxLengthOfRunning, double maxHeightOfJumping) {
        super(maxLengthOfRunning, maxHeightOfJumping);
    }

    @Override
    public String toString() {
        return "Robot";
    }
}
