/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package VirusSimulation;

/**
 *
 * @author 010918
 */
public class World {

    /**
     * @param args the command line arguments
     */
    
   static VirusSimulation.Person People[] = new VirusSimulation.Person[10000];
    
    public static void main(String[] args) {
        // TODO code application logic here
        for (int number = 0; number < 10000; number++){
            People[number] = new VirusSimulation.Person(number);
        }
        System.out.print(People[33].Age);
        System.out.print(People[924].Gender);
    }
}
