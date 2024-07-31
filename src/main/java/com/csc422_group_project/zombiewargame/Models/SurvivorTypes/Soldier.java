/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.csc422_group_project.zombiewargame.Models.SurvivorTypes;


/**
 * Soldier is a type of survivor that has a high health and high attack power
 * Extends the Survivor class
 * @author Wyatt
 */
public class Soldier extends Survivor {


    /**
     * Constructor for Soldier
     * Initializes Soldier with 100 health and 10 attack power
     */
    public Soldier() {
        super(100, 10, "Soldier");
    }
}
