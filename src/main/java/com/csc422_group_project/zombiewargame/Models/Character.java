/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.csc422_group_project.zombiewargame.Models;

/**
 *
 * @author 
 */
public class Character {
    protected int healthBar;
    protected int attackPower;

    //Constructor
    public Character(int healthBar, int attackPower) {
        this.healthBar = healthBar;
        this.attackPower = attackPower;
    }

    //Damage opponent
    public void attack(Character target) {
        target.receiveDamage(this.attackPower);
    }

    //Receive damage
    public void receiveDamage(int damage) {
        this.healthBar -= damage;
    }

    //Check if Character is alive
    public boolean isAlive() {
        return this.healthBar > 0;
    }
}
