/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.csc422_group_project.zombiewargame.Models.ZombieTypes;


/**
 *
 * @author 
 */

public abstract class Zombie extends Character {
    protected String zombie;
    
    //Construct Zombie
    public Zombie(int healthBar, int attackPower, String zombie) {
        super(healthBar, attackPower);
        this.zombie = zombie;
    }
    
    //Getter for zombie type
    public String getZombieType() {
        return zombie;
    }
}
