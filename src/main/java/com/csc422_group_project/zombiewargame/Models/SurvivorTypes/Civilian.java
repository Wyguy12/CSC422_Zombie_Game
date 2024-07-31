/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.csc422_group_project.zombiewargame.Models.SurvivorTypes;


/**
 * 
 * Civilian is a type of survivor that has a low health and low attack power
 * Extends the Survivor class
 * @author Wyatt 
 */
public class Civilian extends Survivor {


    /**
     * Constructor for Civilian
     * Initializes Civilian with 50 health and 5 attack power
     */
    public Civilian() {
        super(50, 5, "Civilian");
    }
}
