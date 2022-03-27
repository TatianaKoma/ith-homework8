package ua.ithillel;

public class Wall extends Obstacle {

    public Wall(double distance) {
        super(distance);
    }

    @Override
    public double getMaxDistance(Participant participant) {
        return participant.getMaxHeightOfJumping();
    }

    @Override
    public String getMovement(Participant participant) {
        return participant.jump();
    }

    @Override
    public String toString() {
        return "Wall";
    }
}
