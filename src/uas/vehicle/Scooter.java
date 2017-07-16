/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas.vehicle;
import uas.Runnable;
/**
 *
 * @author lukman
 */
public class Scooter extends Vehicle{
    public void getType(){
        System.out.println(super.getName()+" adalah kendaraan hiburan");
    }
    public void getRunWay(){
        System.out.println(super.getName()+" berjalan dengan roda 4");
    }
    public String toString(){
        return String.format("%s", super.getName());
    }
}
