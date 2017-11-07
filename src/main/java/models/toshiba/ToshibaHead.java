package models.toshiba;

import interfaces.Head;

public class ToshibaHead implements Head {
    public void calc() {
        System.out.println("Thinking about Toshiba!");
    }
    public void toshibaHeadInitM(){
        System.out.println("Tosiba Headd Init Method");
    }
    public void toshibaHeadDestroyMethod(){
        System.out.println("Tosiba Head Destroy Method");
    }
}
