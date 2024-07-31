/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.csc422_group_project.zombiewargame.Models.SurvivorTypes;


/**
 * Scientist is a type of survivor that has a low health and low attack power
 * Extends the Survivor class
 * @author Wyatt
 */
public class Scientist extends Survivor {


    /**
     * Constructor for Scientist
     * Initializes Scientist with 20 health and 2 attack power
     */
    public Scientist() {
        super(20, 2, "Scientist");
    }
}
