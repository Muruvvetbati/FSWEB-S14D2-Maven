package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        Lamp lamp  = new Lamp(LampType.LEON,true,100);
        Ceiling ceiling = new Ceiling(3, PaintColor.RED);
        Bed bed = new Bed("double",2,2,2,2);
        Wall northWall =  new Wall("north");
        Wall esthWall =  new Wall("east");
        Wall westhWall =  new Wall("west");
        Wall southWall =  new Wall("south");
        Wall[] walls = new Wall[]{northWall,esthWall,westhWall,southWall};


        Bedroom bedroom = new Bedroom(northWall,esthWall,westhWall,southWall,ceiling,lamp,new Carpet(3,5,PaintColor.WHITE),"bedromm1",bed,new Wardrobe(1,2,100));
        bedroom.createBedroom();
    }
}