package Project;

import java.util.Random;


public abstract class Plane {

    private Random random = new Random();
    private PlaneControl planeControl = new PlaneControl();
    private int maxSpeed;
    private String color;

    public Plane(){

    }

    public Plane(PlaneControl planeControl, int maxSpeed, String color) {
        this.planeControl = planeControl;
        this.maxSpeed = maxSpeed;
        this.color = color;
    }

    public PlaneControl getPlaneControl() {
        return planeControl;
    }

    public void setPlaneControl(PlaneControl planeControl) {
        this.planeControl = planeControl;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int startEngine(){
        return random.nextInt(89 - 20) + 20;
    }

    public int takeoffPlane(){
        return random.nextInt(1001);
    }

    public void landingPlane(){
        System.out.println("Plane landing");
    }




}
