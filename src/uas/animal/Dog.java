/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas.animal;
import uas.Runnable;
import uas.vehicle.Scooter;
/**
 *
 * @author lukman
 */
public class Dog extends Animal implements Runnable{

    private String scooter;

    public Dog(String scooter) {
        this.scooter = scooter;
    }
    @Override
    public void getRunWay(){
        System.out.println(super.getName()+" berjalan dengan kaki");
    }
    @Override
    public void speak(){
        System.out.println(super.getName()+" mengonggong");
    }
    @Override
    public String toString(){
        return String.format("%s naik %s", super.getName(), scooter);
    }
}

