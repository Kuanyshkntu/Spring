package models.toshiba;

import interfaces.Hand;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ToshibaHand implements Hand,InitializingBean,DisposableBean {
    public void catchSomething() {
        System.out.println("Catched from Toshiba!");
    }

    public void toshibaHandInit(){
        System.out.println("Tosiba Hand Init Method");
    }
    public void toshibaHandDestroy(){
        System.out.println("Tosiba Hand Destroy Method");
    }
    public void destroy() throws Exception {

        System.out.println("Disposible Bean: ToshibaHand will destroy ");
    }

    public void afterPropertiesSet() throws Exception {

        System.out.println("InitializingBean afterPropertiesSet: ToshibaHand has inited");
    }
}
