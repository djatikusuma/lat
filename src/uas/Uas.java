/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas;

import uas.animal.Dog;
import uas.vehicle.Scooter;

/**
 *
 * @author lukman
 */
public class Uas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scooter scooter = new Scooter();
        scooter.setName("scooter");
        Dog dog = new Dog(scooter.toString());
        
        dog.setName("Anjing");
        dog.getRunWay();
        dog.speak();
        
        
        scooter.getType();
        
        System.out.println(dog.toString());
    }
    
}
