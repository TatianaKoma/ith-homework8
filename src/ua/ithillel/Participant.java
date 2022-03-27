package ua.ithillel;

public class Participant {

    private final double maxLengthOfRunning;
    private final double maxHeightOfJumping;

    public Participant(double maxLengthOfRunning, double maxHeightOfJumping) {
        this.maxLengthOfRunning = maxLengthOfRunning;
        this.maxHeightOfJumping = maxHeightOfJumping;
    }

    public double getMaxLengthOfRunning() {
        return maxLengthOfRunning;
    }

    public double getMaxHeightOfJumping() {
        return maxHeightOfJumping;
    }

    public String run() {
        return "run";
    }

    public String jump() {
        return "jumped";
    }

    public void overcomeObstacles(Obstacle[] obstacles) {
        for (Obstacle obstacle : obstacles) {
            if (!obstacle.overcome(this)) {
                break;
            }
        }
    }
}
