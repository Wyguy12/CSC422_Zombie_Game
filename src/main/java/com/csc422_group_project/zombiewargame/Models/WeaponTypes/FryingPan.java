/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.csc422_group_project.zombiewargame.Models.WeaponTypes;

import com.csc422_group_project.zombiewargame.Models.Weapon;

/**
 * Weapon sub class for frying pan.
 * A frying pan has a damage of 1 and an accuracy of .5
 * @author Carl Fredrickson
 */

public class FryingPan extends Weapon {
    private String name;

    public FryingPan() {
        super(1, 0.5);
        this.name = "frying pan";
    }

    public String getName() {
        return name;
    }
}
