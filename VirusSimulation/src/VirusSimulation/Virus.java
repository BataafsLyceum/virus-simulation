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

    public double Alpha;
    public double Bèta;
    public double Gamma;

    public Virus() {
            Alpha = 0;
            Bèta = 0.4;
            Gamma = 0.3;
    }

    public void infectSomeone(int howManyPeople) {
        for (int Number1 = 1; Number1 <= howManyPeople; Number1++) {
            int Number2 = (int) (10000 * Math.random());
            double Number3 = (Math.random());
            if (Number3 <= Virus1.Bèta) {
                VirusSimulation.World.People[Number2].Infected = true;
            }
        }
    }
}
