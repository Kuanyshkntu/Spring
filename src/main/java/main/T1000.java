package main;

import interfaces.Hand;
import interfaces.Head;
import interfaces.Leg;

public class T1000 extends Robot {
    private String color;
    private int weight;
    private int height;
    public T1000(String color,int weight,int height){
        this.color=color;
        this.weight = weight;
        this.height = height;
    }
    public T1000(){

    }
    public T1000(String color, int weight, int height, Hand hand, Head head, Leg leg){
        super(hand,head,leg);
        this.color=color;
        this.weight = weight;
        this.height = height;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getColor() {

        return color;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }
    public void action(){
     super.action();

        System.out.println("Color is"+color);
        System.out.println("Weight is"+weight);
        System.out.println("Height is"+height);
    }
}
