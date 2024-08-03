/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.csc422_group_project.zombiewargame;
import com.csc422_group_project.zombiewargame.Models.SurvivorTypes.Civilian;
import com.csc422_group_project.zombiewargame.Models.SurvivorTypes.Scientist;
import com.csc422_group_project.zombiewargame.Models.SurvivorTypes.Soldier;
import com.csc422_group_project.zombiewargame.Models.SurvivorTypes.Survivor;
import com.csc422_group_project.zombiewargame.Models.ZombieTypes.CommonInfected;
import com.csc422_group_project.zombiewargame.Models.ZombieTypes.Tank;
import com.csc422_group_project.zombiewargame.Models.ZombieTypes.Zombie;
import java.util.ArrayList;
import java.util.Random;

/* This is the main class of the zombie war program.
 * The program generates groups of zombies and survivors,
 * then simulates combat between the groups until all
 * zombies or all survivors are dead. Then the program
 * displays the results.
 *
 * @author Carl Fredrickson
 * 
 * Release 1.0 - Aug 1, 2024
 *      Wrote methods to generate survivors and zombies, simulate combat, and display simple results.
 *      Wrote methods to help with debugging.
 */

public class Main {
    
    private final static int MIN_SURVIVOR_COUNT = 5;
    private final static int MAX_SURVIVOR_COUNT = 30;
    private final static int MIN_ZOMBIE_COUNT = 2;
    private final static int MAX_ZOMBIE_COUNT = 10;
    
    private static ArrayList<Survivor> survivors;
    private static ArrayList<Zombie> zombies;
    
    private final static double RELEASE = 1.0;
    private final static boolean DISPLAY_DEBUG_INFO = false;
    
    
    public static void main(String[] args) {
        System.out.println("*** Zombie War ***");
        
        // Generate arrays of survivors and zombies.
        survivors = GenerateSurvivors(); 
        zombies = GenerateZombies();
        DisplaySetup(RELEASE);
        
        if (DISPLAY_DEBUG_INFO) {
            PrintSurvivors();
            PrintZombies();
        }
        
        // Simulate combat between the survivors and zombies until one group is wiped out.
        SimulateWar();
        
        // Display the results.
        DisplayResults(RELEASE);
        
        if (DISPLAY_DEBUG_INFO) {
            PrintSurvivors();
            PrintZombies();
        }
    }
    
    // This method creates a random array of survivors.
    private static ArrayList<Survivor> GenerateSurvivors() {
        ArrayList<Survivor> newSurvivors = new ArrayList<>();
        
        // Randomly determine the number of survivors.
        Random rand = new Random();
        int thisSurvivorCount = rand.nextInt(MAX_SURVIVOR_COUNT - MIN_SURVIVOR_COUNT + 1) + MIN_SURVIVOR_COUNT;
        
        // Add survivors to the array.
        for (int i = 0; i < thisSurvivorCount; i++) {
            // Randomly determine the type of survivor to add.
            int thisType = rand.nextInt(3);
            switch (thisType) {
                case 0:
                    // Add a civilian.
                    newSurvivors.add(new Civilian());
                    break;
                    
                case 1:
                    // Add a scientist.
                    newSurvivors.add(new Scientist());
                    break;
                    
                case 2:
                    // Add a soldier.
                    newSurvivors.add(new Soldier());
                    break;
                    
                default:
                    break;
            }            
        }
        
        return newSurvivors;
    }
    
    // This method creates a random array of zombies.
    private static ArrayList<Zombie> GenerateZombies() {
        ArrayList<Zombie> newZombies = new ArrayList<>();
        
        // Randomly determine the number of survivors.
        Random rand = new Random();
        int thisZombieCount = rand.nextInt(MAX_ZOMBIE_COUNT - MIN_ZOMBIE_COUNT + 1) + MIN_ZOMBIE_COUNT;
        
        // Add survivors to the array.
        for (int i = 0; i < thisZombieCount; i++) {
            // Randomly determine the type of survivor to add.
            int thisType = rand.nextInt(2);
            switch (thisType) {
                case 0:
                    // Add a civilian.
                    newZombies.add(new CommonInfected());
                    break;
                    
                case 1:
                    // Add a scientist.
                    newZombies.add(new Tank());
                    break;
                    
                default:
                    break;
            }            
        }
        
        return newZombies;
    }
    
    // This method displays the number of survivors and zombies that were generated.
    public static void DisplaySetup(double release) {
        System.out.println();
        
        if (release == 1.0) {
            System.out.println("We have " + survivors.size() + " survivors trying to make it to safety.");
            System.out.println("But there are " + zombies.size() + " zombies waiting for them.");
        }
    }
    
