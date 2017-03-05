package Project;

import java.util.Random;


public class Su27 extends Plane implements PlaneAbility {

    private Random random = new Random();

    public Su27(){

    }

    public Su27(PlaneControl planeControl, int maxSpeed, String color) {
        super(planeControl, maxSpeed, color);
    }

    @Override
    public void turboAcceleration() {

        System.out.println("Turbo acceleration " + random.nextInt((10000 - getMaxSpeed()) + getMaxSpeed()));

    }

    @Override
    public void stealthTechnology() {

        System.out.println("Stealth time " + random.nextInt(20) + " sec");

    }

    @Override
    public void nuclearStrike() {

        System.out.println("Nuclear strike " + (random.nextInt(11 - 1) + 1));

    }

}
