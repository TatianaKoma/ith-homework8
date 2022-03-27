package ua.ithillel;

public class Test {

    public static void main(String[] args) {
        Participant human = new Human(100, 2);
        Participant robot = new Robot(10, 1);
        Participant cat = new Cat(50, 1.5);
        Participant[] participants = {human, robot, cat};

        Obstacle wall = new Wall(1.5);
        Obstacle treadmill = new Treadmill(100);
        Obstacle[] obstacles = {treadmill, wall};

        for (Participant participant : participants) {
            participant.overcomeObstacles(obstacles);
        }
    }
}
