package ua.ithillel;

public abstract class Obstacle {

    private double distance;

    public Obstacle(double distance) {
        this.distance = distance;
    }

    public double getDistance() {
        return distance;
    }

    public boolean overcome(Participant participant) {
        var passedDistance = distance - getMaxDistance(participant);

        if (passedDistance <= 0) {
            printSuccessfulResult(participant);
        } else {
            printFailedResult(participant);
        }
        return passedDistance <= 0;
    }

    private void printSuccessfulResult(Participant participant) {
        var successfulResult = String.format("Participant %s has %s the obstacle %s at the distance %s",
                participant, getMovement(participant), this, distance);
        System.out.println(successfulResult);
    }

    private void printFailedResult(Participant participant) {
        var failedResult = String.format("Participant %s hasn't %s the obstacle %s at the distance %s. " +
                        "Passed only %s.",
                participant, getMovement(participant), this, distance, getMaxDistance(participant));
        System.out.println(failedResult);
    }

    public abstract double getMaxDistance(Participant participant);

    public abstract String getMovement(Participant participant);
}
