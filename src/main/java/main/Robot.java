package main;

import interfaces.Hand;
import interfaces.Head;
import interfaces.Leg;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Robot implements InitializingBean,DisposableBean {
    private Hand hand;
    private Leg leg;
    private Head head;
    public void destroy() throws Exception{
        System.out.println("Robot will destroyed");
    }
    public void afterPropertiesSet() throws Exception {
        System.out.println("After Properties set: Robot was initialized");
    }
    public Robot(Hand hand,Head head,Leg leg){
        this.hand=hand;
        this.head=head;
        this.leg=leg;
    }
    public Robot(){

    }
    public void action(){
        head.calc();
        hand.catchSomething();
        leg.go();

    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Hand getHand() {

        return hand;
    }

    public Leg getLeg() {
        return leg;
    }

    public Head getHead() {
        return head;
    }
}
