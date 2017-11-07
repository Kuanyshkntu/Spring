package models.toshiba;

import interfaces.Leg;

public class ToshibaLeg implements Leg {
    public void go() {
        System.out.println("Go to Toshiba!");
    }
    public void toshibaLegInitMethod(){
        System.out.println("Tosiba Leg Init Method");
    }
    public void toshibaLegDestroyMethod(){
        System.out.println("Tosiba Leg Destroy Method");
    }
}
