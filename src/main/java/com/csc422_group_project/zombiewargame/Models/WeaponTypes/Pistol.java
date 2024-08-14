/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.csc422_group_project.zombiewargame.Models.WeaponTypes;

import com.csc422_group_project.zombiewargame.Models.Weapon;

/**
 * Weapon sub class for pistol.
 * A pistol has a damage of 4 and an accuracy of .9
 * @author Carl Fredrickson
 */

public class Pistol extends Weapon {
    private String name;

    public Pistol() {
        super(4, 0.9);
        this.name = "pistol";
    }

    public String getName() {
        return name;
    }
}
