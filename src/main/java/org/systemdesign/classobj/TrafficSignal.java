package org.systemdesign.classobj;

import static org.systemdesign.classobj.TrafficLights.*;

public class TrafficSignal {
    private TrafficLights light;
    public TrafficSignal(){
        light=TrafficLights.GREEN;
    }
    public void next(){
        switch (light){
            case GREEN: {
                display();
                light=YELLOW;
                break;
            }
            case YELLOW:{
                display();
                light=RED;
                break;
            }
            case RED:{
                display();
                light=GREEN;
                break;
            }
        }
    }

    public void display(){
        System.out.println(light.name());
    }

    public static void main(String[] args) {
        TrafficSignal signal=new TrafficSignal();
        signal.next();
        signal.next();
        signal.next();
        signal.next();
    }

}
