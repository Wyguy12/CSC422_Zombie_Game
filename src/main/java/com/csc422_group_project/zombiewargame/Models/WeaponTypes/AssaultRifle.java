/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.csc422_group_project.zombiewargame.Models.WeaponTypes;

import com.csc422_group_project.zombiewargame.Models.Weapon;

/**
 * Weapon sub class for assault rifle.
 * An assault rifle has a damage of 8 and an accuracy of .7
 * @author Carl Fredrickson
 */

public class AssaultRifle extends Weapon {
    private String name;

    public AssaultRifle() {
        super(8, 0.7);
        this.name = "assault rifle";
    }

    public String getName() {
        return name;
    }
}
