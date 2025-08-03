package org.example;


import javafx.scene.paint.Color;

import java.io.Serializable;

public class Location implements Serializable {
    public String name;
    public double capacity;
    public double la;
    public double lo;
    public Color color;

    public Location(String name,double capacity,double latitude,double longitude, Color color){
        this.name=name;
        this.capacity=capacity;
        this.la=latitude;
        this.lo=longitude;
        this.color=color;
    }
    public void printLocation(){
        System.out.println(name+" "+capacity+" "+la+" "+lo + " " );
    }
}
