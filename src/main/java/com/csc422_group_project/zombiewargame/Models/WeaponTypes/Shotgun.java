/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.csc422_group_project.zombiewargame.Models.WeaponTypes;

import com.csc422_group_project.zombiewargame.Models.Weapon;

/**
 * Weapon sub class for shotgun.
 * A shotgun has a damage of 10 and an accuracy of .4
 * @author Carl Fredrickson
 */

public class Shotgun extends Weapon {
    private String name;

    public Shotgun() {
        super(10, 0.4);
        this.name = "shotgun";
    }

    public String getName() {
        return name;
    }
}
