package Project;


public class Main {
    public static void main(String[] args) {
        Su27 su27 = new Su27();
        su27.setMaxSpeed(2000);

        System.out.println("Start engine " + su27.startEngine());
        System.out.println("Plane take off " + su27.takeoffPlane());
        System.out.println("Move up " + su27.getPlaneControl().moveUp() + ", move down " + su27.getPlaneControl().moveDown()
                + ", move forward " + su27.getPlaneControl().moveForward() + ", move back " + su27.getPlaneControl().moveBack());
        su27.stealthTechnology();
        su27.nuclearStrike();
        su27.turboAcceleration();
        su27.landingPlane();

    }


}
