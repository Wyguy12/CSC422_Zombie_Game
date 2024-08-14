/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.csc422_group_project.zombiewargame.Models.WeaponTypes;

import com.csc422_group_project.zombiewargame.Models.Weapon;

/**
 * Weapon sub class for axe.
 * An axe has a damage of 9 and an accuracy of .5
 * @author Carl Fredrickson
 */

public class Axe extends Weapon {
    private String name;

    public Axe() {
        super(9, 0.5);
        this.name = "axe";
    }

    public String getName() {
        return name;
    }
}
