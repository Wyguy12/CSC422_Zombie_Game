/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.csc422_group_project.zombiewargame.Models.WeaponTypes;

import com.csc422_group_project.zombiewargame.Models.Weapon;

/**
 * Weapon sub class for submachine gun.
 * A submachine gun has a damage of 5 and an accuracy of .7
 * @author Carl Fredrickson
 */

public class SubmachineGun extends Weapon {
    private String name;

    public SubmachineGun() {
        super(5, 0.7);
        this.name = "submachine gun";
    }

    public String getName() {
        return name;
    }
}
