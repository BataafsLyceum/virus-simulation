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
        startVirusSimulation();
        countInfected(0);
        for (int number = 1; number <= 100; number++) {
            haveANewDay();
            countInfected(number);
        }
        
        
    }

    public static void startVirusSimulation(){
        for (int number = 0; number < 10000; number++) {
            People[number] = new VirusSimulation.Person(number);
        }
        VirusSimulation.Virus.infectSomeone(1, 1);
    }
    
    public static void haveANewDay() {
        for (int number = 0; number < 10000; number++) {
            if (People[number].State == 'i') {
                VirusSimulation.Virus.infectSomeone(50, 0.6);
            }
        }
    }

    public static void countInfected(int day) {
        int[] Count = new int[3];
        for (int number = 0; number < 10000; number++) {
            if (People[number].State == 's') {
                Count[0]++;
            }
            if (People[number].State == 'i') {
                Count[1]++;
            }
            if (People[number].State == 'r') {
                Count[2]++;
            }
        }
        System.out.println(day);
        System.out.println("s  " + Count[0]);
        System.out.println("i  " + Count[1]);
        System.out.println("r  " + Count[2]);
    }
}
