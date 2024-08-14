/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.csc422_group_project.zombiewargame.Models.WeaponTypes;

import com.csc422_group_project.zombiewargame.Models.Weapon;

/**
 * Weapon sub class for crowbar.
 * A crowbar has a damage of 3 and an accuracy of .4
 * @author Carl Fredrickson
 */

public class Crowbar extends Weapon {
    private String name;

    public Crowbar() {
        super(3, 0.4);
        this.name = "crowbar";
    }

    public String getName() {
        return name;
    }
}
