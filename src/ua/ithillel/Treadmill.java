package ua.ithillel;

public class Treadmill extends Obstacle {

    public Treadmill(double distance) {
        super(distance);
    }

    @Override
    public double getMaxDistance(Participant participant) {
        return participant.getMaxLengthOfRunning();
    }

    @Override
    public String getMovement(Participant participant) {
        return participant.run();
    }

    @Override
    public String toString() {
        return "Treadmill";
    }
}
