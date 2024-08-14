/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.csc422_group_project.zombiewargame.Models;

/**
 * Super class for weapons.
 * @author Carl Fredrickson
 */

public class Weapon {
    protected int damage;
    protected double accuracy;

    public Weapon(int damage, double accuracy) {
        this.damage = damage;
        this.accuracy = accuracy;
    }

    public int getDamage() {
        return damage;
    }

    public double getAccuracy() {
        return accuracy;
    }
    
    // This method returns true if the weapon hits or false if it doesn't.
    // A random number between 0 and 1 is generated. If the number is 
    // lower than the accuracy of the weapon, then the weapon hits.
    public boolean checkForHit() {
        return Math.random() <= this.accuracy;
    }
}
