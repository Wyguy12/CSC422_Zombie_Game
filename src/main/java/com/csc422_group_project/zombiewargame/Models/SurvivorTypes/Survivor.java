/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.csc422_group_project.zombiewargame.Models.SurvivorTypes;

import com.csc422_group_project.zombiewargame.Models.Character;

/**
 * Abstract class for the survivor
 * @author Wyatt 
 */ 
public abstract class Survivor extends Character {
    protected String survivorType;


    /**
     * Constructor for Survivor
     * @param healthBar The health of the survivor
     * @param attackPower The attack power of the survivor
     * @param survivorType The type of survivor
     */
    public Survivor(int healthBar, int attackPower, String survivorType) {
        super(healthBar, attackPower); // Calls the constructor of the parent class
        this.survivorType = survivorType; // Sets the survivor type
    }   


    /**
     * Gets the type of survivor
     * @return The type of survivor
     */
    public String getSurvivorType() {
        return survivorType; // Returns the survivor type
    }
}
