package Project;

import java.util.Random;


public class PlaneControl {

    private Random random = new Random();

    private int length;
    private int width;
    private int weight;

    public PlaneControl(){

    }

    public PlaneControl(int length, int width, int weight) {
        this.length = length;
        this.width = width;
        this.weight = weight;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }




    public int moveUp(){
        return random.nextInt(10);
    }

    public int moveDown(){
        return random.nextInt(10);
    }

    public int moveForward(){
        return random.nextInt(10);
    }

    public int moveBack(){
        return random.nextInt(10);
    }




}
