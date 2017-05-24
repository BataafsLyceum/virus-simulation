/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package VirusSimulation;

/**
 *
 * @author 010918
 */
public class Virus {

    public static void infectSomeone(int howManyPeople, double Chance) {
        for (int Number1 = 1; Number1 <= howManyPeople; Number1++) {
            int Number2 = (int) (10000 * Math.random());
            double Number3 = (Math.random());
            if (Number3 <= Chance) {
                VirusSimulation.World.People[Number2].State = 'i';
            }
        }

    }
}
