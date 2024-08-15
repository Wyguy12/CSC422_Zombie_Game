/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.csc422_group_project.zombiewargame.Models.SurvivorTypes;

import java.util.ArrayList;
import java.util.Random;

import com.csc422_group_project.zombiewargame.Models.Character;
import com.csc422_group_project.zombiewargame.Models.Weapon;
import com.csc422_group_project.zombiewargame.Models.WeaponTypes.AssaultRifle;
import com.csc422_group_project.zombiewargame.Models.WeaponTypes.Axe;
import com.csc422_group_project.zombiewargame.Models.WeaponTypes.Crowbar;
import com.csc422_group_project.zombiewargame.Models.WeaponTypes.FryingPan;
import com.csc422_group_project.zombiewargame.Models.WeaponTypes.Pistol;
import com.csc422_group_project.zombiewargame.Models.WeaponTypes.Shotgun;
import com.csc422_group_project.zombiewargame.Models.WeaponTypes.SubmachineGun;
/**
 * Abstract class for representing a Survivor in the game
 * This extends the Character class
 * This class contains the common properties and methods for all survivor types.
 * @author Wyatt 
 */ 
public abstract class Survivor extends Character {
    protected String survivorType; // Create a variable to store the type of survivor
    protected ArrayList<Weapon> weapons; // Create an ArrayList to store the collection of objects of type Weapon
    protected Weapon weaponChoice; // Create a variable to store the weapon choice
    private static final Random random = new Random(); // Create a new random object called random

    
    /**
     * @author Wyatt
     * Constructor for Survivor
     * @param healthBar The health of the survivor
     * @param attackPower The attack power of the survivor
     * @param survivorType The type of survivor
     */
    protected Survivor(int healthBar, int attackPower, String survivorType) {
        super(healthBar, attackPower); // Calls the constructor of the parent class
        this.survivorType = survivorType; // Sets the survivor type
        this.weaponChoice = randomlyGenerateWeaponChoice(); // Sets the weapon choice to a randomly generated weapon choice
    }                                                       // and instantiates the weaponChoice variable so that the survivor has a weapon at the start of the game.


    /**
     * @author Wyatt
     * Method to randomly generate a weapon choice for the survivor
     * It uses the Random class to generate a random number between 0 and 7
     * Then it will use that number to randomly select a weapon from the weapons ArrayList
     * @return The weapon choice
     */
    protected static Weapon randomlyGenerateWeaponChoice() {
        // Create a new ArrayList to store the collection of objects
        ArrayList<Weapon> weapons = new ArrayList<>();


        // Create instances of each type of weapon
        AssaultRifle assaultRifle = new AssaultRifle();
        Axe axe = new Axe();
        Crowbar crowbar = new Crowbar();
        FryingPan fryingPan = new FryingPan();
        Pistol pistol = new Pistol();
        Shotgun shotgun = new Shotgun();
        SubmachineGun submachineGun = new SubmachineGun();


        // Add the weapon instances to the the ArrayList
        weapons.add(assaultRifle);
        weapons.add(axe);
        weapons.add(crowbar);
        weapons.add(fryingPan);
        weapons.add(pistol);
        weapons.add(shotgun);
        weapons.add(submachineGun);

        
        int randomIndexPointer = random.nextInt(weapons.size()); // This will generate a random number between 0 and 7 and store it in the randomIndexPointer variable
        weapons.get(randomIndexPointer); // Returns the weapon choice by getting the weapon from the weapons ArrayList at the random index pointer variable
    

        return weapons.get(randomIndexPointer); // Returns the weapon choice by getting the weapon from the weapons ArrayList at the random index pointer
    }


    /**
     * @author Wyatt
     * This method will be used to attack a target character with the weapon choice
     * It will call the checkForHit method on the weapon choice to see if the attack hits
     * It will then call the receiveDamage method on the target and pass in the damage of the weapon choice
     * It prints out the attack results to the console
     * Else it will print out that the attack missed to the console
     * @param target The target character to attack
     * @return void It does not return anything
     */
    @Override // Overrides the attack method in the super class
    public void attack(Character target) {
        if (this.weaponChoice.checkForHit()) { // Calls the checkForHit method on the weapon choice
            target.receiveDamage(this.weaponChoice.getDamage()); // Calls the receiveDamage method on the target and passes in the damage of the weapon choice 
            System.out.println(this.survivorType + " attacked " + target.getClass().getSimpleName() + " with a " + this.weaponChoice.getClass().getSimpleName()); // Prints out the attack results
        } else {
            System.out.println(this.survivorType + " missed the attack with a " + this.weaponChoice.getClass().getSimpleName()); // Prints out that the attack missed
        }
    }

    
    /**
     * @author Wyatt
     * Gets the type of survivor
     * @return The type of survivor
     */
    public String getSurvivorType() {
        return survivorType; // Returns the survivor type
    }
}