    // This method executes rounds alternating between the survivors attacking the zombies
    // and the zombies attacking the survivors until either all zombies or survivors are wiped out.
    private static void SimulateWar() {
        // Create a variable to keep track of the number of rounds.
        int round = 1;
        
        // Loop until all zombies or all survivors are dead.
        do {
            if (DISPLAY_DEBUG_INFO) {
                System.out.println();
                System.out.println("Round " + round + " - Survivors' Turn");
            }
        
            // Loop through each survivor.
            for (int s = 0; s < survivors.size(); s++) {
                Survivor thisSurvivor = survivors.get(s);
                if (thisSurvivor.isAlive()) {
                    // Attack each zombie.
                    for (int z = 0; z < zombies.size(); z++) {                    
                        Zombie thisZombie = zombies.get(z);
                        // Only attack the zombie if it isn't already dead.
                        if (thisZombie.isAlive()) {
                            thisSurvivor.attack(thisZombie);

                            if (RELEASE == 2.0) {
                                if (!thisZombie.isAlive()) {
                                    System.out.println(thisSurvivor.getSurvivorType() + " " + (s + 1) + " killed " + thisZombie.getZombieType() + " " + (z + 1));
                                }
                            }

                            if (DISPLAY_DEBUG_INFO) {
                                System.out.println("Survivor " + (s + 1) + " attacked Zombie " + (z + 1) + " | Zombie health remaining: " + thisZombie.getHealth());
                            }
                        }
                        else {
                            if (DISPLAY_DEBUG_INFO) {
                                System.out.println("Survivor " + (s + 1) + " did not attack Zombie " + (z + 1) + " because this zombie is already dead.");
                            }
                        }
                    }
                }
            }
            
            if (DISPLAY_DEBUG_INFO) {
                System.out.println();
                System.out.println("Round " + round + " - Zombies' Turn");
            }
            
            // Loop through each zombie.
            for (int z = 0; z < zombies.size(); z++) {
                Zombie thisZombie = zombies.get(z);
                if (thisZombie.isAlive()) {
                    // Attack each survivor.
                    for (int s = 0; s < survivors.size(); s++) {                    
                        Survivor thisSurvivor = survivors.get(s);
                        // Only attack the survivor if it isn't already dead.
                        if (thisSurvivor.isAlive()) {
                            thisZombie.attack(thisSurvivor);

                            if (RELEASE == 2.0) {
                                if (!thisSurvivor.isAlive()) {
                                    System.out.println(thisZombie.getZombieType() + " " + (z + 1) + " killed " + thisSurvivor.getSurvivorType() + " " + (s + 1));
                                }
                            }

                            if (DISPLAY_DEBUG_INFO) {
                                System.out.println("Zombie " + (z + 1) + " attacked Survivor " + (s + 1) + " | Survivor health remaining: " + thisSurvivor.getHealth());
                            }
                        }
                        else {
                            if (DISPLAY_DEBUG_INFO) {
                                System.out.println("Zombie " + (z + 1) + " did not attack Survivor " + (s + 1) + " because this survivor is already dead.");
                            }
                        }
                    }
                }
            }
            
            // Increment the round.
            round++;
            
            if (DISPLAY_DEBUG_INFO) {
                System.out.println("Zombies remaining: " + ZombiesRemaining());
                System.out.println("Survivors remaining: " + SurvivorsRemaining());
            }
        }
        while (ZombiesRemaining() > 0 && SurvivorsRemaining() > 0);
    }
    
    // This method counts the number of zombies who are still alive.
    private static int ZombiesRemaining() {
        int remaining = zombies.size();
        
        // Reduce the number remaining by 1 for each dead zombie.
        for (Zombie z : zombies) {
            if (!z.isAlive()) remaining--;
        }
        return remaining;
    }
    
    // This method counts the number of survivors who are still alive.
    private static int SurvivorsRemaining() {
        int remaining = survivors.size();
        
        // Reduce the number remaining by 1 for each dead survivor.
        for (Survivor s : survivors) {
            if (!s.isAlive()) remaining--;
        }
        return remaining;
    }
    
    // This method displays the results of the combat.
    private static void DisplayResults(double release) {
        System.out.println();
        
        if (release == 1.0) {
            if (SurvivorsRemaining() > 0) {
                System.out.println(SurvivorsRemaining() + " survivors made it to safety.");
            }
            else {
                System.out.println("None of the survivors made it to safety.");
            }
        }
    }
    
    // This method displays information for all survivors in the array.
    private static void PrintSurvivors() {
        System.out.println();
        System.out.println("Survivors: (" + survivors.size() +")");
        for (int i = 0; i < survivors.size(); i++) {
            System.out.println("Survivor " + (i + 1) + " | type: " + survivors.get(i).getSurvivorType() + " | alive?: " + survivors.get(i).isAlive());
        }
    }
    
    // This method displays information for all zombies in the array.
    private static void PrintZombies() {
        System.out.println();
        System.out.println("Zombies: (" + zombies.size() + ")");
        for (int i = 0; i < zombies.size(); i++) {
            System.out.println("Zombie " + (i + 1) + " | type: " + zombies.get(i).getZombieType() + " | alive?: " + zombies.get(i).isAlive());
        }
    }
}
