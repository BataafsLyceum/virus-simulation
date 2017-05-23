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
    
    public VirusSimulation.Person infectSomeone(VirusSimulation.Person[10000] People){
        int Number = (int) (10000 * Math.random());
        People[Number].State = 'i';
        return People;
    }
    
}
